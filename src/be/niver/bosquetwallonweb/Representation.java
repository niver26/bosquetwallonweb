package be.niver.bosquetwallonweb;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import be.niver.dao.RepresentationDAO;

public class Representation implements Serializable{
	
	private static final long serialVersionUID = 7787170877756499146L;
	/***
	 * attributs de la classe
	 */
	private int IDRepresentation;
	private Time BiginTime;
	private Time EndTime;
	private Date dateRepresentation;
	
	
	private Set<Show> listShow = new HashSet<>();
	
	
	/***********************************************************************/
	/***
	 * les constructeurs de la classe
	 */
	public Representation() {
		
	}
	public Representation(int iDRepresentation) {
		IDRepresentation = iDRepresentation;
	}
	
	public Representation(int iDRepresentation, Time biginTime, 
			Time endTime, Date DateRepresentation ) {
		IDRepresentation = iDRepresentation;
		BiginTime = biginTime;
		EndTime = endTime;
	    dateRepresentation = DateRepresentation;
		
	}
	
	/*********************************************************************************/
	/***
	 * les getters et les setters de la classe
	 * @return
	 */
	public int getIDRepresentation() {
		return IDRepresentation;
	}


	public Time getBiginTime() {
		return BiginTime;
	}


	public Time getEndTime() {
		return EndTime;
	}

	public Date getDateRepresentation() {
		return dateRepresentation;
	}
	public void setDateRepresentation(Date dateRepresentation) {
		this.dateRepresentation = dateRepresentation;
	}



	public Set<Show> getListShow() {
		return listShow;
	}


	public void setIDRepresentation(int iDRepresentation) {
		IDRepresentation = iDRepresentation;
	}


	public void setBiginTime(Time biginTime) {
		BiginTime = biginTime;
	}


	public void setEndTime(Time endTime) {
		EndTime = endTime;
	}


	


	public void setListShow(Set<Show> listShow) {
		this.listShow = listShow;
	}

	@Override
	public String toString() {
		return  "Date: " +dateRepresentation +" Date de d�but : " + BiginTime + ", Date de fin="
				+ EndTime ;
	}

	/**************************************************************************************/
	/**
	 * les fonctions de la classe
	 * @return
	 */
	
	public boolean create(Connection conn) {
		RepresentationDAO dao = new RepresentationDAO(conn);
		return dao.create(this);		
		
	}

	public boolean delete(Connection conn) {
		RepresentationDAO dao = new RepresentationDAO(conn);
		return dao.delete(this);		
		
	}

	public boolean update(Connection conn) {
		RepresentationDAO dao = new RepresentationDAO(conn);
		return dao.update(this);		
		
	}

	public Representation find(Connection conn) {
		RepresentationDAO dao = new RepresentationDAO(conn);
		return dao.find(this.getIDRepresentation());		
		
	}
	
	public ArrayList<Representation> findAll(Connection conn) {
		RepresentationDAO dao = new RepresentationDAO(conn);
		ArrayList<Representation> l = new ArrayList<Representation>();
		for(var p : dao.findAll()) {
			l.add((Representation)p);
		}
		return l;		
		
	}
	
	

}
