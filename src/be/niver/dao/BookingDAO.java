package be.niver.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;

import be.niver.bosquetwallonweb.Booking;
import be.niver.bosquetwallonweb.Organizer;
import be.niver.bosquetwallonweb.Booking;

public class BookingDAO extends DAO<Booking> {

	public BookingDAO(Connection conn) {
		super(conn);
		
	}

	@Override
	public boolean create(Booking obj) { 
		return false;
	}

	@Override
	public boolean delete(Booking obj) {
		return false;
	}

	@Override
	public boolean update(Booking obj) {
		return false;
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
		// TODO Auto-generated method stub
		return null;
	}
	

}
