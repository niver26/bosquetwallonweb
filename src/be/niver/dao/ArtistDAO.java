package be.niver.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;



import be.niver.bosquetwallonweb.*;

public class ArtistDAO extends PersonDAO{
	
	public ArtistDAO(Connection conn) {
		super(conn);
	}

	@Override
	public boolean create(Person person) {
		boolean result = false;
		Artist obj = (Artist) person ;
		try {
			
			// Insert person
			boolean result1 =  super.create(person);
			
			// recuperer la derniere personne enregistré
			Person p = super.login(person.getE_Mail(), person.getPassWord());
			System.out.println("person login is : "+p);

			result = updateStatement(String.format("INSERT INTO Artist VALUES ( %s, %s, '%s' )",  
					p.getIDperson(),
					obj.getShowArtiste().getIDShow(),
					obj.getSpeciality()));  
			
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

			result = updateStatement(String.format("DELETE FROM Artist "
					+ " WHERE IDPerson_Artiste_fk= %s",  
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
		
		boolean result = false;
		try {
			boolean result1 =super.update(person);
			 Artist obj = (Artist) person;
			result = updateStatement(String.format("UPDATE  Artist "
					+ "SET show_Artiste_fk = %s, speciality = '%s'"
					+ " WHERE IDPerson_Artiste_fk= %s",  
					obj.getShowArtiste().getIDShow(),
					obj.getSpeciality(),
					obj.getIDPerson_Artiste_fk()
					));  
			
			System.out.println("update artist is "+ result);
		result = result && result1;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	@Override
	public Artist login(String email, String password ) {
		var p = super.login(email, password);
		return find(p.getIDperson());
	}
	
	@Override
	public Artist find(int id) {
		Artist artist = new Artist();
		try {
			ResultSet result = this.connect
					.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY).executeQuery(
							"SELECT * FROM Artist INNER JOIN Person as p on  IDPerson_Artiste_fk =  p.IDPerson  "
													+ "INNER JOIN Show as s on show_Artiste_fk = s.IDShow "
													+ "INNER JOIN Representation as r on s.representation_show_fk= r.IDRepresentation "
													+ "INNER JOIN PlanningOfRoom as p on s.planning_show_fk= p.IDplanningOfRoom "
													+ "INNER JOIN Organizer as o on s.organizer_show_fk= o.IDPerson_Organizer_fk "
													+ "where IDPerson_Artiste_fk = " + id );
			
			if (result.first()) {
				//System.out.println(result);
				Representation representation = new Representation();
				PlanningOfRoom planning = new PlanningOfRoom();
				Organizer organizer = new Organizer();
				Show show = new Show(result.getInt("IDShow"),result.getString("title"),representation,planning,organizer);
				artist = new Artist(id, result.getString("FirstName"), result.getString("LastName"),
						result.getString("Adress"),	result.getString("E_Mail"),result.getString("PassWord"), result.getInt("role"),
						show, result.getString("speciality"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return artist;
	}

	@Override
	public ArrayList<Person> findAll() {
		ArrayList<Person> persons = new ArrayList<>();
		try {
			PreparedStatement ps = connect.prepareStatement(String.format("SELECT * FROM Artist INNER JOIN Person as p on  IDPerson_Artiste_fk =  p.IDPerson  "
					+ "INNER JOIN Show as s on show_Artiste_fk = s.IDShow "
					+ "INNER JOIN Representation as r on s.representation_show_fk= r.IDRepresentation "
					+ "INNER JOIN PlanningOfRoom as p on s.planning_show_fk= p.IDplanningOfRoom "
					+ "INNER JOIN Organizer as o on s.organizer_show_fk= o.IDPerson_Organizer_fk "), 
					ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);  
            ResultSet result = ps.executeQuery();  
            Artist artist = new Artist();
			while (result.next()) {
				Representation representation = new Representation();
				PlanningOfRoom planning = new PlanningOfRoom();
				Organizer organizer = new Organizer();
				Show show = new Show(result.getInt("IDShow"),result.getString("title"),representation,planning,organizer);
				artist = new Artist(result.getInt("IDPerson_Artiste_fk"), result.getString("FirstName"), result.getString("LastName"),
						result.getString("Adress"),	result.getString("E_Mail"),result.getString("PassWord"), result.getInt("role"),
						show, result.getString("speciality"));
				persons.add(artist);
			}
		
		
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return persons;
	}
	
	
}
