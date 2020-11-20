package be.niver.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class ConnectDataBase {
	private static Connection instance = null;
		
		private ConnectDataBase(){
			try{
				Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
				String url = "jdbc:ucanaccess://./BosquetWallon.accdb";
				instance = DriverManager.getConnection(url);
			}
			catch(ClassNotFoundException ex){
			ex.printStackTrace();
		JOptionPane.showMessageDialog(null, "Classe de driver introuvable" + ex.getMessage());
				System.exit(0);
			}
			catch (SQLException ex) {
		JOptionPane.showMessageDialog(null, "Erreur JDBC : " + ex.getMessage());
			}
			if (instance == null) {
	            JOptionPane.showMessageDialog(null, "La base de données est inaccessible, fermeture du programme.");
	            System.exit(0);
	        }
		}
		
		public static Connection getInstance() {
			if(instance == null){
				new ConnectDataBase();
			}
			return instance;
		}


}
