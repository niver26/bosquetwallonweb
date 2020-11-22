package be.niver.bosquetwallonweb;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import be.niver.dao.OrganizerDAO;

public class Organizer extends Person  {
	private static final long serialVersionUID = 7787170877756499146L;
	
	/**
	 * les attributs de la classe
	 */
	private int IDPerson_Organizer_fk;
	private Set<Booking> listBooking = new HashSet<>();

	/*******************************************************************************/
	/***
	 * les constructeurs de la classe
	 */
	public Organizer() {
		
	}
	
	public Organizer( int id) {
		this.IDPerson_Organizer_fk = id;
	}

	public Organizer( int iDperson, String firstName, String lastName, String adress, String e_Mail, String passWord, int Role) {
		super(iDperson, firstName, lastName, adress, e_Mail, passWord,Role);
		IDPerson_Organizer_fk = iDperson;
		
	}
	
	
	/*******************************************************************************/
	/***
	 * les getters et les setters 
	 */
	public int getIDPerson_Organizer_fk() {
		return IDPerson_Organizer_fk;
	}

	public void setIDPerson_Organizer_fk(int iDPerson_Organizer_fk) {
		IDPerson_Organizer_fk = iDPerson_Organizer_fk;
	}
	
	public Set<Booking> getListBooking() {
		return listBooking;
	}

	public void setListBooking(Set<Booking> listBooking) {
		this.listBooking = listBooking;
	}
	
	/*******************************************************************************/
	/***
	 * les fonctions de la classe
	 */
	
	@Override
	public String toString() {
		return "Organizer [IDPerson_Organizer_fk=" + IDPerson_Organizer_fk + ", listBooking=" + listBooking + "]";
	}

	
	@Override
	public boolean create(Connection conn) {
		OrganizerDAO dao = new OrganizerDAO(conn);
		return dao.create(this);		
		
	}

	@Override
	public boolean delete(Connection conn) {
		OrganizerDAO dao = new OrganizerDAO(conn);
		return dao.delete(this);		
		
	}

	@Override
	public boolean update(Connection conn) {
		OrganizerDAO dao = new OrganizerDAO(conn);
		return dao.update(this);		
		
	}

	@Override
	public Organizer find(Connection conn) {
		OrganizerDAO dao = new OrganizerDAO(conn);
		return dao.find(this.getIDPerson_Organizer_fk());		
		
	}
	
	
	@Override
	public Organizer login(Connection conn) {
		OrganizerDAO dao = new OrganizerDAO(conn);
		return dao.login(this.getE_Mail(), this.getPassWord());		
		
	}
	
}

