package be.niver.bosquetwallonweb;

import java.io.Serializable;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import be.niver.dao.PersonDAO;
import be.niver.dao.PersonDAO;

public class Person implements Serializable {
	private static final long serialVersionUID = 7787170877756499146L;
	
	private int IDperson ;
	private String FirstName;
	private String LastName;
	private String Adress;
	private String E_Mail;
	private String PassWord;
	private int role;
	public static Person CurrentUser;
	
	
	public Person() {
		
	}
	
	public Person(int iDperson, String firstName, String lastName, String adress, String e_Mail, String passWord, int Role) {
	
		IDperson = iDperson;
		FirstName = firstName;
		LastName = lastName;
		Adress = adress;
		E_Mail = e_Mail;
		PassWord = passWord;
		role =Role;
	}
	
	
	public int getIDperson() {
		return IDperson;
	}
	public int getrole() {
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
	public void setrole(int Role) {
		role = Role;
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
				+ Adress + ", E_Mail=" + E_Mail + ", PassWord=" + PassWord + ", role=" + role + "]";
	}
	
	/**
	 * fonctions
	 */

	
	public boolean create(Connection conn) {
		PersonDAO dao = new PersonDAO(conn);
		return dao.create(this);		
		
	}

	public boolean delete(Connection conn) {
		PersonDAO dao = new PersonDAO(conn);
		return dao.delete(this);		
		
	}

	public boolean update(Connection conn) {
		PersonDAO dao = new PersonDAO(conn);
		return dao.update(this);		
		
	}

	public Person find(Connection conn) {
		PersonDAO dao = new PersonDAO(conn);
		return dao.find(this.getIDperson());		
		
	}
	
	public ArrayList<Person> findAll(Connection conn) {
		PersonDAO dao = new PersonDAO(conn);
		ArrayList<Person> l = new ArrayList<Person>();
		for(var p : dao.findAll()) {
			l.add((Person)p);
		}
		return l;		
		
	}
	
	public Person login(Connection conn) {
		PersonDAO dao = new PersonDAO(conn);
		return dao.login(this.getE_Mail(), this.getPassWord());		
		
	}
	

}
