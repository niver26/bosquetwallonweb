package be.niver.bosquetwallonweb;

import java.io.Serializable;
import java.sql.Connection;
import java.util.ArrayList;

import be.niver.dao.CategoryRoomDAO;

public class CategoryRoom implements Serializable{
	private static final long serialVersionUID = 7787170877756499146L;
	
	private int IDCategoryRoom;
	private boolean IsDisponible;
	private Configuration configuration_categoryRoom_fk;
	
	public CategoryRoom() {
		
	}
	
	public CategoryRoom(int iDCategoryRoom, boolean isDisponible, Configuration configuration_categoryRoom_fk) {
		super();
		IDCategoryRoom = iDCategoryRoom;
		IsDisponible = isDisponible;
		this.configuration_categoryRoom_fk = configuration_categoryRoom_fk;
	}

	public int getIDCategoryRoom() {
		return IDCategoryRoom;
	}

	public boolean isIsDisponible() {
		return IsDisponible;
	}

	public Configuration getConfiguration_categoryRoom_fk() {
		return configuration_categoryRoom_fk;
	}

	public void setIDCategoryRoom(int iDCategoryRoom) {
		IDCategoryRoom = iDCategoryRoom;
	}

	public void setIsDisponible(boolean isDisponible) {
		IsDisponible = isDisponible;
	}

	public void setConfiguration_categoryRoom_fk(Configuration configuration_categoryRoom_fk) {
		this.configuration_categoryRoom_fk = configuration_categoryRoom_fk;
	}

	@Override
	public String toString() {
		return "CategoryRoom [IDCategoryRoom=" + IDCategoryRoom + ", IsDisponible=" + IsDisponible
				+ ", configuration_categoryRoom_fk=" + configuration_categoryRoom_fk + "]";
	}
	
	
	/**************************************************************************************/
	/**
	 * les fonctions de la classe
	 * @return
	 */
	
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
