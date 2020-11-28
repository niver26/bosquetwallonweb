package be.niver.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import be.niver.bosquetwallonweb.Artist;
import be.niver.bosquetwallonweb.Organizer;
import be.niver.bosquetwallonweb.Person;
import be.niver.bosquetwallonweb.RoomManager;
import be.niver.bosquetwallonweb.Spectator;

public class RoomManagerDAO extends PersonDAO {

	public RoomManagerDAO(Connection conn) {
		super(conn);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean create(Person person) {
		boolean result = false;
		try {
			
			// Insert person
			boolean result1 =  super.create(person);
			
			// recuperer la derniere personne enregistré
			Person p = super.login(person.getE_Mail(), person.getPassWord());

			result = updateStatement(String.format("INSERT INTO RoomManager VALUES ( %s)",  
					p.getIDperson()));  
			
			result = result && result1;
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
		
	}

	@Override
	public boolean delete(Person obj) {
		boolean result = false;
		try {

			result = updateStatement(String.format("DELETE FROM RoomManager "
					+ " WHERE IDPerson_RoomManager_fk= %s",  
					obj.getIDperson()
					));  
			
			// delete person
			boolean result1 = super.delete(obj);
			result = result && result1;
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public boolean update(Person person) {
		return super.update(person);
	}

	@Override
	public RoomManager find(int id) {
		RoomManager roomManager = new RoomManager();
		try {
					PreparedStatement ps = connect.prepareStatement("SELECT * FROM Person INNER JOIN RoomManager ON IDPerson_RoomManager_fk =IDPerson  WHERE IDPerson_RoomManager_fk = ?"); 
					ps.setInt(1, id);
		            ResultSet result = ps.executeQuery();
			
			
			while (result.next()) {
				roomManager = new RoomManager(id, result.getString("FirstName"), result.getString("LastName"),
						result.getString("Adress"),	result.getString("E_Mail"),result.getString("PassWord"),result.getInt("role"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return roomManager; 
	}

	@Override
	public ArrayList<Person> findAll( ) {
		ArrayList<Person> persons = new ArrayList<>();
		try {
			PreparedStatement ps = connect.prepareStatement(String.format("SELECT * FROM RoomManager "
					+ "INNER JOIN Person as p on  IDPerson_RoomManager_fk =  p.IDPerson  "), 
					ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);  
            ResultSet result = ps.executeQuery();  
            RoomManager roomManager = new RoomManager();
			while (result.next()) {
				roomManager = new RoomManager(result.getInt("IDPerson_RoomManager_fk"), result.getString("FirstName"), result.getString("LastName"),
						result.getString("Adress"),	result.getString("E_Mail"),result.getString("PassWord"),result.getInt("role"));
				persons.add(roomManager);
			}
		
		
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return persons;
	}
	
	
	@Override
	public RoomManager login(String email, String password ) {
		var p = super.login(email, password);
		return find(p.getIDperson());
	}
	

}
