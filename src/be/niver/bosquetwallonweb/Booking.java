package be.niver.bosquetwallonweb;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.Date;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import be.niver.dao.ArtistDAO;
import be.niver.dao.BookingDAO;

public class Booking implements Serializable {
	private static final long serialVersionUID = 7787170877756499146L;
	private int IDBooking;
	private double deposit;
	private double insurance;
	private double roomBookingPrice;
	private Organizer organizer_Booking_fk;
	private Date bookingDate;
	private String optionnalService;
	private double optionnalServicePrice;
	private double totalPrice;
	private PlanningOfRoom planningOfRoom;
	//private Set<PlanningOfRoom> listPlanningOfRoom = new HashSet<>();

	public Booking() {
		
	}
	
	public Booking(int iDBooking) {
		IDBooking = iDBooking;
	}
	
	public Booking(int iDBooking, double deposit, double insurance, double roomBookingPrice,
			Organizer organizer_Booking_fk, Date bookingDate, String optionnalService, double optionnalServicePrice,
			double totalPrice, PlanningOfRoom planninOfRoom) {
		
		IDBooking = iDBooking;
		this.deposit = deposit;
		this.insurance = insurance;
		this.roomBookingPrice = roomBookingPrice;
		this.organizer_Booking_fk = organizer_Booking_fk;
		this.bookingDate = bookingDate;
		this.optionnalService = optionnalService;
		this.optionnalServicePrice = optionnalServicePrice;
		this.totalPrice = totalPrice;
		this.planningOfRoom =  planninOfRoom;
	}

	public int getIDBooking() {
		return IDBooking;
	}


	public double getDeposit() {
		return deposit;
	}


	public double getInsurance() {
		return insurance;
	}


	public double getRoomBookingPrice() {
		return roomBookingPrice;
	}


	public PlanningOfRoom getPlanninOfRoom() {
		return planningOfRoom;
	}

	public void setPlanninOfRoom(PlanningOfRoom planninOfRoom) {
		this.planningOfRoom = planninOfRoom;
	}

	public Organizer getOrganizer_Booking_fk() {
		return organizer_Booking_fk;
	}


	public Date getBookingDate() {
		return bookingDate;
	}


	public String getOptionnalService() {
		return optionnalService;
	}


	public double getOptionnalServicePrice() {
		return optionnalServicePrice;
	}


	public double getTotalPrice() {
		return totalPrice;
	}


	public void setIDBooking(int iDBooking) {
		IDBooking = iDBooking;
	}


	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}


	public void setInsurance(double insurance) {
		this.insurance = insurance;
	}


	public void setRoomBookingPrice(double roomBookingPrice) {
		this.roomBookingPrice = roomBookingPrice;
	}


	public void setOrganizer_Booking_fk(Organizer organizer_Booking_fk) {
		this.organizer_Booking_fk = organizer_Booking_fk;
	}


	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}


	public void setOptionnalService(String optionnalService) {
		this.optionnalService = optionnalService;
	}


	public void setOptionnalServicePrice(double optionnalServicePrice) {
		this.optionnalServicePrice = optionnalServicePrice;
	}


	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	@Override
	public String toString() {
		return "Booking [IDBooking=" + IDBooking + ", deposit=" + deposit + ", insurance=" + insurance
				+ ", roomBookingPrice=" + roomBookingPrice + ", organizer_Booking_fk=" + organizer_Booking_fk
				+ ", bookingDate=" + bookingDate + ", optionnalService=" + optionnalService + ", optionnalServicePrice="
				+ optionnalServicePrice + ", totalPrice=" + totalPrice  + " planning : " +planningOfRoom
				+ "]";
	}
	
	/**************************************************************************************/
	/**
	 * les fonctions de la classe
	 * @return
	 */
	
	public boolean create(Connection conn) {
		BookingDAO dao = new BookingDAO(conn);
		return dao.create(this);		
		
	}

	public boolean delete(Connection conn) {
		BookingDAO dao = new BookingDAO(conn);
		return dao.delete(this);		
		
	}

	public boolean update(Connection conn) {
		BookingDAO dao = new BookingDAO(conn);
		return dao.update(this);		
		
	}

	public Booking find(Connection conn) {
		BookingDAO dao = new BookingDAO(conn);
		return dao.find(this.getIDBooking());		
		
	}
	
	public ArrayList<Booking> findAll(Connection conn) {
		BookingDAO dao = new BookingDAO(conn);
		ArrayList<Booking> l = new ArrayList<Booking>();
		for(var p : dao.findAll()) {
			l.add((Booking)p);
		}
		return l;		
		
	}
	
	
	

}
