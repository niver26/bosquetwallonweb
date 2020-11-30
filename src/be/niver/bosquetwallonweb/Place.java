package be.niver.bosquetwallonweb;

import java.io.Serializable;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import be.niver.dao.PlaceDAO;

public class Place implements Serializable{
	private static final long serialVersionUID = 7787170877756499146L;

	
	private int IDPlace;
	private double price;
	private String configuration;
	private boolean isDispobible;
	private Representation representation_place_fk;
	
	
	public Place() {
		
	}
	
	public Place(int iDPlace) {
		IDPlace = iDPlace;
	}
	public Place(int iDPlace, double price, String configuration, boolean isDispobible, Representation representation_place_fk) {
		
		IDPlace = iDPlace;
		this.price = price;
		this.configuration = configuration;
		this.isDispobible = isDispobible;
		this.representation_place_fk = representation_place_fk;
		
	}


	public int getIDPlace() {
		return IDPlace;
	}

	public double getPrice() {
		return price;
	}

	public String getConfiguration() {
		return configuration;
	}

	public boolean isDispobible() {
		return isDispobible;
	}

	public Representation getRepresentation_place_fk() {
		return representation_place_fk;
	}

	public void setIDPlace(int iDPlace) {
		IDPlace = iDPlace;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setConfiguration(String configuration) {
		this.configuration = configuration;
	}

	public void setDispobible(boolean isDispobible) {
		this.isDispobible = isDispobible;
	}

	public void setRepresentation_place_fk(Representation representation_place_fk) {
		this.representation_place_fk = representation_place_fk;
	}
	
	@Override
	public String toString() {
		return " price: " + price +  ", Disponibilité : "
				+ isDispobible + " representation_place_fk: " + representation_place_fk ;
	}
	
	
	/**************************************************************************************/
	/**
	 * les fonctions de la classe
	 * @return
	 */
	
	public boolean create(Connection conn) {
		PlaceDAO dao = new PlaceDAO(conn);
		return dao.create(this);		
		
	}

	public boolean delete(Connection conn) {
		PlaceDAO dao = new PlaceDAO(conn);
		return dao.delete(this);		
		
	}

	public boolean update(Connection conn) {
		PlaceDAO dao = new PlaceDAO(conn);
		return dao.update(this);		
		
	}

	public Place find(Connection conn) {
		PlaceDAO dao = new PlaceDAO(conn);
		return dao.find(this.getIDPlace());		
		
	}
	
	public ArrayList<Place> findAll(Connection conn) {
		PlaceDAO dao = new PlaceDAO(conn);
		ArrayList<Place> l = new ArrayList<Place>();
		for(var p : dao.findAll()) {
			l.add((Place)p);
		}
		return l;		
		
	}
	
	
}
