package test;

import be.niver.bosquetwallonweb.*;
import be.niver.dao.*;


public class Tester {
	public static void main(String[] args) {
		System.out.print("***************** Person **************************\n");
			DAO<Person> personDAO = new PersonDAO(be.niver.connect.ConnectDataBase.getInstance());
			for (int i = 1; i < 9; i++) {
				Person person = personDAO.find(i);
				System.out.println("Person N°: " + person.getIDperson() + "  Nom:  " + person.getFirstName() + "  Prenom: " + person.getLastName()
				+ "  Adresse:  " + person.getAdress() + "  E_Mail: " + person.getE_Mail()+ "  mot de passe:  " + person.getPassWord() + "  Numero cate de crédit: "
						+person.getCreditCartNumber()+"  solde carte de credit: " + person.getCreditCartBalance()
						+ "  code carte: " + person.getCartPassCode());
			}
			
			System.out.print("***************** Artist **************************\n");
			DAO<Artist> artistDAO = new ArtistDAO(be.niver.connect.ConnectDataBase.getInstance());
			for (int i = 1; i < 3; i++) {
				Artist artist = artistDAO.find(i);
				System.out.println("Artist N°: " + artist.getIDPerson_Artiste_fk() + "  Nom:  " + artist.getFirstName() + "  Prenom: " + artist.getLastName()
				+ "  Adresse:  " + artist.getAdress() + "  E_Mail: " + artist.getE_Mail()+ "  mot de passe:  " + artist.getPassWord() + "  Numero cate de crédit: "
						+artist.getCreditCartNumber()+"  solde carte de credit: " + artist.getCreditCartBalance() + "Spécialité : "+ artist.getSpeciality()+
						"Show: "+artist.getShowArtiste()+ "  code carte: " + artist.getCartPassCode());
			
			}
			
			/*System.out.print("***************** Booking **************************\n");
			DAO<Booking> bookingDAO = new BookingDAO(be.niver.connect.ConnectDataBase.getInstance());
			for (int i = 1; i < 3; i++) {
				Booking booking = bookingDAO.find(i);
				System.out.println("Reservation N°: " + booking.getIDBooking() + "  Assurance:  " + booking.getInsurance() + "  Caution: " + booking.getDeposit()
				+ "  service optionnel:  " + booking.getOptionnalService() + "  Prix des service optionnel: " + booking.getOptionnalServicePrice()+ "  Prix Reservation:  " + booking.getRoomBookingPrice() + "  prix total: "
						+booking.getTotalPrice()+"  date de reservation: " + booking.getBookingDate());
			
			}*/
			
			
		
	}
		
		
}


