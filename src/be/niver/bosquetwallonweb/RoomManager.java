package be.niver.bosquetwallonweb;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

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
	
	public RoomManager(int iDperson, String firstName, String lastName, String adress, String e_Mail, String passWord,
			int creditCartNumber, double creditCartBalance, int cartPassCode) {
		super(iDperson, firstName, lastName, adress, e_Mail, passWord, creditCartNumber, creditCartBalance, cartPassCode);
		
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
	
	

}
