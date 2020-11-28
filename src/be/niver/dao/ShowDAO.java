package be.niver.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import be.niver.bosquetwallonweb.Organizer;
import be.niver.bosquetwallonweb.PlanningOfRoom;
import be.niver.bosquetwallonweb.Representation;
import be.niver.bosquetwallonweb.Show;
import be.niver.bosquetwallonweb.Show;

public class ShowDAO extends DAO<Show> {

	public ShowDAO(Connection conn) {
		super(conn);
	}
	
	@Override
	public boolean create(Show obj) { 
		boolean result = false;
		try {
			result = updateStatement(String.format("INSERT INTO Show VALUES ( 0 ,'%s',%s, %s, %s)",  
					obj.getTitle(),
					obj.getRepresentation_show_fk().getIDRepresentation(),
					obj.getPlanning_show_fk().getIDplanningOfRoom(),
					obj.getOrganizer_show_fk().getIDPerson_Organizer_fk()
					));  
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public boolean delete(Show obj) {
		boolean result = false;
		try {

			result = updateStatement(String.format("DELETE FROM Show "
					+ " WHERE IDShow= %s",  
					obj.getIDShow()
					));  
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public boolean update(Show obj) {
		
		boolean result = false;
		try {
			result = updateStatement(String.format("UPDATE  Show "
					+ "SET title = '%s', representation_show_fk = %s, planning_show_fk= %s , Organizer_show_fk = %s "
					+ " WHERE IDShow = %s", 
					obj.getTitle(),
					obj.getRepresentation_show_fk().getIDRepresentation(),
					obj.getPlanning_show_fk().getIDplanningOfRoom(),
					obj.getOrganizer_show_fk().getIDPerson_Organizer_fk(),
					obj.getIDShow()
					));  
			//System.out.println("update Show is "+ result);
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
		
	}

	@Override
	public Show find(int id) {
		 
		
		Show obj = new Show();
		try {
			ResultSet result = this.connect
					.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)
					.executeQuery("SELECT * FROM Show as S "
							+ " INNER JOIN Representation as R on S.representation_show_fk= R.IDRepresentation "
							+ " INNER JOIN PlanningOfRoom as P on S.planning_show_fk= P.IDplanningOfRoom "
							+ " INNER JOIN Organizer as O on S.Organizer_show_fk= O.IDPerson_Organizer_fk "
							+ " WHERE IDShow = " + id);
		
			if (result.first())
			{

				Representation  representation = new Representation(result.getInt("IDRepresentation"));
				PlanningOfRoom planningOfRoom = new PlanningOfRoom(result.getInt("IDplanningOfRoom"));
				Organizer Organizer = new Organizer(result.getInt("IDPerson_Organizer_fk"));
				obj = new Show(id, result.getString("title"),representation, planningOfRoom, Organizer);
				
			}
		
	
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return obj;
	}

	@Override
	public ArrayList<Show> findAll() {
		ArrayList<Show> objs = new ArrayList<Show>();
		try {
			PreparedStatement ps = connect.prepareStatement(String.format("SELECT * FROM Show as S "
					+ " INNER JOIN Representation as R on S.representation_show_fk= R.IDRepresentation "
					+ " INNER JOIN PlanningOfRoom as P on S.planning_show_fk= P.IDplanningOfRoom "
					+ " INNER JOIN Organizer as O on S.Organizer_show_fk= O.IDPerson_Organizer_fk "), 
					ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);  
            ResultSet result = ps.executeQuery();  
            
			while (result.next()) {

				Representation  representation = new Representation(result.getInt("IDRepresentation"));
				PlanningOfRoom planningOfRoom = new PlanningOfRoom(result.getInt("IDplanningOfRoom"));
				Organizer Organizer = new Organizer(result.getInt("IDPerson_Organizer_fk"));
				Show obj = new Show(result.getInt("IDShow"), result.getString("title"),representation, planningOfRoom, Organizer);
				objs.add(obj);
			}
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return objs;
	}
	
	
	
	

}
