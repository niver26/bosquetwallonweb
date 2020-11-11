package be.niver.bosquetwallonweb;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;



public class Person implements Serializable {
	


	


	private static final long serialVersionUID = 7787170877756499146L;
	
	private int IDPerson;
	private String FirstName;
	private String LastName;
	private String Adress;
	private String Email;
	private String PassWord;
	private int crediCartNumber;
	private double crediCartBalance;
	private int cartPassCode;
	
	/*********************/
	private Set<Person> listPerson = new HashSet<>();
	/*****/
	
	public Person(int iDPerson, String firstName, String lastName, String adress, 
			String email, String passWord,int crediCartNumber, double crediCartBalance, 
			int cartPassCode) {
		
		IDPerson = iDPerson;
		FirstName = firstName;
		LastName = lastName;
		Adress = adress;
		Email = email;
		PassWord = passWord;
		this.crediCartNumber = crediCartNumber;
		this.crediCartBalance = crediCartBalance;
		this.cartPassCode = cartPassCode;
		
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public int getIDPerson() {
		return IDPerson;
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

	public String getEmail() {
		return Email;
	}

	public String getPassWord() {
		return PassWord;
	}

	public void setIDPerson(int iDPerson) {
		IDPerson = iDPerson;
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

	public void setEmail(String email) {
		Email = email;
	}

	public void setPassWord(String passWord) {
		PassWord = passWord;
	}
	
	public void addPerson(Person pers) {
		if (!listPerson.contains(pers))
			listPerson.add(pers);
	}

	public void removePerson(Person pers) {
		this.listPerson.remove(pers);
	}


	public boolean equal(Person cls) {
		return this.getIDPerson() == cls.getIDPerson();
	}
	
	public int getCrediCartNumber() {
		return crediCartNumber;
	}

	public double getCrediCartBalance() {
		return crediCartBalance;
	}

	public int getCartPassCode() {
		return cartPassCode;
	}

	public void setCrediCartNumber(int crediCartNumber) {
		this.crediCartNumber = crediCartNumber;
	}

	public void setCrediCartBalance(double crediCartBalance) {
		this.crediCartBalance = crediCartBalance;
	}

	public void setCartPassCode(int cartPassCode) {
		this.cartPassCode = cartPassCode;
	}

	
/********************************************************/
	public Set<Person> getListPerson() {
		return listPerson;
	}

	public void setListPerson(Set<Person> listPerson) {
		this.listPerson = listPerson;
	}
	
	
	

}
