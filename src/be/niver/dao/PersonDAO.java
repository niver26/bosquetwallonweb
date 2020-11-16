 package be.niver.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JList;



import be.niver.bosquetwallonweb.Person;


public class PersonDAO extends DAO<Person> {
	public PersonDAO(Connection conn) {
		super(conn);
	}

	public boolean create(Person obj) {
		return false;
	}

	public boolean delete(Person obj) {
		return false;
	}

	public boolean update(Person obj) {
		return false;
	}


	public Person find(int id) {
		Person person = new Person();
		try {
			ResultSet result = this.connect
					.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)
					.executeQuery("SELECT * FROM Person WHERE IDPerson = " + id);
			if (result.first())
				person = new Person(id, result.getString("FirtsName"), result.getString("LastName"),
						result.getString("Adress"),	result.getString("E_Mail"),result.getString("PassWord"),
						result.getInt("creditCartNumber"),result.getDouble("creditCartBalance"), result.getInt("cartPassCode"));
		
		
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return person;
	}
	
	/*public List<Person> list(){
		List<Person> list = new List<Person>();
		try
		{
		ResultSet result = this.connect.createStatement(
		ResultSet.TYPE_SCROLL_INSENSITIVE,
		ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM Person ");
		while(result.next()) //verif pri
		{
		list.add(new Person(result.getInt("IDPerson"), result.getString("FirtName"), result.getString("LastName"),
				result.getString("Adress"),	result.getString("E_Mail"),result.getString("PassWord"),
				result.getInt("crediCartNumber"),result.getDouble("crediCartBalance"), result.getInt("cartPassCode")));
		}
		}
		catch(SQLException e){
		e.printStackTrace();
		}
		return list;
		}*/

	

}
