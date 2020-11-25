package be.niver.bosquetwallonweb;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import be.niver.dao.RoomManagerDAO;

public class RoomManager extends Person {
	/***
	 * declaration des variables de la classe
	 */
	private int IDPerson_RoomManager_fk;
	private Set<PlanningOfRoom> listPlanningOfRoom = new HashSet<>();
	
	
	/********************************************************************/
	/***
	 * déclaration des constructeuyrs de la classe
	 */
	public RoomManager() {
		
	}
	
	public RoomManager(int iDperson) {
		IDPerson_RoomManager_fk = iDperson;
	}
	public RoomManager(int iDperson, String firstName, String lastName, String adress, String e_Mail, String passWord,int Role) {
		super(iDperson, firstName, lastName, adress, e_Mail, passWord, Role);
		IDPerson_RoomManager_fk = iDperson;
	}
	
	/******************************************************************/
	/***
	 * declaration des getters et des setters
	 * @return
	 */
	
	public int getIDPerson_RoomManager_fk() {
		return IDPerson_RoomManager_fk;
	}
	public Set<PlanningOfRoom> getListPlanningOfRoom() {
		return listPlanningOfRoom;
	}
	public void setIDPerson_RoomManager_fk(int iDPerson_RoomManager_fk) {
		IDPerson_RoomManager_fk = iDPerson_RoomManager_fk;
	}
	public void setListPlanningOfRoom(Set<PlanningOfRoom> listPlanningOfRoom) {
		this.listPlanningOfRoom = listPlanningOfRoom;
	}

	@Override
	public String toString() {
		return "RoomManager [IDPerson_RoomManager_fk=" + IDPerson_RoomManager_fk + ", listPlanningOfRoom="
				+ listPlanningOfRoom + "]";
	}
	
	/*********************************************************************************/
	/***
	 * les fonctions de la classe
	 */
	
	
	@Override
	public boolean create(Connection conn) {
		RoomManagerDAO dao = new RoomManagerDAO(conn);
		return dao.create(this);		
		
	}

	@Override
	public boolean delete(Connection conn) {
		RoomManagerDAO dao = new RoomManagerDAO(conn);
		return dao.delete(this);		
		
	}

	@Override
	public boolean update(Connection conn) {
		RoomManagerDAO dao = new RoomManagerDAO(conn);
		return dao.update(this);		
		
	}

	public RoomManager find(Connection conn) {
		RoomManagerDAO dao = new RoomManagerDAO(conn);
		return dao.find(this.getIDPerson_RoomManager_fk());		
		
	}
	
	@Override
	public RoomManager login(Connection conn) {
		RoomManagerDAO dao = new RoomManagerDAO(conn);
		return dao.login(this.getE_Mail(), this.getPassWord());		
		
	}
	

}
