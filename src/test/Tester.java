package test;

import java.sql.Date;

import be.niver.bosquetwallonweb.*;
import be.niver.dao.*;


public class Tester {
	public static void main(String[] args) {
		
			
			/*System.out.print("***************** Artist **************************\n");
			DAO<Person> artistDAO = new ArtistDAO(be.niver.connect.ConnectDataBase.getInstance());
			for (int i = 1; i < 6; i++) {
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
			
				
				
			}*/
		/*Booking booking = new Booking(0, 1000.0, 4000.0, 10.22,
				new Organizer(4), Date.valueOf("2021-01-03"), "barman", 78.55,
				7.88, new PlanningOfRoom(4));
		
		var result = booking.create(be.niver.connect.ConnectDataBase.getInstance());
		
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
				"Show: "+artist.getShowArtiste()+ "Spetialité: "+artist.getSpeciality());
		*/
		
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
		
		
		/*System.out.print("\n\n***************** Representation **************************\n");
		DAO<Representation> representationDAO = new RepresentationDAO(be.niver.connect.ConnectDataBase.getInstance());
		for (int i = 3; i < 7; i++) {
			Representation representation = (Representation) representationDAO.find(i);
			System.out.println(representation);
		}
		System.out.print("***************** Representation for each **************************\n");
		for(var p : representationDAO.findAll() ) {
			Representation representation = (Representation)p;
			System.out.println(representation);
		}
		
		
		System.out.print("\n\n***************** Representation **************************\n");
		DAO<Representation> representationDAO = new RepresentationDAO(be.niver.connect.ConnectDataBase.getInstance());
		for (int i = 3; i < 7; i++) {
			Representation representation = (Representation) representationDAO.find(i);
			System.out.println(representation);
		}*/
		
		/*DAO<Booking> bookingDAO = new BookingDAO(be.niver.connect.ConnectDataBase.getInstance());
		for (int i = 1; i < 3; i++) {
			Booking booking = bookingDAO.find(i);
			System.out.println(booking );
		
		}
		System.out.print("***************** Booking for each **************************\n");
		for(var p : bookingDAO.findAll() ) {
			Booking booking = (Booking)p;
			System.out.println(booking);
		}*/
		/*System.out.print("***************** categoryRoomDAO **************************\n");
		DAO<CategoryRoom> categoryRoomDAO = new CategoryRoomDAO(be.niver.connect.ConnectDataBase.getInstance());
		for (int i = 1; i < 3; i++) {
			CategoryRoom categoryRoom = categoryRoomDAO.find(i);
			System.out.println(categoryRoom );
		
		}
		System.out.print("***************** categoryRoomDAO for each **************************\n");
		for(var p : categoryRoomDAO.findAll() ) {
			CategoryRoom categoryRoom = (CategoryRoom)p;
			System.out.println(categoryRoom);
		}*/
		
		/*System.out.print("***************** Configuration **************************\n");
		DAO<Configuration> configurationDAO = new ConfigurationDAO(be.niver.connect.ConnectDataBase.getInstance());
		for (int i = 1; i < 3; i++) {
			Configuration configuration = configurationDAO.find(i);
			System.out.println(configuration );
		
		}
		System.out.print("***************** Configuration for each **************************\n");
		for(var p : configurationDAO.findAll() ) {
			Configuration configuration = (Configuration)p;
			System.out.println(configuration);
		}*/
		
		
		/*System.out.print("***************** Order **************************\n");
		DAO<Order> orderDAO = new OrderDAO(be.niver.connect.ConnectDataBase.getInstance());
		for (int i = 1; i < 3; i++) {
			Order order = orderDAO.find(i);
			System.out.println(order );
		
		}
		System.out.print("***************** Order for each **************************\n");
		for(var p : orderDAO.findAll() ) {
			Order order = (Order)p;
			System.out.println(order);
		}*/
		
		
		/*System.out.print("***************** Place **************************\n");
		DAO<Place> placeDAO = new PlaceDAO(be.niver.connect.ConnectDataBase.getInstance());
		for (int i = 1; i < 3; i++) {
			Place place = placeDAO.find(i);
			System.out.println(place );
		
		}
		System.out.print("***************** Place for each **************************\n");
		for(var p : placeDAO.findAll() ) {
			Place place = (Place)p;
			System.out.println(place);
		}*/
		
		/*System.out.print("***************** planningOfRoom **************************\n");
		DAO<PlanningOfRoom> planningOfRoomDAO = new PlanningOfRoomDAO(be.niver.connect.ConnectDataBase.getInstance());
		for (int i = 1; i < 3; i++) {
			PlanningOfRoom planningOfRoom = planningOfRoomDAO.find(i);
			System.out.println(planningOfRoom );
		
		}
		System.out.print("***************** planningOfRoom for each **************************\n");
		for(var p : planningOfRoomDAO.findAll() ) {
			PlanningOfRoom planningOfRoom = (PlanningOfRoom)p;
			System.out.println(planningOfRoom);
		}*/
		
		var result = new PlanningOfRoom().findAllNotBooking(be.niver.connect.ConnectDataBase.getInstance());
		for(var p : result ) 
			System.out.println(p);
		
		
		/*System.out.print("***************** Show **************************\n");
		DAO<Show> showDAO = new ShowDAO(be.niver.connect.ConnectDataBase.getInstance());
		for (int i = 1; i < 3; i++) {
			Show show = showDAO.find(i);
			System.out.println(show );
		
		}
		System.out.print("***************** Show for each **************************\n");
		for(var p : showDAO.findAll() ) {
			Show show = (Show)p;
			System.out.println(show);
		}*/
		
		
		
	}
		
		
}


