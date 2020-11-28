package be.niver.bosquetwallonweb;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.Date;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import be.niver.dao.PlanningOfRoomDAO;

public class PlanningOfRoom implements Serializable{
	private static final long serialVersionUID = 7787170877756499146L;

	private int IDplanningOfRoom;
	private Date BiginDate;
	private Date EndDate;
	private Booking bookin_PlanningOfRoom_fk;
	private RoomManager RoomManager_PlannigOfRoom;
	private Set<Show> listShow = new HashSet<>();
	
	public PlanningOfRoom() {
		
	}
	public PlanningOfRoom(int iDplanningOfRoom) {
		IDplanningOfRoom = iDplanningOfRoom;
	}
	
	public PlanningOfRoom(int iDplanningOfRoom, Date biginDate, Date endDate, Booking bookin_PlanningOfRoom_fk,
			RoomManager roomManager_PlannigOfRoom) {
		
		IDplanningOfRoom = iDplanningOfRoom;
		BiginDate = biginDate;
		EndDate = endDate;
		this.bookin_PlanningOfRoom_fk = bookin_PlanningOfRoom_fk;
		RoomManager_PlannigOfRoom = roomManager_PlannigOfRoom;
	}
	
	public int getIDplanningOfRoom() {
		return IDplanningOfRoom;
	}

	public Date getBiginDate() {
		return BiginDate;
	}

	public Date getEndDate() {
		return EndDate;
	}

	public Booking getBookin_PlanningOfRoom_fk() {
		return bookin_PlanningOfRoom_fk;
	}

	public RoomManager getRoomManager_PlannigOfRoom() {
		return RoomManager_PlannigOfRoom;
	}

	public Set<Show> getListShow() {
		return listShow;
	}

	public void setIDplanningOfRoom(int iDplanningOfRoom) {
		IDplanningOfRoom = iDplanningOfRoom;
	}

	public void setBiginDate(Date biginDate) {
		BiginDate = biginDate;
	}

	public void setEndDate(Date endDate) {
		EndDate = endDate;
	}

	public void setBookin_PlanningOfRoom_fk(Booking bookin_PlanningOfRoom_fk) {
		this.bookin_PlanningOfRoom_fk = bookin_PlanningOfRoom_fk;
	}

	public void setRoomManager_PlannigOfRoom(RoomManager roomManager_PlannigOfRoom) {
		RoomManager_PlannigOfRoom = roomManager_PlannigOfRoom;
	}

	public void setListShow(Set<Show> listShow) {
		this.listShow = listShow;
	}
	
	@Override
	public String toString() {
		return "PlanningOfRoom [IDplanningOfRoom=" + IDplanningOfRoom + ", BiginDate=" + BiginDate + ", EndDate="
				+ EndDate + ", bookin_PlanningOfRoom_fk=" + bookin_PlanningOfRoom_fk + ", RoomManager_PlannigOfRoom="
				+ RoomManager_PlannigOfRoom + ", listShow=" + listShow + "]";
	}

	/**************************************************************************************/
	/**
	 * les fonctions de la classe
	 * @return
	 */
	
	public boolean create(Connection conn) {
		PlanningOfRoomDAO dao = new PlanningOfRoomDAO(conn);
		return dao.create(this);		
		
	}

	public boolean delete(Connection conn) {
		PlanningOfRoomDAO dao = new PlanningOfRoomDAO(conn);
		return dao.delete(this);		
		
	}

	public boolean update(Connection conn) {
		PlanningOfRoomDAO dao = new PlanningOfRoomDAO(conn);
		return dao.update(this);		
		
	}

	public PlanningOfRoom find(Connection conn) {
		PlanningOfRoomDAO dao = new PlanningOfRoomDAO(conn);
		return dao.find(this.getIDplanningOfRoom());		
		
	}
	
	public ArrayList<PlanningOfRoom> findAll(Connection conn) {
		PlanningOfRoomDAO dao = new PlanningOfRoomDAO(conn);
		ArrayList<PlanningOfRoom> l = new ArrayList<PlanningOfRoom>();
		for(var p : dao.findAll()) {
			l.add((PlanningOfRoom)p);
		}
		return l;		
		
	}
	
	
	
	
	

}
