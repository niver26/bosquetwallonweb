package be.niver.bosquetwallonweb;

import java.io.Serializable;
import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

public class PlanningOfRoom implements Serializable{
	
	

	private static final long serialVersionUID = 7787170877756499146L;

	private int IDplanningOfRoom;
	private Date BiginDate;
	private Date EndDate;
	private Booking bookin_PlanningOfRoom_fk;
	private RoomManager RoomManager_PlannigOfRoom;
	private Set<Show> listShow = new HashSet<>();
	
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
	
	
	
	
	

}
