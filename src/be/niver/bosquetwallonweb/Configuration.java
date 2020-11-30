package be.niver.bosquetwallonweb;

import java.io.Serializable;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import be.niver.dao.ConfigurationDAO;

public class Configuration implements Serializable{
	private static final long serialVersionUID = 7787170877756499146L;

	private int IDConfiguration;
	private String Type;
	private String description;
	private Show show_configuration_fk;
	private Set<CategoryRoom> listCategoryRoom= new HashSet<>();
	

	public Configuration() {
		
	}
	public Configuration(int iDConfiguration) {
		IDConfiguration = iDConfiguration;
	}
	
	public Configuration(int iDConfiguration, String type, String description, Show show_configuration_fk) {
		
		IDConfiguration = iDConfiguration;
		Type = type;
		this.description = description;
		this.show_configuration_fk = show_configuration_fk;
	}
	
	public Set<CategoryRoom> getListCategoryRoom() {
		return listCategoryRoom;
	}

	public void setListCategoryRoom(Set<CategoryRoom> listCategoryRoom) {
		this.listCategoryRoom = listCategoryRoom;
	}

	public int getIDConfiguration() {
		return IDConfiguration;
	}

	public String getType() {
		return Type;
	}

	public String getDescription() {
		return description;
	}

	public Show getShow_configuration_fk() {
		return show_configuration_fk;
	}

	public void setIDConfiguration(int iDConfiguration) {
		IDConfiguration = iDConfiguration;
	}

	public void setType(String type) {
		Type = type;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setShow_configuration_fk(Show show_configuration_fk) {
		this.show_configuration_fk = show_configuration_fk;
	}

	@Override
	public String toString() {
		return "Configuration [IDConfiguration=" + IDConfiguration + ", Type=" + Type + ", description=" + description
				+ ", show_configuration_fk=" + show_configuration_fk + ", listCategoryRoom=" + listCategoryRoom + "]";
	}
	
	/**************************************************************************************/
	/**
	 * les fonctions de la classe
	 * @return
	 */
	
	public boolean create(Connection conn) {
		ConfigurationDAO dao = new ConfigurationDAO(conn);
		return dao.create(this);		
		
	}

	public boolean delete(Connection conn) {
		ConfigurationDAO dao = new ConfigurationDAO(conn);
		return dao.delete(this);		
		
	}

	public boolean update(Connection conn) {
		ConfigurationDAO dao = new ConfigurationDAO(conn);
		return dao.update(this);		
		
	}

	public Configuration find(Connection conn) {
		ConfigurationDAO dao = new ConfigurationDAO(conn);
		return dao.find(this.getIDConfiguration());		
		
	}
	
	public ArrayList<Configuration> findAll(Connection conn) {
		ConfigurationDAO dao = new ConfigurationDAO(conn);
		ArrayList<Configuration> l = new ArrayList<Configuration>();
		for(var p : dao.findAll()) {
			l.add((Configuration)p);
		}
		return l;		
		
	}
	
	
	
	
	
	
	
}
