package be.niver.bosquetwallonweb;

import java.io.Serializable;
import java.sql.Connection;
import java.util.ArrayList;

import be.niver.dao.CategoryRoomDAO;

public class CategoryRoom implements Serializable{
	

	private static final long serialVersionUID = 7787170877756499146L;
	
	/**
	 * les attributs de la classe
	 */
	private int IDCategoryRoom;
	private int nbePlace;
	private int PlaceMax;
	private Configuration configuration_categoryRoom_fk;
	
	
	/*
	 * les constructeurs de la classe
	 */
	public CategoryRoom() {
		
	}
	
	public CategoryRoom(int iDCategoryRoom) {
		IDCategoryRoom = iDCategoryRoom;
	}
	
	public CategoryRoom(int iDCategoryRoom, int nbePlace, int placeMax, Configuration configuration_categoryRoom_fk) {
		IDCategoryRoom = iDCategoryRoom;
		this.nbePlace = nbePlace;
		PlaceMax = placeMax;
		this.configuration_categoryRoom_fk = configuration_categoryRoom_fk;
	}


	/*
	 * les getters et les setters
	 */

	public int getIDCategoryRoom() {
		return IDCategoryRoom;
	}

	public int getNbePlace() {
		return nbePlace;
	}

	public int getPlaceMax() {
		return PlaceMax;
	}

	public Configuration getConfiguration_categoryRoom_fk() {
		return configuration_categoryRoom_fk;
	}

	public void setIDCategoryRoom(int iDCategoryRoom) {
		IDCategoryRoom = iDCategoryRoom;
	}

	public void setNbePlace(int nbePlace) {
		this.nbePlace = nbePlace;
	}

	public void setPlaceMax(int placeMax) {
		PlaceMax = placeMax;
	}

	public void setConfiguration_categoryRoom_fk(Configuration configuration_categoryRoom_fk) {
		this.configuration_categoryRoom_fk = configuration_categoryRoom_fk;
	}

	/*
	 * les methode de la classe
	 */
	
	@Override
	public String toString() {
		return "CategoryRoom [IDCategoryRoom=" + IDCategoryRoom + ", nbePlace=" + nbePlace + ", PlaceMax=" + PlaceMax
				+ ", configuration_categoryRoom_fk=" + configuration_categoryRoom_fk + "]";
	}
	
	public boolean create(Connection conn) {
		CategoryRoomDAO dao = new CategoryRoomDAO(conn);
		return dao.create(this);		
		
	}

	public boolean delete(Connection conn) {
		CategoryRoomDAO dao = new CategoryRoomDAO(conn);
		return dao.delete(this);		
		
	}

	public boolean update(Connection conn) {
		CategoryRoomDAO dao = new CategoryRoomDAO(conn);
		return dao.update(this);		
		
	}

	public CategoryRoom find(Connection conn) {
		CategoryRoomDAO dao = new CategoryRoomDAO(conn);
		return dao.find(this.getIDCategoryRoom());		
		
	}
	
	public ArrayList<CategoryRoom> findAll(Connection conn) {
		CategoryRoomDAO dao = new CategoryRoomDAO(conn);
		ArrayList<CategoryRoom> l = new ArrayList<CategoryRoom>();
		for(var p : dao.findAll()) {
			l.add((CategoryRoom)p);
		}
		return l;		
		
	}
	
	
	
	
	
	
}