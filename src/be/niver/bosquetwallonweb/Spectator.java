package be.niver.bosquetwallonweb;


import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import be.niver.dao.SpectatorDAO;

public class Spectator extends Person{
	
	private int IDPerson_fk;
	private Set<Order> listOrder = new HashSet<>();
	
	/*************************************************************************/
	/**
	 * les constructeurs
	 */
	public Spectator() {
		
	}
	
	public Spectator(int iDperson) {
		IDPerson_fk = iDperson;
	}

	public Spectator(int iDperson, String firstName, String lastName, String adress, String e_Mail, String passWord, int Role) {
		super(iDperson, firstName, lastName, adress, e_Mail, passWord, Role);
		// TODO Auto-generated constructor stub
		IDPerson_fk = iDperson;
	}

	
	/*************************************************************************/
	/**
	 * les getters et les setters
	 */
	public int getIDPerson_fk() {
		return IDPerson_fk;
	}

	public Set<Order> getListOrder() {
		return listOrder;
	}

	public void setIDPerson_fk(int iDPerson_fk) {
		IDPerson_fk = iDPerson_fk;
	}

	public void setListOrder(Set<Order> listOrder) {
		this.listOrder = listOrder;
	}

	/*************************************************************************/
	/**
	 * les fonctions de la classe
	 */
	
	@Override
	public String toString() {
		return "Spectator [IDPerson_fk=" + IDPerson_fk + ", listOrder=" + listOrder + "]";
	}

	@Override
	public boolean create(Connection conn) {
		SpectatorDAO dao = new SpectatorDAO(conn);
		return dao.create(this);		
		
	}

	@Override
	public boolean delete(Connection conn) {
		SpectatorDAO dao = new SpectatorDAO(conn);
		return dao.delete(this);		
		
	}

	@Override
	public boolean update(Connection conn) {
		SpectatorDAO dao = new SpectatorDAO(conn);
		return dao.update(this);		
		
	}

	@Override
	public Spectator find(Connection conn) {
		SpectatorDAO dao = new SpectatorDAO(conn);
		return dao.find(this.getIDPerson_fk());		
		
	}
	
	@Override
	public Spectator login(Connection conn) {
		SpectatorDAO dao = new SpectatorDAO(conn);
		return dao.login(this.getE_Mail(), this.getPassWord());		
		
	}
	

}
