package be.niver.bosquetwallonweb;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Place implements Serializable{
	private static final long serialVersionUID = 7787170877756499146L;

	
	private int IDPlace;
	private double price;
	private String configuration;
	private boolean isDispobible;
	private Order order_place_fk;
	private Set<Representation> listRepresentation = new HashSet<>();
	
	public Place() {
		
	}
	
	public Place(int iDPlace, double price, String configuration, boolean isDispobible, Order order_place_fk) {
		
		IDPlace = iDPlace;
		this.price = price;
		this.configuration = configuration;
		this.isDispobible = isDispobible;
		this.order_place_fk = order_place_fk;
		
	}

	
	
	public Set<Representation> getListRepresentation() {
		return listRepresentation;
	}

	public void setListRepresentation(Set<Representation> listRepresentation) {
		this.listRepresentation = listRepresentation;
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

	public Order getOrder_place_fk() {
		return order_place_fk;
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

	public void setOrder_place_fk(Order order_place_fk) {
		this.order_place_fk = order_place_fk;
	}
	
	
	
}
