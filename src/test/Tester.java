package test;

import be.niver.bosquetwallonweb.*;
import be.niver.dao.*;


public class Tester {
	public static void main(String[] args) {
		
			
			/*System.out.print("***************** Artist **************************\n");
			DAO<Person> artistDAO = new ArtistDAO(be.niver.connect.ConnectDataBase.getInstance());
			for (int i = 1; i < 3; i++) {
				Artist artist = (Artist) artistDAO.find(i);
				System.out.println("Artist N°: " + artist.getIDPerson_Artiste_fk() + "  Nom:  " + artist.getFirstName() + "  Prenom: " + artist.getLastName()
				+ "  Adresse:  " + artist.getAdress() + "  E_Mail: " + artist.getE_Mail()+ "  mot de passe:  " + artist.getPassWord()+
						"Show: "+artist.getShowArtiste()+ "Spetialité: "+artist.getSpeciality());
			
			}
			System.out.print("***************** Artist for each**************************\n");
			for(var p : artistDAO.findAll() ) {
				Artist artist = (Artist) p;
				System.out.println("Artist N°: " + artist.getIDPerson_Artiste_fk() + "  Nom:  " + artist.getFirstName() + "  Prenom: " + artist.getLastName()
				+ "  Adresse:  " + artist.getAdress() + "  E_Mail: " + artist.getE_Mail()+ "  mot de passe:  " + artist.getPassWord()+
						"Show: "+artist.getShowArtiste()+ "Spetialité: "+artist.getSpeciality());
			
			}
			
			
			System.out.print("\n\n***************** Spectator **************************\n");
			DAO<Person> spectatorDAO = new SpectatorDAO(be.niver.connect.ConnectDataBase.getInstance());
			for (int i = 3; i < 7; i++) {
				Spectator spectator = (Spectator) spectatorDAO.find(i);
				System.out.println("spectyator N°: " + spectator.getIDPerson_fk() + "  Nom:  " + spectator.getFirstName() + "  Prenom: " + spectator.getLastName()
				+ "  Adresse:  " + spectator.getAdress() + "  E_Mail: " + spectator.getE_Mail()+ "  mot de passe:  " + spectator.getPassWord());
			
			}
			System.out.print("***************** Spectator for each**************************\n");
			for(var p : spectatorDAO.findAll() ) {
				Spectator spectator = (Spectator)p;
				System.out.println("spectyator N°: " + spectator.getIDPerson_fk() + "  Nom:  " + spectator.getFirstName() + "  Prenom: " + spectator.getLastName()
				+ "  Adresse:  " + spectator.getAdress() + "  E_Mail: " + spectator.getE_Mail()+ "  mot de passe:  " + spectator.getPassWord());
			}
			
			System.out.print("***************** RoomManager **************************\n");
			DAO<Person> RoomManagerDAO = new RoomManagerDAO(be.niver.connect.ConnectDataBase.getInstance());
			for (int i = 7; i < 9; i++) {
				RoomManager roomManager = (RoomManager) RoomManagerDAO.find(i);
				System.out.println("manager N°: " + roomManager.getIDPerson_RoomManager_fk() + "  Nom:  " + roomManager.getFirstName() + "  Prenom: " + roomManager.getLastName()
				+ "  Adresse:  " + roomManager.getAdress() + "  E_Mail: " + roomManager.getE_Mail()+ "  mot de passe:  " + roomManager.getPassWord());
			
			}
		
			System.out.print("***************** RoomManager for each**************************\n");
			for(var p : RoomManagerDAO.findAll() ) {
				RoomManager roomManager =  (RoomManager) p; 
				System.out.println("manager N°: " + roomManager.getIDPerson_RoomManager_fk() + "  Nom:  " + roomManager.getFirstName() + "  Prenom: " + roomManager.getLastName()
				+ "  Adresse:  " + roomManager.getAdress() + "  E_Mail: " + roomManager.getE_Mail()+ "  mot de passe:  " + roomManager.getPassWord());
			
			}
		
			
			
			
			System.out.print("***************** Organizer **************************\n");
			DAO<Person> OrganizerDAO = new OrganizerDAO(be.niver.connect.ConnectDataBase.getInstance());
			for (int i = 4; i < 6; i++) {
				Organizer organizer = (Organizer) OrganizerDAO.find(i);
				System.out.println("Organizer N°: " + organizer.getIDPerson_Organizer_fk() + "  Nom:  " + organizer.getFirstName() + "  Prenom: " + organizer.getLastName()
				+ "  Adresse:  " + organizer.getAdress() + "  E_Mail: " + organizer.getE_Mail()+ "  mot de passe:  " + organizer.getPassWord());
			
			}
			System.out.print("***************** Organizer for each**************************\n");
			for(var p : OrganizerDAO.findAll() ) {
				Organizer organizer =  (Organizer) p; 
				System.out.println("Organizer N°: " + organizer.getIDPerson_Organizer_fk() + "  Nom:  " + organizer.getFirstName() + "  Prenom: " + organizer.getLastName()
				+ "  Adresse:  " + organizer.getAdress() + "  E_Mail: " + organizer.getE_Mail()+ "  mot de passe:  " + organizer.getPassWord());
			}
			
			System.out.print("***************** Booking **************************\n");
			DAO<Booking> bookingDAO = new BookingDAO(be.niver.connect.ConnectDataBase.getInstance());
			for (int i = 1; i < 3; i++) {
				Booking booking = bookingDAO.find(i);
				System.out.println("Reservation N°: " + booking.getIDBooking() + "  Assurance:  " + booking.getInsurance() + "  Caution: " + booking.getDeposit()
				+ "  service optionnel:  " + booking.getOptionnalService() + "  Prix des service optionnel: " + booking.getOptionnalServicePrice()+ "  Prix Reservation:  " + booking.getRoomBookingPrice() + "  prix total: "
						+booking.getTotalPrice()+"  date de reservation: " + booking.getBookingDate());
			
			}
			*/
		
		/*DAO<Person> artistDAO = new ArtistDAO(be.niver.connect.ConnectDataBase.getInstance());
		Artist artist = (Artist) artistDAO.find(1);
		artist.setAdress("manoka mibolmimanibé");
		Show show = artist.getShowArtiste();
		show.setIDShow(4);
		artist.setShowArtiste(show);
		artistDAO.update(artist);
		 artist = (Artist) artistDAO.find(1);
		System.out.println("Artist N°: " + artist.getIDPerson_Artiste_fk() + "  Nom:  " + artist.getFirstName() + "  Prenom: " + artist.getLastName()
		+ "  Adresse:  " + artist.getAdress() + "  E_Mail: " + artist.getE_Mail()+ "  mot de passe:  " + artist.getPassWord()+
				"Show: "+artist.getShowArtiste()+ "Spetialité: "+artist.getSpeciality());*/
		
		
		/*DAO<Person> artistDAO = new ArtistDAO(be.niver.connect.ConnectDataBase.getInstance());
		Artist artist = (Artist) artistDAO.find(1);
		artistDAO.delete(artist);
		
		artist = (Artist) artistDAO.find(1);
		System.out.println("Artist N°: " + artist.getIDPerson_Artiste_fk() + "  Nom:  " + artist.getFirstName() + "  Prenom: " + artist.getLastName()
		+ "  Adresse:  " + artist.getAdress() + "  E_Mail: " + artist.getE_Mail()+ "  mot de passe:  " + artist.getPassWord()+
				"Show: "+artist.getShowArtiste()+ "Spetialité: "+artist.getSpeciality());
		*/
		
		
		/*

			Organizer organizer = new Organizer(0, "Dan", "Ost", "te bolia 28", "ots@yahoo.fr", "ots0");
			var result = organizer.create(be.niver.connect.ConnectDataBase.getInstance());
			organizer = organizer.login(be.niver.connect.ConnectDataBase.getInstance());
			System.out.println("Artist N°: " + organizer.getIDPerson_Organizer_fk() + "  Nom:  " + organizer.getFirstName() + "  Prenom: " + organizer.getLastName()
			+ "  Adresse:  " + organizer.getAdress() + "  E_Mail: " + organizer.getE_Mail()+ "  mot de passe:  " + organizer.getPassWord());
	
		*/
		
		/*
		Spectator spectator = new Spectator(0, "Oloam", "Yan", "Yangoua Alex zone 4", "oloam@yahoo.fr", "pass");
		var result = spectator.create(be.niver.connect.ConnectDataBase.getInstance());
		spectator = spectator.login(be.niver.connect.ConnectDataBase.getInstance());
		System.out.println("Artist N°: " + spectator.getIDPerson_fk() + "  Nom:  " + spectator.getFirstName() + "  Prenom: " + spectator.getLastName()
		+ "  Adresse:  " + spectator.getAdress() + "  E_Mail: " + spectator.getE_Mail()+ "  mot de passe:  " + spectator.getPassWord());
		
		
		
		RoomManager roomManager = new RoomManager(0, "Alain", "Bernard", "Arrange france v", "anule@yahoo.fr", "zonA");
		result = roomManager.create(be.niver.connect.ConnectDataBase.getInstance());
		roomManager = roomManager.login(be.niver.connect.ConnectDataBase.getInstance());
		System.out.println("Artist N°: " + roomManager.getIDPerson_RoomManager_fk() + "  Nom:  " + roomManager.getFirstName() + "  Prenom: " + roomManager.getLastName()
		+ "  Adresse:  " + roomManager.getAdress() + "  E_Mail: " + roomManager.getE_Mail()+ "  mot de passe:  " + roomManager.getPassWord());
		*/
		
		
		
		
		/*
			Artist artist = new Artist(0, "Leon", "OSCA", "Zone D", "salim@yahoo.fr", "hereux", new Show(4, null, null, null, null), "clone");
		    var  result = artist.create(be.niver.connect.ConnectDataBase.getInstance());
			artist = artist.login(be.niver.connect.ConnectDataBase.getInstance());
			System.out.println("Artist N°: " + artist.getIDPerson_Artiste_fk() + "  Nom:  " + artist.getFirstName() + "  Prenom: " + artist.getLastName()
			+ "  Adresse:  " + artist.getAdress() + "  E_Mail: " + artist.getE_Mail()+ "  mot de passe:  " + artist.getPassWord()+
					"Show: "+artist.getShowArtiste()+ "Spetialité: "+artist.getSpeciality());
					*/
		
		
	}
		
		
}


