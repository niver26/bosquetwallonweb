package be.niver.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import be.niver.bosquetwallonweb.CategoryRoom;
import be.niver.bosquetwallonweb.Configuration;


public class CategoryRoomDAO extends DAO<CategoryRoom>  {
	
	
	public CategoryRoomDAO(Connection conn) {
		super(conn);
	}

	@Override
	public boolean create(CategoryRoom obj) { 
		boolean result = false;
		try {
			result = updateStatement(String.format("INSERT INTO CategoryRoom VALUES ( 0 ,%s, %s,  %s)",  
					obj.getConfiguration_categoryRoom_fk().getIDConfiguration(),
					obj.getPlaceMax(),
					obj.getNbePlace()
					));  
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public boolean delete(CategoryRoom obj) {
		boolean result = false;
		try {
			result = updateStatement(String.format("DELETE FROM CategoryRoom "
					+ " WHERE IDCategoryRoom= %s",  
					obj.getIDCategoryRoom()
					));  
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public boolean update(CategoryRoom obj) {
		
		boolean result = false;
		try {
			result = updateStatement(String.format("UPDATE  CategoryRoom "
					+ "SET configuration_categoryRoom_fk = %s, placemax = %s, nbrPlace = %s  "
					+ " WHERE IDCategoryRoom = %s", 
					obj.getConfiguration_categoryRoom_fk().getIDConfiguration(),
					obj.getPlaceMax(),
					obj.getNbePlace(),
					obj.getIDCategoryRoom()
					));  
			//System.out.println("update CategoryRoom is "+ result);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
		
	}

	@Override
	public CategoryRoom find(int id) {
		 
		
		CategoryRoom obj = new CategoryRoom();
		try {
			ResultSet result = this.connect
					.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)
					.executeQuery("SELECT * FROM CategoryRoom as Ca INNER JOIN Configuration as Co on Ca.configuration_categoryRoom_fk = Co.IDConfiguration "
							+ " WHERE IDCategoryRoom = " + id);
			
			if (result.first())
			{
				Configuration  configuration = new Configuration(result.getInt("IDConfiguration"));
				obj = new CategoryRoom(id,  result.getInt("nbrPlace"),result.getInt("placemax"), configuration );
			}
	
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return obj;
	}

	@Override
	public ArrayList<CategoryRoom> findAll() {
		ArrayList<CategoryRoom> objs = new ArrayList<CategoryRoom>();
		try {
			PreparedStatement ps = connect.prepareStatement(String.format("SELECT * FROM CategoryRoom as Ca INNER JOIN Configuration as Co on Ca.configuration_categoryRoom_fk = Co.IDConfiguration "), 
					ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);  
            ResultSet result = ps.executeQuery();  
            
			while (result.next()) {
				
				Configuration  configuration = new Configuration(result.getInt("IDConfiguration"));
				CategoryRoom	obj = new CategoryRoom(result.getInt("IDCategoryRoom"),  result.getInt("nbrPlace"),result.getInt("placemax"), configuration );
				objs.add(obj);
			}
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return objs;
	}
	
	

}
