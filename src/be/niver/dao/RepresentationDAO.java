package be.niver.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;

import be.niver.bosquetwallonweb.Place;
import be.niver.bosquetwallonweb.Representation;


public class RepresentationDAO extends DAO<Representation> {
	
	public RepresentationDAO(Connection conn) {
		super(conn);
	}

	@Override
	public boolean create(Representation obj) { 
		boolean result = false;
		try {
			result = updateStatement(String.format("INSERT INTO Representation VALUES ( 0 ,'%s','%s', %s)",  
					obj.getBiginTime(),
					obj.getEndTime(),
					obj.getPlace_representation_fk().getIDPlace()
					));  
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public boolean delete(Representation obj) {
		boolean result = false;
		try {

			result = updateStatement(String.format("DELETE FROM Representation "
					+ " WHERE IDRepresentation= %s",  
					obj.getIDRepresentation()
					));  
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public boolean update(Representation obj) {
		
		boolean result = false;
		try {
			result = updateStatement(String.format("UPDATE  Representation "
					+ "SET BiginTime = '%s', EndTime = '%s', place_representation_fk= %s  "
					+ " WHERE IDRepresentation = %s", 
					obj.getBiginTime(),
					obj.getEndTime(), 
					obj.getPlace_representation_fk().getIDPlace(),
					obj.getIDRepresentation()
					));  
			//System.out.println("update Representation is "+ result);
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
		
	}

	@Override
	public Representation find(int id) {
		 
		
		Representation obj = new Representation();
		try {
			ResultSet result = this.connect
					.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)
					.executeQuery("SELECT * FROM Representation as R "
							+ " INNER JOIN Place as P on R.place_representation_fk= P.IDPlace "
							+ " WHERE IDRepresentation = " + id);
		
			if (result.first())
			{
				/*String heureString1 = result.getString("BiginTime");
				Time heuredebut =   Time.valueOf(heureString1.substring(0,10));
				
				String heureString2 = result.getString("EndTime");
				Time heurefin =   Time.valueOf(heureString2.substring(0, 10));*/
				
				Place  place = new Place(result.getInt("IDBooking"));
				obj = new Representation(id, result.getTime("BiginTime"), result.getTime("EndTime"), place);
				
			}
		
	
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return obj;
	}

	@Override
	public ArrayList<Representation> findAll() {
		ArrayList<Representation> objs = new ArrayList<Representation>();
		try {
			PreparedStatement ps = connect.prepareStatement(String.format("SELECT * FROM Representation as R "
					+ " INNER JOIN Place as P on R.place_representation_fk= P.IDPlace "), 
					ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);  
            ResultSet result = ps.executeQuery();  
            
			while (result.next()) {
				/*String heureString1 = result.getString("BiginTime");
				Time heuredebut =   Time.valueOf(heureString1.substring(0,10));
				
				String heureString2 = result.getString("EndTime");
				Time heurefin =   Time.valueOf(heureString2.substring(0, 10));*/
				
				Place  place = new Place(result.getInt("IDBooking"));
				Representation obj = new Representation(result.getInt("IDRepresentation"), result.getTime("BiginTime"), result.getTime("EndTime"), place);
				objs.add(obj);
			}
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return objs;
	}

}
