package be.niver.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import be.niver.bosquetwallonweb.*;

public class ArtistDAO extends DAO<Artist> {
	
	public ArtistDAO(Connection conn) {
		super(conn);
	}

	public boolean create(Artist obj) {
		return false;
	}

	public boolean delete(Artist obj) {
		return false;
	}

	public boolean update(Artist obj) {
		return false;
	}
	
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
				Person person = new Person();
				Representation representation = new Representation();
				PlanningOfRoom planning = new PlanningOfRoom();
				Organizer organizer = new Organizer();
				Show show = new Show(result.getInt("IDShow"),result.getString("title"),representation,planning,organizer);
				artist = new Artist(id, result.getString("FirstName"), result.getString("LastName"),
						result.getString("Adress"),	result.getString("E_Mail"),result.getString("PassWord"),
						result.getInt("creditCartNumber"),result.getDouble("creditCartBalance"), 
						result.getInt("cartPassCode"),show, result.getString("speciality"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return artist;
	}
}
