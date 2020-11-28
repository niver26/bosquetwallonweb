 package be.niver.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;



import be.niver.bosquetwallonweb.Person;
import be.niver.service.Md5hash;


public class PersonDAO extends DAO<Person> {
	public PersonDAO(Connection conn) {
		super(conn);
	}
	
	@Override
	public  boolean create(Person person) {
		boolean result = false;
		try {
		    String passwordhash = new Md5hash().getMd5(person.getPassWord());
			result = updateStatement(String.format("INSERT INTO Person VALUES ( 0 ,'%s', '%s', '%s', '%s', '%s', %s)",  
					person.getFirstName(),  
					person.getLastName(),  
					person.getAdress(),  
					person.getE_Mail(),  
					person.getPassWord(),
					person.getrole()));  
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
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

	@Override
	public boolean update(Person obj) {
		boolean result = false;
		try {
			 //String passwordhash = new Md5hash().getMd5(obj.getPassWord());
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
			System.out.println("update person is "+ result);
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
		
	}


	@Override
	public Person find(int id) {
		Person person = new Person();
		try {
			PreparedStatement ps = connect.prepareStatement(String.format("SELECT * FROM Person WHERE IDPerson = %s", id), 
					ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);  
            ResultSet result = ps.executeQuery();  
            
			if (result.first())
				person = new Person(id, result.getString("FirstName"), result.getString("LastName"),
						result.getString("Adress"),	result.getString("E_Mail"),result.getString("PassWord"), result.getInt("role"));
		
		
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return person;
	}
	
	
	public Person login(String email, String password ) {
		
		Person person = new Person();
		try {
			System.out.println("password is : "+ password);
			System.out.println("email is : "+ email);
			String passwordhash = new Md5hash().getMd5(password);
			System.out.println("password hash : "+ passwordhash);
			PreparedStatement ps = connect.prepareStatement("SELECT * FROM Person WHERE E_Mail = ? and PassWord = ? ");  
			ps.setString(1, email);
			ps.setString(2, password);
            ResultSet result = ps.executeQuery();  
            
			if (result.next()) {
				System.out.println(result.getInt("IDPerson"));
				person = new Person(result.getInt("IDPerson"), result.getString("FirstName"), result.getString("LastName"),
						result.getString("Adress"),	result.getString("E_Mail"),result.getString("PassWord"), result.getInt("role"));
			}
		
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return person;
	}
	
	@Override
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
						result.getString("Adress"),	result.getString("E_Mail"),result.getString("PassWord"), result.getInt("role"));
				persons.add(person);
			}
		
		
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return persons;
	}
	
	

}
