package be.niver.bosquetwallonweb;

import java.util.HashSet;
import java.util.Set;

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
	
	public Artist(int iDPerson, String firstName, String lastName, String adress, String email, String passWord, Show showArtiste,
			String speciality) {
		super(iDPerson, firstName, lastName, adress, email, passWord);
		ShowArtiste = showArtiste;
		Speciality = speciality;
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
	
	
	/**************************************************************************************/
	/**
	 * les fonctions de la classe
	 * @return
	 */
	
	@Override
	public String toString() {
		return "Artist [IDPerson_Artiste_fk=" + IDPerson_Artiste_fk + ", ShowArtiste=" + ShowArtiste
				+ ", Speciality=" + Speciality + "]";
	}
	
	
}
