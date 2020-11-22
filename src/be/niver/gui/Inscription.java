package be.niver.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import be.niver.bosquetwallonweb.Organizer;
import be.niver.bosquetwallonweb.Person;
import be.niver.bosquetwallonweb.RoomManager;
import be.niver.bosquetwallonweb.Spectator;
import be.niver.dao.ArtistDAO;
import be.niver.dao.DAO;
import be.niver.dao.OrganizerDAO;
import be.niver.dao.PersonDAO;
import be.niver.dao.RoomManagerDAO;
import be.niver.dao.SpectatorDAO;
import be.niver.service.Md5hash;
import be.niver.service.Md5hashInterface;

import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class Inscription extends JFrame  {

	private JPanel contentPane;
	private JPasswordField passwordFieldInscription;
	private JTextField textFieldemailInscription;
	private JTextField textFieldadresseInscription;
	private JTextField textFieldprenomInscription;
	private JTextField textFieldNomInscription;
	private Inscription frame;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inscription frame = new Inscription();
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
	public Inscription() {
		setBackground(new Color(191, 205, 219));
		initComponents();
		createEvents();
		
	}
	private void initComponents() 
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 902, 552);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Inscription Bosquet Wallon");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 33));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(141, 10, 615, 33);
		contentPane.add(lblNewLabel);
		
		JLabel lblNomInscription = new JLabel("Nom");
		lblNomInscription.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 20));
		lblNomInscription.setHorizontalAlignment(SwingConstants.LEFT);
		lblNomInscription.setBounds(10, 212, 90, 27);
		contentPane.add(lblNomInscription);
		
		
		
		JLabel lblPrenom = new JLabel("Prenom");
		lblPrenom.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 20));
		lblPrenom.setBounds(10, 248, 90, 27);
		contentPane.add(lblPrenom);
		
		
		
		JLabel lblNewLabel_1 = new JLabel("Adresse");
		lblNewLabel_1.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1.setBounds(10, 285, 90, 28);
		contentPane.add(lblNewLabel_1);
		
		
		
		JRadioButton rdbtnSpectateurInscription = new JRadioButton("Un Spectateur");
		rdbtnSpectateurInscription.setBackground(Color.WHITE);
		rdbtnSpectateurInscription.setFont(new Font("Vivaldi", Font.BOLD, 20));
		rdbtnSpectateurInscription.setBounds(10, 165, 182, 27);
		contentPane.add(rdbtnSpectateurInscription);
		
		JRadioButton rdbtnOrganissateurInscription = new JRadioButton("Un Organissateur");
		rdbtnOrganissateurInscription.setBackground(Color.WHITE);
		rdbtnOrganissateurInscription.setFont(new Font("Vivaldi", Font.BOLD, 20));
		rdbtnOrganissateurInscription.setBounds(10, 128, 182, 27);
		contentPane.add(rdbtnOrganissateurInscription);
		
		JRadioButton rdbtnGestionnaireInscription = new JRadioButton("Un Gestionnaire");
		rdbtnGestionnaireInscription.setBackground(Color.WHITE);
		rdbtnGestionnaireInscription.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 20));
		rdbtnGestionnaireInscription.setBounds(10, 86, 182, 29);
		contentPane.add(rdbtnGestionnaireInscription);
		
		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnSpectateurInscription);
		group.add(rdbtnOrganissateurInscription);
		group.add(rdbtnGestionnaireInscription);
		
		JLabel lblNewLabel_3 = new JLabel("Qui \u00EAtes-vous?");
		lblNewLabel_3.setForeground(Color.BLUE);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Vivaldi", Font.BOLD, 22));
		lblNewLabel_3.setBounds(10, 53, 182, 27);
		contentPane.add(lblNewLabel_3);
		
		JButton btnvaliderPageInscription = new JButton("Valider");
		btnvaliderPageInscription.setForeground(Color.BLACK);
		btnvaliderPageInscription.setBackground(SystemColor.textHighlight);
		btnvaliderPageInscription.setBounds(157, 459, 98, 46);
		contentPane.add(btnvaliderPageInscription);
		
		
		JButton btnexitPageInscription = new JButton("Quiter");
		btnexitPageInscription.setForeground(Color.BLACK);
		btnexitPageInscription.setBackground(new Color(220, 20, 60));
		btnexitPageInscription.setBounds(643, 459, 98, 46);
		contentPane.add(btnexitPageInscription);
		
		JLabel lblNewLabel_1_1 = new JLabel("E-Mail");
		lblNewLabel_1_1.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1_1.setBounds(10, 323, 90, 28);
		contentPane.add(lblNewLabel_1_1);
		
		
		JLabel lblNewLabel_1_2 = new JLabel("Code");
		lblNewLabel_1_2.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1_2.setBounds(10, 361, 90, 28);
		contentPane.add(lblNewLabel_1_2);
		
		passwordFieldInscription = new JPasswordField();
		passwordFieldInscription.setBounds(110, 361, 228, 28);
		contentPane.add(passwordFieldInscription);
		
		textFieldemailInscription = new JTextField();
		textFieldemailInscription.setFont(new Font("Vivaldi", Font.BOLD, 20));
		textFieldemailInscription.setBounds(110, 323, 228, 28);
		contentPane.add(textFieldemailInscription);
		textFieldemailInscription.setColumns(10);
		
		textFieldadresseInscription = new JTextField();
		textFieldadresseInscription.setFont(new Font("Vivaldi", Font.BOLD, 20));
		textFieldadresseInscription.setColumns(10);
		textFieldadresseInscription.setBounds(110, 288, 228, 28);
		contentPane.add(textFieldadresseInscription);
		
		textFieldprenomInscription = new JTextField();
		textFieldprenomInscription.setFont(new Font("Vivaldi", Font.BOLD, 20));
		textFieldprenomInscription.setColumns(10);
		textFieldprenomInscription.setBounds(110, 254, 228, 28);
		contentPane.add(textFieldprenomInscription);
		
		textFieldNomInscription = new JTextField();
		textFieldNomInscription.setFont(new Font("Vivaldi", Font.BOLD, 20));
		textFieldNomInscription.setColumns(10);
		textFieldNomInscription.setBounds(110, 218, 228, 28);
		contentPane.add(textFieldNomInscription);
		
		JRadioButton rdbtnconcentementInscription = new JRadioButton("Je consens \u00E0 la collecte et au traitement de mes donn\u00E9es personnelles tel que d\u00E9fini dans la politique de protection de donn\u00E9es ");
		rdbtnconcentementInscription.setForeground(Color.PINK);
		rdbtnconcentementInscription.setFont(new Font("Arial", Font.BOLD, 13));
		rdbtnconcentementInscription.setBackground(Color.WHITE);
		rdbtnconcentementInscription.setBounds(10, 395, 858, 25);
		contentPane.add(rdbtnconcentementInscription);
		
		JLabel lblNewLabel_2 = new JLabel("personnelles afin de b\u00E9n\u00E9ficier des services de l\u2019application Bosquet wallon");
		lblNewLabel_2.setForeground(Color.PINK);
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_2.setBounds(33, 422, 517, 16);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButtonconnecterInscription = new JButton("se connecter");
		btnNewButtonconnecterInscription.setBounds(10, 10, 121, 33);
		contentPane.add(btnNewButtonconnecterInscription);
		
		
		
		
		
		
		
		
		
		
		// action
		// ajouter l'action
				btnvaliderPageInscription.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						
					try {
						Person person = null;
						
						if(textFieldprenomInscription.getText().trim() != "" 
								&& textFieldNomInscription.getText().trim() != "" 
								&& textFieldadresseInscription.getText().trim() != ""
								&& textFieldemailInscription.getText().trim() != ""
								&& passwordFieldInscription.getText().trim() != ""
								&& (rdbtnOrganissateurInscription.isSelected()
											|| rdbtnGestionnaireInscription.isSelected() 
											|| rdbtnSpectateurInscription.isSelected())
								&& rdbtnconcentementInscription.isSelected()
								) {
							
							if(rdbtnOrganissateurInscription.isSelected()) {
								// JOptionPane.showMessageDialog(null, "organisateur", "InfoBox: ", JOptionPane.INFORMATION_MESSAGE);
								person = new Organizer( 0, textFieldprenomInscription.getText(), 
										textFieldNomInscription.getText(), textFieldadresseInscription.getText(), 
										textFieldemailInscription.getText(),passwordFieldInscription.getPassword().toString(), 3);
						
							} else if(rdbtnGestionnaireInscription.isSelected()) {
								// JOptionPane.showMessageDialog(null, "rdbtnGestionnaireInscription", "InfoBox: ", JOptionPane.INFORMATION_MESSAGE);
								person = new RoomManager( 0, textFieldprenomInscription.getText(), 
										textFieldNomInscription.getText(), textFieldadresseInscription.getText(), 
										textFieldemailInscription.getText(),passwordFieldInscription.getPassword().toString(),2 );
						
							} else if(rdbtnSpectateurInscription.isSelected()) {
								// JOptionPane.showMessageDialog(null, "rdbtnSpectateurInscription", "InfoBox: ", JOptionPane.INFORMATION_MESSAGE);
								person = new Spectator( 0, textFieldprenomInscription.getText(), 
										textFieldNomInscription.getText(), textFieldadresseInscription.getText(), 
										textFieldemailInscription.getText(),passwordFieldInscription.getPassword().toString(), 4);
							}
							var result = person.create(be.niver.connect.ConnectDataBase.getInstance());
							if(result) {
								Person.CurrentUser = person.login(be.niver.connect.ConnectDataBase.getInstance());
								Home home = new Home();
								JOptionPane.showMessageDialog(null, "bienvenu dans bosquet Wallon ", "bosquet Wallon ", JOptionPane.INFORMATION_MESSAGE);
								home.setVisible(true);
								dispose();
							} else {
								JOptionPane.showMessageDialog(null, "Erreur rencontrée. Veuillez contacter l'administrateur", "bosquet Wallon ", JOptionPane.ERROR_MESSAGE);
							}
							
						} else {
							JOptionPane.showMessageDialog(null, "Veuillez verifier tous les champs", "bosquet Wallon ", JOptionPane.ERROR_MESSAGE);
						}
						
					} 
					catch(Exception ex) 
					{
						JOptionPane.showMessageDialog(null, "Erreur rencontrée. Veuillez contacter l'administrateur", "bosquet Wallon ", JOptionPane.ERROR_MESSAGE);
						ex.printStackTrace();
					}
						
					}
				 
				});
				
		
				// buton quitter
				btnexitPageInscription.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						try {
							//frame.setVisible(false);
							dispose();
						} catch (Exception ex) {
							// TODO: handle exception
							JOptionPane.showMessageDialog(null, "Erreur rencontrée. Veuillez contacter l'administrateur", "bosquet Wallon ", JOptionPane.ERROR_MESSAGE);
							ex.printStackTrace();
						}
					}
				});
				
				// button connexion
				btnNewButtonconnecterInscription.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						try {
							Connexion connexion = new Connexion();
							connexion.setVisible(true);
							dispose();
						} catch (Exception ex) {
							// TODO: handle exception
							JOptionPane.showMessageDialog(null, "Erreur rencontrée. Veuillez contacter l'administrateur", "bosquet Wallon ", JOptionPane.ERROR_MESSAGE);
							ex.printStackTrace();
						}
					}
				});
	}
	
	
	
	/**
	 * this method createEvents() for creating events
	 * 
	 */
	private void createEvents() 
	{
		
	}
}
