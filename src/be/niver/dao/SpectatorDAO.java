package be.niver.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import be.niver.bosquetwallonweb.Artist;
import be.niver.bosquetwallonweb.Organizer;
import be.niver.bosquetwallonweb.Person;
import be.niver.bosquetwallonweb.PlanningOfRoom;
import be.niver.bosquetwallonweb.Representation;
import be.niver.bosquetwallonweb.RoomManager;
import be.niver.bosquetwallonweb.Show;
import be.niver.bosquetwallonweb.Spectator;

public class SpectatorDAO extends PersonDAO{

	public SpectatorDAO(Connection conn) {
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
			Person p = super.findByEmail(person.getE_Mail());

			result = updateStatement(String.format("INSERT INTO Spectator VALUES ( %s)",  
					p.getIDperson()));  
			
			result = result && result1;
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	
	@Override
	public boolean update(Person person) {
		boolean result = false;
		try {
			boolean result1 =super.update(person);
			Spectator obj = (Spectator) person;
			result = updateStatement(String.format("UPDATE  Spectator "
					+ " WHERE IDPerson_fk= %s",  
					obj.getIDPerson_fk()
					));  
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

			result = updateStatement(String.format("DELETE FROM Spectator "
					+ " WHERE IDPerson_fk= %s",  
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
	public Spectator find(int id) {
		Spectator spectator = new Spectator();
		try {
					PreparedStatement ps = connect.prepareStatement(String.format("SELECT * FROM Person INNER JOIN Spectator on  IDPerson_fk = IDPerson WHERE IDPerson_fk = ?")); 
					ps.setInt(1, id); 
		            ResultSet result = ps.executeQuery();
			
			
			while (result.next()) {
				spectator = new Spectator(id, result.getString("FirstName"), result.getString("LastName"),
						result.getString("Adress"),	result.getString("E_Mail"),result.getString("PassWord"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return spectator;
	}
	
	@Override
	public ArrayList<Person> findAll( ) {
		
		ArrayList<Person> persons = new ArrayList<>();
		try {
			PreparedStatement ps = connect.prepareStatement(String.format("SELECT * FROM Spectator "
					+ "INNER JOIN Person as p on  IDPerson_fk =  p.IDPerson  "), 
					ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);  
            ResultSet result = ps.executeQuery();  
            Spectator spectator = new Spectator();
			while (result.next()) {
				spectator = new Spectator(result.getInt("IDPerson_fk"), result.getString("FirstName"), result.getString("LastName"),
						result.getString("Adress"),	result.getString("E_Mail"),result.getString("PassWord"));
				persons.add(spectator);
			}
		
		
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return persons;
	}


}
