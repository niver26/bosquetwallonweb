package test;

import be.niver.bosquetwallonweb.*;
import be.niver.dao.*;


public class Tester {
	public static void main(String[] args) {
			DAO<Person> personDAO = new PersonDAO(be.niver.connect.ConnectDataBase.getInstance());
			for (int i = 1; i < 4; i++) {
				Person person = personDAO.find(i);
				System.out.println("Person N°: " + person.getIDperson() + "  Nom:  " + person.getFirstName() + "  Prenom: " + person.getLastName()
				+ "  Adresse:  " + person.getAdress() + "  E_Mail: " + person.getE_Mail()+ "  mot de passe:  " + person.getPassWord() + "  Numero cate de crédit: "
						+person.getCreditCartNumber()+"  solde carte de credit: " + person.getCreditCartBalance()
						+ "  code carte: " + person.getCartPassCode());
			}
			
			
			
			
			
		
	}
		
		
}


