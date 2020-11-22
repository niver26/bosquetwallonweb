package be.niver.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

	public abstract class DAO<T> implements IDAO<T> {
		protected Connection connect = null;

		public DAO(Connection conn) {
			this.connect = conn;
		}
		
		
		  @Override
		  public boolean updateStatement(String query) throws SQLException{  
			  PreparedStatement ps = connect.prepareStatement(query); 
			  int result = ps.executeUpdate();
			  System.out.println(result);
              return  result > 0;  
	      }  

}
