 package be.niver.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JList;



import be.niver.bosquetwallonweb.Person;


public abstract class PersonDAO extends DAO<Person> {
	public PersonDAO(Connection conn) {
		super(conn);
	}

	public  boolean create(Person person) {
		boolean result = false;
		try {

			result = updateStatement(String.format("INSERT INTO Person VALUES ( null ,'%s', '%s', '%s', '%s', '%s')",  
					person.getFirstName(),  
					person.getLastName(),  
					person.getAdress(),  
					person.getE_Mail(),  
					person.getPassWord()));  
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	public boolean delete(Person obj) {
		boolean result = false;
		try {

			result = updateStatement(String.format("DELETE FROM Person "
					+ " WHERE IDPerson= %s",  
					obj.getIDperson()
					));  
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	public boolean update(Person obj) {
		boolean result = false;
		try {

			result = updateStatement(String.format("UPDATE  Person "
					+ "SET FirstName = '%s', LastName = '%s', Adress = '%s', "
					+ "E_Mail =  '%s', PassWord = '%s'"
					+ " WHERE IDPerson= %s",  
					obj.getFirstName(),  
					obj.getLastName(),  
					obj.getAdress(),  
					obj.getE_Mail(),  
					obj.getPassWord(),
					obj.getIDperson()
					));  
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
		
	}


	public Person find(int id) {
		Person person = new Person();
		try {
			PreparedStatement ps = connect.prepareStatement(String.format("SELECT * FROM Person WHERE IDPerson = %s", id), 
					ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);  
            ResultSet result = ps.executeQuery();  
            
			if (result.first())
				person = new Person(id, result.getString("FirstName"), result.getString("LastName"),
						result.getString("Adress"),	result.getString("E_Mail"),result.getString("PassWord"));
		
		
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return person;
	}
	

	public Person findByEmail(String email ) {
		Person person = new Person();
		try {
			PreparedStatement ps = connect.prepareStatement(String.format("SELECT * FROM Person WHERE E_Mail = %s", email), 
					ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);  
            ResultSet result = ps.executeQuery();  
            
			if (result.first())
				person = new Person(result.getInt("IDPerson"), result.getString("FirstName"), result.getString("LastName"),
						result.getString("Adress"),	result.getString("E_Mail"),result.getString("PassWord"));
		
		
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return person;
	}
	
	
	public ArrayList<Person> findAll( ) {
		ArrayList<Person> persons = new ArrayList<Person>();
		try {
			PreparedStatement ps = connect.prepareStatement(String.format("SELECT * FROM Person"), 
					ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);  
            ResultSet result = ps.executeQuery();  
            
			while (result.next()) {
				
				if(result.getString("stamp").contains("inactive"))  
					continue;  

				Person person = new Person(result.getInt("IDPerson"), result.getString("FirstName"), result.getString("LastName"),
						result.getString("Adress"),	result.getString("E_Mail"),result.getString("PassWord"));
				persons.add(person);
			}
		
		
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return persons;
	}
	
	

}
