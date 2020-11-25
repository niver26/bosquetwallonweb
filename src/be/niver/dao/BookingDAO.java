package be.niver.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;

import be.niver.bosquetwallonweb.Booking;
import be.niver.bosquetwallonweb.Organizer;
import be.niver.bosquetwallonweb.Person;
import be.niver.service.Md5hash;
import be.niver.bosquetwallonweb.Booking;

public class BookingDAO extends DAO<Booking> {

	public BookingDAO(Connection conn) {
		super(conn);
		
	}

	@Override
	public boolean create(Booking obj) { 
		boolean result = false;
		try {
			result = updateStatement(String.format("INSERT INTO Booking VALUES ( 0 ,%s, %s, %s, %s, '%s', '%s', %s, %s)",  
					obj.getDeposit(),
					obj.getInsurance(),
					obj.getOrganizer_Booking_fk().getIDPerson_Organizer_fk(),
					obj.getBookingDate(),
					obj.getOptionnalService(),
					obj.getOptionnalServicePrice(),
					obj.getTotalPrice()
					));  
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public boolean delete(Booking obj) {
		boolean result = false;
		try {

			result = updateStatement(String.format("DELETE FROM Booking "
					+ " WHERE IDBooking= %s",  
					obj.getIDBooking()
					));  
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public boolean update(Booking obj) {
		
		boolean result = false;
		try {
			result = updateStatement(String.format("UPDATE  Booking "
					+ "SET deposit = %s, insurance = %s, roomBookingPrice = %s, "
					+ "organizer_Booking_fk =  %s, bookingDate = '%s', optionnalService = '%s'"
					+ "optionnalServicePrice = %s, totalPrice = %s"
					+ " WHERE IDBooking = %s",  
					obj.getDeposit(),
					obj.getInsurance(),
					obj.getOrganizer_Booking_fk().getIDPerson_Organizer_fk(),
					obj.getBookingDate(),
					obj.getOptionnalService(),
					obj.getOptionnalServicePrice(),
					obj.getTotalPrice(),
					obj.getIDBooking()
					));  
			//System.out.println("update Booking is "+ result);
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
		
	}

	@Override
	public Booking find(int id) {
		 
		
		Booking booking = new Booking();
		try {
			ResultSet result = this.connect
					.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)
					.executeQuery("SELECT * FROM Booking as b INNER JOIN Organizer as o on b.organizer_Booking_fk = o.IDPerson_Organizer_fk "
							+ " WHERE IDBooking = " + id);
			
			
			
			if (result.first())
			{
				String dateString = result.getString("bookingDate");
				Date date =   Date.valueOf(dateString.substring(0,10));
				
				Organizer organizer = new Organizer(result.getInt("organizer_Booking_fk"));
				
				booking = new Booking(id, result.getDouble("deposit"), result.getDouble("insurance"),
						result.getDouble("roomBookingPrice"),	organizer, date,result.getString("optionnalService"),
						result.getDouble("optionnalServicePrice"),result.getDouble("totalPrice"));
				
			}
		
	
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return booking;
	}

	@Override
	public ArrayList<Booking> findAll() {
		ArrayList<Booking> objs = new ArrayList<Booking>();
		try {
			PreparedStatement ps = connect.prepareStatement(String.format("SELECT * FROM Booking"), 
					ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);  
            ResultSet result = ps.executeQuery();  
            
			while (result.next()) {
				String dateString = result.getString("bookingDate");
				Date date =   Date.valueOf(dateString.substring(0,10));
				Organizer organizer = new Organizer(result.getInt("organizer_Booking_fk"));
				
				Booking obj = new Booking(result.getInt("IDBooking"), result.getDouble("deposit"), result.getDouble("insurance"),
						result.getDouble("roomBookingPrice"),	organizer, date,result.getString("optionnalService"),
						result.getDouble("optionnalServicePrice"),result.getDouble("totalPrice"));
				
				objs.add(obj);
			}
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return objs;
	}
	
	

}
