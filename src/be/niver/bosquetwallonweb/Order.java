package be.niver.bosquetwallonweb;

import java.io.Serializable;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import be.niver.dao.OrderDAO;

public class Order implements Serializable{
	private static final long serialVersionUID = 7787170877756499146L;
	
	
	private int IDOrder;
	private Spectator spectator_oder_fk;
	private String paymentMethod;
	private String DeliveryMethod;
	private double price;
	private Set<Place> listPlace = new HashSet<>();
	
	
	public Order() 
	{
		
	}
	
	public Order(int iDOrder) {
		IDOrder = iDOrder;
	}
	
	public Order(int iDOrder, Spectator spectator_oder_fk, String paymentMethod, String deliveryMethod, double price) {
		IDOrder = iDOrder;
		this.spectator_oder_fk = spectator_oder_fk;
		this.paymentMethod = paymentMethod;
		DeliveryMethod = deliveryMethod;
		this.price = price;
	}
	
	public Set<Place> getListPlace() {
		return listPlace;
	}

	public void setListPlace(Set<Place> listPlace) {
		this.listPlace = listPlace;
	}

	public int getIDOrder() {
		return IDOrder;
	}

	public Spectator getSpectator_oder_fk() {
		return spectator_oder_fk;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public String getDeliveryMethod() {
		return DeliveryMethod;
	}

	public double getPrice() {
		return price;
	}

	public void setIDOrder(int iDOrder) {
		IDOrder = iDOrder;
	}

	public void setSpectator_oder_fk(Spectator spectator_oder_fk) {
		this.spectator_oder_fk = spectator_oder_fk;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public void setDeliveryMethod(String deliveryMethod) {
		DeliveryMethod = deliveryMethod;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Order [IDOrder=" + IDOrder + ", spectator_oder_fk=" + spectator_oder_fk + ", paymentMethod="
				+ paymentMethod + ", DeliveryMethod=" + DeliveryMethod + ", price=" + price + ", listPlace=" + listPlace
				+ "]";
	}

	
	/**************************************************************************************/
	/**
	 * les fonctions de la classe
	 * @return
	 */
	
	public boolean create(Connection conn) {
		OrderDAO dao = new OrderDAO(conn);
		return dao.create(this);		
		
	}

	public boolean delete(Connection conn) {
		OrderDAO dao = new OrderDAO(conn);
		return dao.delete(this);		
		
	}

	public boolean update(Connection conn) {
		OrderDAO dao = new OrderDAO(conn);
		return dao.update(this);		
		
	}

	public Order find(Connection conn) {
		OrderDAO dao = new OrderDAO(conn);
		return dao.find(this.getIDOrder());		
		
	}
	
	public ArrayList<Order> findAll(Connection conn) {
		OrderDAO dao = new OrderDAO(conn);
		ArrayList<Order> l = new ArrayList<Order>();
		for(var p : dao.findAll()) {
			l.add((Order)p);
		}
		return l;		
		
	}
	

}
