package be.niver.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import be.niver.bosquetwallonweb.Order;
import be.niver.bosquetwallonweb.Spectator;


public class OrderDAO extends DAO<Order> {

	public OrderDAO(Connection conn) {
		super(conn);
	}
	
	
	@Override
	public boolean create(Order obj) { 
		boolean result = false;
		try {
			result = updateStatement(String.format("INSERT INTO Order VALUES ( 0 ,%s ,'%s','%s', %s)",  
					obj.getSpectator_oder_fk().getIDPerson_fk(),
					obj.getPaymentMethod(),
					obj.getDeliveryMethod(),
					obj.getPrice()
					));  
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public boolean delete(Order obj) {
		boolean result = false;
		try {

			result = updateStatement(String.format("DELETE FROM Order "
					+ " WHERE IDOrder= %s",  
					obj.getIDOrder()
					));  
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public boolean update(Order obj) {
		
		boolean result = false;
		try {
			result = updateStatement(String.format("UPDATE  Order "
					+ "SET spectator_oder_fk= %s, paymentMethod = '%s', DeliveryMethod= '%s', price =%s "
					+ " WHERE IDOrder = %s", 
					obj.getSpectator_oder_fk().getIDPerson_fk(),
					obj.getPaymentMethod(),
					obj.getDeliveryMethod(),
					obj.getPrice(),
					obj.getIDOrder()
					));  
			//System.out.println("update Order is "+ result);
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
		
	}

	@Override
	public Order find(int id) {
		
		Order obj = new Order();
		try {
			ResultSet result = this.connect
					.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)
					.executeQuery("SELECT * FROM Order INNER JOIN Spectator as S on spectator_oder_fk = S.IDPerson_fk "
							+ " WHERE IDOrder = " + id);
		
			if (result.first())
			{
				
				Spectator  spectator = new Spectator(result.getInt("IDShow"));
				obj = new Order(id, spectator, result.getString("paymentMethod"), result.getString("DeliveryMethod"),result.getInt("price"));
				
			}
		
	
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return obj;
	}

	@Override
	public ArrayList<Order> findAll() {
		ArrayList<Order> objs = new ArrayList<Order>();
		try {
			PreparedStatement ps = connect.prepareStatement(String.format("SELECT * FROM Order INNER JOIN Spectator as S on spectator_oder_fk = S.IDPerson_fk"), 
					ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);  
            ResultSet result = ps.executeQuery();  
            
			while (result.next()) {
				Spectator  spectator = new Spectator(result.getInt("IDShow"));
				Order obj = new Order(result.getInt("IDOrder"), spectator, result.getString("paymentMethod"), result.getString("DeliveryMethod"),result.getInt("price"));
				
				objs.add(obj);
			}
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return objs;
	}

}
