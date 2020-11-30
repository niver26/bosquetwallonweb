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
			
			PreparedStatement ps = connect.prepareStatement("INSERT INTO Representation(BiginTime,"
					+ "EndTime,"
					+ "dateRepresentation ) VALUES ( ?, ?,?)" );
			ps.setTime(1, obj.getBiginTime());
			ps.setTime(2, obj.getEndTime());
			ps.setDate(3, obj.getDateRepresentation());
			int result1 = ps.executeUpdate();
			System.out.println("update result is "+ result1);  
			 result = result1 >0;
			 
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
					+ "SET BiginTime = '%s', EndTime = '%s' dateRepresentation = '%s' "
					+ " WHERE IDRepresentation = %s", 
					obj.getBiginTime(),
					obj.getEndTime(),
					obj.getDateRepresentation(),
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
							+ " WHERE IDRepresentation = " + id);
		
			if (result.first())
			{
				obj = new Representation(id, result.getTime("BiginTime"), result.getTime("EndTime"), result.getDate("dateRepresentation"));
				
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
			PreparedStatement ps = connect.prepareStatement(String.format("SELECT * FROM Representation as R "), 
					ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);  
            ResultSet result = ps.executeQuery();  
            
			while (result.next()) {
				
				Representation obj = new Representation(result.getInt("IDRepresentation"), result.getTime("BiginTime"), result.getTime("EndTime"), result.getDate("dateRepresentation"));
				objs.add(obj);
			}
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return objs;
	}

}
