package be.niver.bosquetwallonweb;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Person implements Serializable {
	private static final long serialVersionUID = 7787170877756499146L;
	
	private int IDperson ;
	private String FirstName;
	private String LastName;
	private String Adress;
	private String E_Mail;
	private String PassWord;
	
	
	public Person() {
		
	}
	
	public Person(int iDperson, String firstName, String lastName, String adress, String e_Mail, String passWord) {
	
		IDperson = iDperson;
		FirstName = firstName;
		LastName = lastName;
		Adress = adress;
		E_Mail = e_Mail;
		PassWord = passWord;
	}
	
	
	public int getIDperson() {
		return IDperson;
	}


	public String getFirstName() {
		return FirstName;
	}


	public String getLastName() {
		return LastName;
	}


	public String getAdress() {
		return Adress;
	}


	public String getE_Mail() {
		return E_Mail;
	}


	public String getPassWord() {
		return PassWord;
	}


	public void setIDperson(int iDperson) {
		IDperson = iDperson;
	}


	public void setFirstName(String firstName) {
		FirstName = firstName;
	}


	public void setLastName(String lastName) {
		LastName = lastName;
	}


	public void setAdress(String adress) {
		Adress = adress;
	}


	public void setE_Mail(String e_Mail) {
		E_Mail = e_Mail;
	}


	public void setPassWord(String passWord) {
		PassWord = passWord;
	}


	@Override
	public String toString() {
		return "Person [IDperson=" + IDperson + ", FirstName=" + FirstName + ", LastName=" + LastName + ", Adress="
				+ Adress + ", E_Mail=" + E_Mail + ", PassWord=" + PassWord + "]";
	}


	
}