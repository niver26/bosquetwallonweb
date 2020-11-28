package be.niver.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import be.niver.bosquetwallonweb.Booking;
import be.niver.bosquetwallonweb.PlanningOfRoom;
import be.niver.bosquetwallonweb.RoomManager;


public class PlanningOfRoomDAO extends DAO<PlanningOfRoom>{

	public PlanningOfRoomDAO(Connection conn) {
		super(conn);
	}

	@Override
	public boolean create(PlanningOfRoom obj) { 
		boolean result = false;
		try {
			result = updateStatement(String.format("INSERT INTO PlanningOfRoom VALUES ( 0 ,'%s','%s', %s)",  
					obj.getBiginDate(),
					obj.getEndDate(),
					
					obj.getRoomManager_PlannigOfRoom().getIDPerson_RoomManager_fk()
					));  
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public boolean delete(PlanningOfRoom obj) {
		boolean result = false;
		try {

			result = updateStatement(String.format("DELETE FROM PlanningOfRoom "
					+ " WHERE IDplanningOfRoom= %s",  
					obj.getIDplanningOfRoom()
					));  
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public boolean update(PlanningOfRoom obj) {
		
		boolean result = false;
		try {
			result = updateStatement(String.format("UPDATE  PlanningOfRoom "
					+ "SET BiginDate = '%s', EndDate = '%s', RoomManager_PlannigOfRoom = %s "
					+ " WHERE IDplanningOfRoom = %s", 
					obj.getBiginDate(),
					obj.getEndDate(),
					obj.getRoomManager_PlannigOfRoom().getIDPerson_RoomManager_fk(),
					obj.getIDplanningOfRoom()
					));  
			//System.out.println("update PlanningOfRoom is "+ result);
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
		
	}

	@Override
	public PlanningOfRoom find(int id) {
		 
		
		PlanningOfRoom obj = new PlanningOfRoom();
		try {
			ResultSet result = this.connect
					.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)
					.executeQuery("SELECT * FROM PlanningOfRoom as pl "
							+ " INNER JOIN RoomManager as R on pl.RoomManager_PlannigOfRoom_fk= R.IDPerson_RoomManager_fk "
							+ " WHERE IDplanningOfRoom = " + id);
		
			if (result.first())
			{
				String dateString1 = result.getString("BiginDate");
				Date datedebut =   Date.valueOf(dateString1.substring(0,10));
				
				String dateString2 = result.getString("EndDate");
				Date datefin =   Date.valueOf(dateString2.substring(0,10));
				
				RoomManager roomManager = new RoomManager(result.getInt("IDPerson_RoomManager_fk"));
				
				obj = new PlanningOfRoom(id, datedebut, datefin, roomManager);
				
			}
		
	
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return obj;
	}

	@Override
	public ArrayList<PlanningOfRoom> findAll() {
		ArrayList<PlanningOfRoom> objs = new ArrayList<PlanningOfRoom>();
		try {
			PreparedStatement ps = connect.prepareStatement(String.format("SELECT * FROM PlanningOfRoom as pl "
					+ " INNER JOIN RoomManager as R on pl.RoomManager_PlannigOfRoom_fk= R.IDPerson_RoomManager_fk "), 
					ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);  
            ResultSet result = ps.executeQuery();  
            
			while (result.next()) {
				String dateString1 = result.getString("BiginDate");
				Date datedebut =   Date.valueOf(dateString1.substring(0,10));
				
				String dateString2 = result.getString("EndDate");
				Date datefin =   Date.valueOf(dateString2.substring(0,10));
				
				
				RoomManager roomManager = new RoomManager(result.getInt("IDPerson_RoomManager_fk"));
				
				PlanningOfRoom obj = new PlanningOfRoom(result.getInt("IDplanningOfRoom"), datedebut, datefin, roomManager);
				objs.add(obj);
			}
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return objs;
	}
	
	
}
