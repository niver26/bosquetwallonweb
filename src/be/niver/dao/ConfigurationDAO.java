package be.niver.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import be.niver.bosquetwallonweb.Configuration;
import be.niver.bosquetwallonweb.Show;


public class ConfigurationDAO extends DAO<Configuration> {

	public ConfigurationDAO(Connection conn) {
		super(conn);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean create(Configuration obj) { 
		boolean result = false;
		try {
			result = updateStatement(String.format("INSERT INTO Configuration VALUES ( 0 ,'%s','%s', %s)",  
					obj.getType(),
					obj.getDescription(),
					obj.getShow_configuration_fk().getIDShow()
					));  
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public boolean delete(Configuration obj) {
		boolean result = false;
		try {

			result = updateStatement(String.format("DELETE FROM Configuration "
					+ " WHERE IDConfiguration= %s",  
					obj.getIDConfiguration()
					));  
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public boolean update(Configuration obj) {
		
		boolean result = false;
		try {
			result = updateStatement(String.format("UPDATE  Configuration "
					+ "SET Type = '%s', description = '%s', show_configuration_fk= %s "
					+ " WHERE IDConfiguration = %s", 
					obj.getType(),
					obj.getDescription(),
					obj.getShow_configuration_fk().getIDShow(),
					obj.getIDConfiguration()
					));  
			//System.out.println("update Configuration is "+ result);
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
		
	}

	@Override
	public Configuration find(int id) {
		 
		
		Configuration obj = new Configuration();
		try {
			ResultSet result = this.connect
					.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)
					.executeQuery("SELECT * FROM Configuration as Ca INNER JOIN Show as S on Ca.show_configuration_fk = S.IDShow "
							+ " WHERE IDConfiguration = " + id);
		
			if (result.first())
			{
				
				Show  show = new Show(result.getInt("IDShow"));
				obj = new Configuration(id, result.getString("Type"), result.getString("description"),show);
				
			}
		
	
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return obj;
	}

	@Override
	public ArrayList<Configuration> findAll() {
		ArrayList<Configuration> objs = new ArrayList<Configuration>();
		try {
			PreparedStatement ps = connect.prepareStatement(String.format("SELECT * FROM Configuration as Ca INNER JOIN Configuration as Co on Ca.configuration_categoryRoom_fk = Co.IDConfiguration "), 
					ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);  
            ResultSet result = ps.executeQuery();  
            
			while (result.next()) {
				Show  show = new Show(result.getInt("IDShow"));
				Configuration	obj = new Configuration(result.getInt("IDConfiguration"), result.getString("Type"), result.getString("description"),show);
				
				objs.add(obj);
			}
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return objs;
	}
	

}
