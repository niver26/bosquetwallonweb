package be.niver.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GraphicsDevice;
import java.awt.Insets;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Home extends JFrame {

	protected static final JFrame Jframe = null;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Home() {
		initComponents();
		
		
	}
	
	private void initComponents() 
	{
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 758, 613);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBackground(Color.RED);
		lblNewLabel.setIcon(new ImageIcon(Home.class.getResource("/images/fondacceuil.PNG")));
		lblNewLabel.setBounds(0, 0, 734, 90);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_1.setIcon(new ImageIcon(Home.class.getResource("/images/lumiere.jpg")));
		lblNewLabel_1.setBounds(0, 100, 744, 451);
		contentPane.add(lblNewLabel_1);
		
		
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setMargin(new Insets(5, 0, 5, 0));
		menuBar.setFont(new Font("HP Simplified", Font.BOLD, 28));
		setJMenuBar(menuBar);
		
		JMenu mnInscriptionacceuil, mnConnectionacceuil, mnexitacceuil, Bookshowacceuil;
		mnInscriptionacceuil=new JMenu("Inscription");
		mnInscriptionacceuil.setFont(new Font("HP Simplified", Font.BOLD | Font.ITALIC, 15));
		mnInscriptionacceuil.setForeground(Color.BLACK);
		mnInscriptionacceuil.setBackground(Color.BLACK);
		mnConnectionacceuil=new JMenu("Connexion");    
		mnConnectionacceuil.setFont(new Font("HP Simplified", Font.BOLD | Font.ITALIC, 15));
		mnConnectionacceuil.setForeground(Color.BLACK);
		mnexitacceuil=new JMenu("Quiter"); 
		mnexitacceuil.setBackground(Color.RED);
		mnexitacceuil.setHorizontalAlignment(SwingConstants.RIGHT);
		mnexitacceuil.setFont(new Font("HP Simplified", Font.BOLD | Font.ITALIC, 15));
		mnexitacceuil.setForeground(Color.BLACK);
		
		Bookshowacceuil =new JMenu("Consulter les spectacles"); 
		Bookshowacceuil.setHorizontalAlignment(SwingConstants.RIGHT);
		Bookshowacceuil.setFont(new Font("HP Simplified", Font.BOLD | Font.ITALIC, 15));
		Bookshowacceuil.setForeground(Color.BLACK);
		
		
		
		
		menuBar.add(mnInscriptionacceuil);
		menuBar.add(mnConnectionacceuil);
		menuBar.add(Bookshowacceuil);
		menuBar.add(mnexitacceuil);
		/*JMenuItem Spectator, Artiste, Organizer, RoomManager;
		Spectator=new JMenuItem("Spectateur");  
		Spectator.setForeground(Color.BLUE);
		Artiste=new JMenuItem("Artiste");  
		Artiste.setForeground(Color.BLUE);
		Organizer=new JMenuItem("Organisateur");  
		Organizer.setForeground(Color.BLUE);
		RoomManager=new JMenuItem("Gestionnaire");  
		RoomManager.setForeground(Color.BLUE);
		mnInscription.add(Spectator);
		mnInscription.add(Artiste);
		mnInscription.add(Organizer);
		mnInscription.add(RoomManager); */ 
		  
		
		
		
	}
	
	
	
	

}