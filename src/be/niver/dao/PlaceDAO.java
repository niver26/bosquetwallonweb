package be.niver.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import be.niver.bosquetwallonweb.Order;
import be.niver.bosquetwallonweb.Place;
import be.niver.bosquetwallonweb.Representation;


public class PlaceDAO extends DAO<Place>{

	
	
	public PlaceDAO(Connection conn) {
		super(conn);
	}

	@Override
	public boolean create(Place obj) { 
		boolean result = false;
		try {
			result = updateStatement(String.format("INSERT INTO Place VALUES ( 0 ,%s, '%s','%s', %s)",  
					obj.getPrice(),
					obj.getConfiguration(),
					obj.isDispobible(),
					obj.getRepresentation_place_fk()
					));  
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public boolean delete(Place obj) {
		boolean result = false;
		try {

			result = updateStatement(String.format("DELETE FROM Place "
					+ " WHERE IDPlace= %s",  
					obj.getIDPlace()
					));  
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public boolean update(Place obj) {
		
		boolean result = false;
		try {
			result = updateStatement(String.format("UPDATE  Place "
					+ "SET price = %s, configuration = '%s',isDispobible='%s', representation_place_fk= %s "
					+ " WHERE IDPlace = %s", 
					obj.getPrice(),
					obj.getConfiguration(),
					obj.isDispobible(),
					obj.getRepresentation_place_fk(),
					obj.getIDPlace()
					));  
			//System.out.println("update Place is "+ result);
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
		
	}

	@Override
	public Place find(int id) {
		 
		
		Place obj = new Place();
		try {
			ResultSet result = this.connect
					.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)
					.executeQuery("SELECT * FROM Place INNER JOIN Representation as R on representation_place_fk = R.IDRepresentation "
							+ " WHERE IDPlace = " + id);
		
			if (result.first())
			{
				
				Representation  representation = new Representation(result.getInt("IDRepresentation"));
				obj = new Place(id,result.getInt("price"),  result.getString("configuration"), result.getBoolean("isDispobible"),representation);
				
			}
		
	
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return obj;
	}

	@Override
	public ArrayList<Place> findAll() {
		ArrayList<Place> objs = new ArrayList<Place>();
		try {
			PreparedStatement ps = connect.prepareStatement(String.format("SELECT * FROM Place INNER JOIN Representation as R on representation_place_fk = R.IDRepresentation"), 
					ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);  
            ResultSet result = ps.executeQuery();  
            
			while (result.next()) {
				Representation  representation = new Representation(result.getInt("IDRepresentation"));
				Place obj = new Place(result.getInt("IDPlace"),result.getInt("price"),  result.getString("configuration"), result.getBoolean("isDispobible"),representation);
				
				objs.add(obj);
			}
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return objs;
	}
}
