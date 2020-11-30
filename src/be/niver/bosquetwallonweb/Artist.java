package be.niver.bosquetwallonweb;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import be.niver.dao.ArtistDAO;
import be.niver.dao.PersonDAO;

	public class Artist extends Person {
	private static final long serialVersionUID = 7787170877756499146L;
	
	
	/***
	 * les attributs de la classe
	 */
	private int IDPerson_Artiste_fk;
	private Show ShowArtiste ;
	private String Speciality ;
	
	/***
	 * les constructeurs de la classe
	 */
	public Artist() {
		
	}
	
	public Artist(int iDPerson) {
		IDPerson_Artiste_fk = iDPerson;
	}
	public Artist(int iDPerson, String firstName, String lastName, String adress, String email, String passWord,int Role, Show showArtiste,
			String speciality) {
		super(iDPerson, firstName, lastName, adress, email, passWord, Role);
		ShowArtiste = showArtiste;
		Speciality = speciality;
		IDPerson_Artiste_fk = iDPerson;
		
	}
	
	/**************************************************************************************/
	/**
	 * les Getters et les setters
	 * @return
	 */
	public int getIDPerson_Artiste_fk() {
		return IDPerson_Artiste_fk;
	}

	public void setIDPerson_Artiste_fk(int iDPerson_Artiste_fk) {
		IDPerson_Artiste_fk = iDPerson_Artiste_fk;
	}

	public String getSpeciality() {
		return Speciality;
	}

	public void setSpeciality(String speciality) {
		Speciality = speciality;
	}
	
	public Show getShowArtiste() {
		return ShowArtiste;
	}


	public void setShowArtiste(Show showArtiste) {
		ShowArtiste =showArtiste;
	}
	
	@Override
	public String toString() {
		return "Artist [IDPerson_Artiste_fk=" + IDPerson_Artiste_fk + ", ShowArtiste=" + ShowArtiste + ", Speciality="
				+ Speciality + "]";
	}
	/**************************************************************************************/
	/**
	 * les fonctions de la classe
	 * @return
	 */
	
	
	@Override
	public boolean create(Connection conn) {
		ArtistDAO dao = new ArtistDAO(conn);
		return dao.create(this);		
		
	}

	@Override
	public boolean delete(Connection conn) {
		ArtistDAO dao = new ArtistDAO(conn);
		return dao.delete(this);		
		
	}

	@Override
	public boolean update(Connection conn) {
		ArtistDAO dao = new ArtistDAO(conn);
		return dao.update(this);		
		
	}

	@Override
	public Artist find(Connection conn) {
		ArtistDAO dao = new ArtistDAO(conn);
		return dao.find(this.getIDPerson_Artiste_fk());		
		
	}
	
	@Override
	public Artist login(Connection conn) {
		ArtistDAO dao = new ArtistDAO(conn);
		return dao.login(this.getE_Mail(), this.getPassWord());		
		
	}
	
	
	
}
