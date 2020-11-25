package be.niver.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import be.niver.bosquetwallonweb.Person;

import java.awt.Color;

public class SpaceOrganizer extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SpaceOrganizer frame = new SpaceOrganizer();
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
	public SpaceOrganizer() {
		initComponnent();
		
		
	}
	
	private void initComponnent() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1107, 601);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setMargin(new Insets(5, 0, 5, 0));
		menuBar.setFont(new Font("HP Simplified", Font.BOLD, 28));
		setJMenuBar(menuBar);
		
		JMenu mnexitacceuil, BooksReservationOrganizer, mnuser, mnHome, mnPagnier;
		mnexitacceuil=new JMenu("Quiter"); 
		mnexitacceuil.setBackground(Color.RED);
		mnexitacceuil.setHorizontalAlignment(SwingConstants.RIGHT);
		mnexitacceuil.setFont(new Font("HP Simplified", Font.BOLD | Font.ITALIC, 15));
		mnexitacceuil.setForeground(Color.BLACK);
		
		BooksReservationOrganizer =new JMenu("Mes Reservations"); 
		BooksReservationOrganizer.setHorizontalAlignment(SwingConstants.RIGHT);
		BooksReservationOrganizer.setFont(new Font("HP Simplified", Font.BOLD | Font.ITALIC, 15));
		BooksReservationOrganizer.setForeground(Color.BLACK);
		
		mnHome =new JMenu("Accueil"); 
		mnHome.setHorizontalAlignment(SwingConstants.RIGHT);
		mnHome.setFont(new Font("HP Simplified", Font.BOLD | Font.ITALIC, 15));
		mnHome.setForeground(Color.BLACK);
		
		
	
		if(Person.CurrentUser != null && Person.CurrentUser.getIDperson() >0) {
			mnuser=new JMenu(Person.CurrentUser.getFirstName() + " " +  Person.CurrentUser.getLastName()); 
			mnuser.setBackground(Color.RED);
			mnuser.setHorizontalAlignment(SwingConstants.LEFT);
			mnuser.setFont(new Font("HP Simplified", Font.BOLD | Font.ITALIC, 15));
			mnuser.setForeground(Color.BLACK);
			
			menuBar.add(mnuser);
			
			// action
			mnuser.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					
				}
			});
		}
		
		menuBar.add(BooksReservationOrganizer);
		menuBar.add(mnHome);
		menuBar.add(mnexitacceuil);
	}

}
