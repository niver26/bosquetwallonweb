package be.niver.bosquetwallonweb;

import java.util.HashSet;
import java.util.Set;

	class Artist extends Person {
		
	private static final long serialVersionUID = 7787170877756499146L;
	
	private Set<Show> ListShowArtiste = new HashSet<>();
	private String Speciality ;
	
	
	public Artist(int iDPerson, String firstName, String lastName, String adress, String email, String passWord,
			int crediCartNumber, double crediCartBalance, int cartPassCode, Set<Show> listShowArtiste,
			String speciality) {
		super(iDPerson, firstName, lastName, adress, email, passWord, crediCartNumber, crediCartBalance,
				cartPassCode);
		ListShowArtiste = listShowArtiste;
		Speciality = speciality;
	}
	
	public String getSpeciality() {
		return Speciality;
	}

	public void setSpeciality(String speciality) {
		Speciality = speciality;
	}
	
	public Set<Show> getListShowArtiste() {
		return ListShowArtiste;
	}


	public void setListShowArtiste(Set<Show> listShowArtiste) {
		ListShowArtiste = listShowArtiste;
	}
	
	
	
	
	
}
