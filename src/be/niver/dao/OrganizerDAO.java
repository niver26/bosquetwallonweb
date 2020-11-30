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

public class OrganizerDAO extends PersonDAO {

	public OrganizerDAO(Connection conn) {
		super(conn);
		
	}
	
	@Override
	public boolean create(Person person) {
		boolean result = false;
		Organizer obj = (Organizer) person ;
		try {
			
			// Insert person
			boolean result1 =  super.create(person);
			
			// recuperer la derniere personne enregistré
			Person p = super.login(person.getE_Mail(), person.getPassWord());

			result = updateStatement(String.format("INSERT INTO Organizer VALUES ( %s)",  
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

			result = updateStatement(String.format("DELETE FROM Organizer "
					+ " WHERE IDPerson_Organizer_fk= %s",  
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
	public Organizer find(int id) {
		Organizer organizer = new Organizer();
		try {
					PreparedStatement ps = connect.prepareStatement(String.format("SELECT * FROM Person INNER JOIN Organizer "
							+ "ON IDPerson_Organizer_fk =IDPerson WHERE IDPerson_Organizer_fk = ?"));
					ps.setInt(1, id); 
		            ResultSet result = ps.executeQuery();
		            while (result.next()) {
				organizer = new Organizer(id, result.getString("FirstName"), result.getString("LastName"),
						result.getString("Adress"),	result.getString("E_Mail"),result.getString("PassWord"),result.getInt("role"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return organizer; 
	}
	
	@Override
	public ArrayList<Person> findAll( ) {
		ArrayList<Person> persons = new ArrayList<Person>();
		try {
			PreparedStatement ps = connect.prepareStatement(String.format("SELECT * FROM Organizer "
					+ " INNER JOIN Person ON IDPerson_Organizer_fk =IDPerson "), 
					ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);  
            ResultSet result = ps.executeQuery();  
            
			while (result.next()) {
				Organizer organizer = new Organizer(result.getInt("IDPerson_Organizer_fk"), result.getString("FirstName"), result.getString("LastName"),
						result.getString("Adress"),	result.getString("E_Mail"),result.getString("PassWord"),result.getInt("role"));
				persons.add(organizer);
			}
		
		
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return persons;
	}
	
	@Override
	public Organizer login(String email, String password ) {
		var p = super.login(email, password);
		return find(p.getIDperson());
	}

}
