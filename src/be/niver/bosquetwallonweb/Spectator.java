package be.niver.bosquetwallonweb;


import java.util.HashSet;
import java.util.Set;

public class Spectator extends Person{
	
	private int IDPerson_fk;
	private Set<Order> listOrder = new HashSet<>();
	
	/*************************************************************************/
	/**
	 * les constructeurs
	 */
	public Spectator() {
		super();
		
	}

	public Spectator(int iDperson, String firstName, String lastName, String adress, String e_Mail, String passWord) {
		super(iDperson, firstName, lastName, adress, e_Mail, passWord);
		// TODO Auto-generated constructor stub
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

	
}
