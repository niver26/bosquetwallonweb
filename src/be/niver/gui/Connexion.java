package be.niver.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

public class Connexion extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordFieldConnexion;
	private JTextField textFieldEmailconnexion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Connexion frame = new Connexion();
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
	public Connexion() {
		setBackground(Color.WHITE);
		initComponents();
		createEvents() ;
	}
	
	/**
	 * this method initComponents() for initializing and creating components
	 * 
	 */
	private void initComponents() 
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 863, 468);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnconnectPageConnexion = new JButton("Connecter");
		btnconnectPageConnexion.setForeground(SystemColor.activeCaptionText);
		btnconnectPageConnexion.setBackground(SystemColor.textHighlight);
		btnconnectPageConnexion.setBounds(531, 316, 98, 46);
		contentPane.add(btnconnectPageConnexion);
		
		JButton btnexitconnexionpage = new JButton("Quiter");
		btnexitconnexionpage.setForeground(SystemColor.activeCaptionText);
		btnexitconnexionpage.setBackground(new Color(220, 20, 60));
		btnexitconnexionpage.setBounds(741, 316, 98, 46);
		contentPane.add(btnexitconnexionpage);
		
		JLabel lblNewLabel = new JLabel("E-Mail");
		lblNewLabel.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 22));
		lblNewLabel.setBounds(531, 123, 308, 31);
		contentPane.add(lblNewLabel);
		
		
		
		JLabel lblNewLabel_1 = new JLabel("Code");
		lblNewLabel_1.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 22));
		lblNewLabel_1.setBounds(531, 205, 308, 31);
		contentPane.add(lblNewLabel_1);
		
		
		JLabel lblNewLabel_2 = new JLabel("Connexion");
		lblNewLabel_2.setForeground(Color.BLUE);
		lblNewLabel_2.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 50));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(531, 33, 308, 60);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_3.setBounds(0, 0, 506, 431);
		contentPane.add(lblNewLabel_3);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(10, 10, 369, 411);
		contentPane.add(panel);
		
		passwordFieldConnexion = new JPasswordField();
		passwordFieldConnexion.setBounds(531, 246, 308, 36);
		contentPane.add(passwordFieldConnexion);
		
		textFieldEmailconnexion = new JTextField();
		textFieldEmailconnexion.setFont(new Font("Vivaldi", Font.BOLD, 20));
		textFieldEmailconnexion.setBounds(531, 164, 308, 31);
		contentPane.add(textFieldEmailconnexion);
		textFieldEmailconnexion.setColumns(10);
		  
		
		
		
	}
	
	
	
	
	/**
	 * this method createEvents() for creating events
	 * 
	 */
	private void createEvents() 
	{
		
		
		
	}
}
