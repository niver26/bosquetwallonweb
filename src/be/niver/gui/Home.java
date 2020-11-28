package be.niver.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GraphicsDevice;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import be.niver.bosquetwallonweb.Organizer;
import be.niver.bosquetwallonweb.Person;
import be.niver.bosquetwallonweb.RoomManager;
import be.niver.bosquetwallonweb.Spectator;

import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;

import java.awt.SystemColor;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;

public class Home extends JFrame {

	protected static final JFrame Jframe = null;
	private JPanel contentPane;
	private JPasswordField passwordFieldupdate;
	private JTextField textFieldemailupdate;
	private JTextField textFieldprenomupdate;
	private JTextField textFieldnomupdate;
	private JTextField textFieldadresseupdate;
	private JPanel panelUpdateUser;
	private JPanel panelAcceuil ;
	JPanel panelReservation;
	private JTextField textFieldgarrantie;
	private JTextField textFieldAccompte;
	private JTextField textFieldLoyer;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					if(Person.CurrentUser !=null&& Person.CurrentUser.getIDperson()>0) {
						Home frame = new Home();
						frame.setVisible(true);
					}
					else 
					{
						Connexion connexion = new Connexion();
						connexion.setVisible(true);
						
					}
					
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
		setBounds(100, 100, 976, 863);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		accueil();
		update();
		Reservation();
		hideAllPanel();
		panelAcceuil.setVisible(true);
		menu();
		
		
		
		
		
		
		
		
	}
	
	/**
	 * this method createEvents() for creating events
	 * 
	 */
	
	private void accueil() {
	    panelAcceuil = new JPanel();
		panelAcceuil.setBackground(Color.WHITE);
		panelAcceuil.setBounds(0, 0, 962, 551);
		contentPane.add(panelAcceuil);
		panelAcceuil.setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(Home.class.getResource("/images/fondacceuil.PNG")));
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBackground(Color.RED);
		lblNewLabel.setBounds(0, 0, 952, 90);
		panelAcceuil.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Home.class.getResource("/images/lumiere.jpg")));
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(0, 112, 962, 439);
		panelAcceuil.add(lblNewLabel_1);
		
	}
	
	private void Reservation() {
		panelReservation = new JPanel();
		panelReservation.setBackground(Color.WHITE);
		panelReservation.setBounds(0, 0, 962, 801);
		contentPane.add(panelReservation);
		panelReservation.setLayout(null);
		
		JLabel lblLocationtitre = new JLabel("Formulaire De Reservation");
		lblLocationtitre.setBounds(342, 20, 620, 46);
		lblLocationtitre.setHorizontalAlignment(SwingConstants.CENTER);
		lblLocationtitre.setForeground(Color.BLUE);
		lblLocationtitre.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 40));
		panelReservation.add(lblLocationtitre);
		
		JLabel lblJour = new JLabel("Date debut");
		lblJour.setBounds(391, 83, 126, 27);
		lblJour.setHorizontalAlignment(SwingConstants.LEFT);
		lblJour.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 25));
		panelReservation.add(lblJour);
		
		JLabel lblLoyer = new JLabel("Loyer");
		lblLoyer.setBounds(391, 120, 126, 27);
		lblLoyer.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 25));
		panelReservation.add(lblLoyer);
		
		JLabel lblAccompte = new JLabel("Accompte");
		lblAccompte.setBounds(391, 153, 126, 27);
		lblAccompte.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 25));
		panelReservation.add(lblAccompte);
		
		JLabel lblGarrantie = new JLabel("Garrantie");
		lblGarrantie.setBounds(391, 190, 126, 27);
		lblGarrantie.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 25));
		panelReservation.add(lblGarrantie);
		
		textFieldgarrantie = new JTextField();
		textFieldgarrantie.setBounds(548, 202, 404, 27);
		textFieldgarrantie.setEditable(false);
		textFieldgarrantie.setText("4000 euros");
		textFieldgarrantie.setFont(new Font("Vivaldi", Font.BOLD, 20));
		textFieldgarrantie.setColumns(10);
		panelReservation.add(textFieldgarrantie);
		
		textFieldAccompte = new JTextField();
		textFieldAccompte.setBounds(548, 165, 404, 27);
		textFieldAccompte.setEditable(false);
		textFieldAccompte.setText(" 1000 euros");
		textFieldAccompte.setFont(new Font("Vivaldi", Font.BOLD, 20));
		textFieldAccompte.setColumns(10);
		panelReservation.add(textFieldAccompte);
		
		textFieldLoyer = new JTextField();
		textFieldLoyer.setBounds(548, 132, 404, 27);
		textFieldLoyer.setFont(new Font("Vivaldi", Font.BOLD, 20));
		textFieldLoyer.setColumns(10);
		panelReservation.add(textFieldLoyer);
		
		JCheckBox chckbxPersonelBarlocation = new JCheckBox("Personnel Bar");
		chckbxPersonelBarlocation.setBounds(430, 297, 120, 21);
		chckbxPersonelBarlocation.setBackground(Color.WHITE);
		panelReservation.add(chckbxPersonelBarlocation);
		
		JCheckBox chckbxPersSecuritelocation = new JCheckBox("Personnel S\u00E9curit\u00E9");
		chckbxPersSecuritelocation.setBounds(430, 330, 120, 21);
		chckbxPersSecuritelocation.setBackground(Color.WHITE);
		panelReservation.add(chckbxPersSecuritelocation);
		
		JCheckBox chckbxPersVestiaireLocation = new JCheckBox("Personnel vestiaires");
		chckbxPersVestiaireLocation.setBounds(430, 361, 120, 21);
		chckbxPersVestiaireLocation.setBackground(Color.WHITE);
		panelReservation.add(chckbxPersVestiaireLocation);
		
		JCheckBox chckbxNettoyageSalleLocation = new JCheckBox("Nettoyage salle");
		chckbxNettoyageSalleLocation.setBounds(430, 396, 120, 21);
		chckbxNettoyageSalleLocation.setBackground(Color.WHITE);
		panelReservation.add(chckbxNettoyageSalleLocation);
		
		JCheckBox chckbxAfficheLocation = new JCheckBox("colleur d\u2019affiche");
		chckbxAfficheLocation.setBounds(430, 431, 120, 21);
		chckbxAfficheLocation.setBackground(Color.WHITE);
		panelReservation.add(chckbxAfficheLocation);
		
		JCheckBox chckbxPresseLocation = new JCheckBox("Service de presse");
		chckbxPresseLocation.setBounds(577, 396, 138, 21);
		chckbxPresseLocation.setBackground(Color.WHITE);
		panelReservation.add(chckbxPresseLocation);
		
		JButton btnValiderPageLocation = new JButton("Valider");
		btnValiderPageLocation.setBounds(517, 574, 98, 46);
		btnValiderPageLocation.setForeground(Color.BLACK);
		btnValiderPageLocation.setBackground(SystemColor.textHighlight);
		panelReservation.add(btnValiderPageLocation);
		
		JCheckBox chckbxChampagneLocation = new JCheckBox("champagne");
		chckbxChampagneLocation.setBounds(749, 431, 120, 21);
		chckbxChampagneLocation.setBackground(Color.WHITE);
		panelReservation.add(chckbxChampagneLocation);
		
		JCheckBox chckbxTraiteurLocation = new JCheckBox("option traiteur");
		chckbxTraiteurLocation.setBounds(749, 398, 120, 21);
		chckbxTraiteurLocation.setBackground(Color.WHITE);
		panelReservation.add(chckbxTraiteurLocation);
		
		JCheckBox chckbxOptionAllInLocation = new JCheckBox("option all in");
		chckbxOptionAllInLocation.setBounds(749, 363, 120, 21);
		chckbxOptionAllInLocation.setBackground(Color.WHITE);
		panelReservation.add(chckbxOptionAllInLocation);
		
		JCheckBox chckbxHotessesLocation = new JCheckBox("hotesses");
		chckbxHotessesLocation.setBounds(749, 332, 120, 21);
		chckbxHotessesLocation.setBackground(Color.WHITE);
		panelReservation.add(chckbxHotessesLocation);
		
		JCheckBox chckbxBackstageLocation = new JCheckBox("Backstage");
		chckbxBackstageLocation.setBounds(749, 299, 120, 21);
		chckbxBackstageLocation.setBackground(Color.WHITE);
		panelReservation.add(chckbxBackstageLocation);
		
		JCheckBox chckbxLumiereLocation = new JCheckBox("ing\u00E9nieur lumi\u00E8re");
		chckbxLumiereLocation.setBounds(577, 361, 138, 21);
		chckbxLumiereLocation.setBackground(Color.WHITE);
		panelReservation.add(chckbxLumiereLocation);
		
		JCheckBox chckbxSonLocation = new JCheckBox("ing\u00E9nieur du son");
		chckbxSonLocation.setBounds(577, 330, 138, 21);
		chckbxSonLocation.setBackground(Color.WHITE);
		panelReservation.add(chckbxSonLocation);
		
		JCheckBox chckbxAssuranceLocation = new JCheckBox("Assurances tout risque");
		chckbxAssuranceLocation.setBounds(577, 297, 138, 21);
		chckbxAssuranceLocation.setBackground(Color.WHITE);
		panelReservation.add(chckbxAssuranceLocation);
		
		JLabel lblserviceoptionelLocation = new JLabel("Services Optionnels");
		lblserviceoptionelLocation.setBounds(427, 245, 288, 37);
		lblserviceoptionelLocation.setHorizontalAlignment(SwingConstants.CENTER);
		lblserviceoptionelLocation.setForeground(Color.RED);
		lblserviceoptionelLocation.setFont(new Font("Vivaldi", Font.BOLD, 22));
		lblserviceoptionelLocation.setBackground(Color.PINK);
		panelReservation.add(lblserviceoptionelLocation);
		
		JLabel lblServicesVip_1 = new JLabel("Services vip");
		lblServicesVip_1.setBounds(813, 248, 139, 37);
		lblServicesVip_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblServicesVip_1.setForeground(Color.RED);
		lblServicesVip_1.setFont(new Font("Vivaldi", Font.BOLD, 22));
		lblServicesVip_1.setBackground(Color.PINK);
		panelReservation.add(lblServicesVip_1);
		
		JLabel lblDisponibilites = new JLabel("Disponibilit\u00E9es");
		lblDisponibilites.setHorizontalAlignment(SwingConstants.CENTER);
		lblDisponibilites.setForeground(Color.BLUE);
		lblDisponibilites.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 40));
		lblDisponibilites.setBounds(10, 20, 333, 46);
		panelReservation.add(lblDisponibilites);
		
		JCalendar calendarDisponibilites = new JCalendar();
		calendarDisponibilites.setBounds(29, 91, 314, 244);
		panelReservation.add(calendarDisponibilites);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(548, 85, 404, 37);
		panelReservation.add(dateChooser);
		
		
		
		
	}
	
	private void  update() {
		panelUpdateUser = new JPanel();
		panelUpdateUser.setBackground(Color.WHITE);
		panelUpdateUser.setBounds(0, 0, 744, 551);
		contentPane.add(panelUpdateUser);
		panelUpdateUser.setLayout(null);
		
		JLabel lblModificationDuCompte = new JLabel("Modification du compte");
		lblModificationDuCompte.setHorizontalAlignment(SwingConstants.CENTER);
		lblModificationDuCompte.setForeground(Color.BLUE);
		lblModificationDuCompte.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 33));
		lblModificationDuCompte.setBounds(141, 0, 468, 33);
		panelUpdateUser.add(lblModificationDuCompte);
		
		JLabel lblNomInscription = new JLabel("Nom");
		lblNomInscription.setHorizontalAlignment(SwingConstants.LEFT);
		lblNomInscription.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 20));
		lblNomInscription.setBounds(10, 202, 90, 27);
		panelUpdateUser.add(lblNomInscription);
		
		JLabel lblPrenom = new JLabel("Prenom");
		lblPrenom.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 20));
		lblPrenom.setBounds(10, 238, 90, 27);
		panelUpdateUser.add(lblPrenom);
		
		JLabel lblNewLabel_1_1 = new JLabel("Adresse");
		lblNewLabel_1_1.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1_1.setBounds(10, 275, 90, 28);
		panelUpdateUser.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("E-Mail");
		lblNewLabel_1_1_1.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1_1_1.setBounds(10, 313, 90, 28);
		panelUpdateUser.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Code");
		lblNewLabel_1_2.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1_2.setBounds(10, 351, 90, 28);
		panelUpdateUser.add(lblNewLabel_1_2);
		
		passwordFieldupdate = new JPasswordField();
		passwordFieldupdate.setBounds(110, 351, 228, 28);
		panelUpdateUser.add(passwordFieldupdate);
		
		textFieldemailupdate = new JTextField();
		textFieldemailupdate.setFont(new Font("Vivaldi", Font.BOLD, 20));
		textFieldemailupdate.setColumns(10);
		textFieldemailupdate.setBounds(110, 313, 228, 28);
		panelUpdateUser.add(textFieldemailupdate);
		
		textFieldprenomupdate = new JTextField();
		textFieldprenomupdate.setFont(new Font("Vivaldi", Font.BOLD, 20));
		textFieldprenomupdate.setColumns(10);
		textFieldprenomupdate.setBounds(110, 244, 228, 28);
		panelUpdateUser.add(textFieldprenomupdate);
		
		textFieldnomupdate = new JTextField();
		textFieldnomupdate.setFont(new Font("Vivaldi", Font.BOLD, 20));
		textFieldnomupdate.setColumns(10);
		textFieldnomupdate.setBounds(110, 208, 228, 28);
		panelUpdateUser.add(textFieldnomupdate);
		
		textFieldadresseupdate = new JTextField();
		textFieldadresseupdate.setFont(new Font("Vivaldi", Font.BOLD, 20));
		textFieldadresseupdate.setColumns(10);
		textFieldadresseupdate.setBounds(110, 278, 228, 28);
		panelUpdateUser.add(textFieldadresseupdate);
		
		JButton btnModifierUpdateuser = new JButton("modifier");
		btnModifierUpdateuser.setForeground(Color.BLACK);
		btnModifierUpdateuser.setBackground(SystemColor.textHighlight);
		btnModifierUpdateuser.setBounds(157, 449, 98, 46);
		panelUpdateUser.add(btnModifierUpdateuser);
		
		JButton btnFermerUpdateuser = new JButton("Fermer");
		btnFermerUpdateuser.setForeground(Color.BLACK);
		btnFermerUpdateuser.setBackground(new Color(220, 20, 60));
		btnFermerUpdateuser.setBounds(643, 449, 98, 46);
		panelUpdateUser.add(btnFermerUpdateuser);
		fillInformation();
		
		
		
		
		
		
		
		
		
		// action
		// ajouter l'action
		btnModifierUpdateuser.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						
					try {
						Person person = null;
						
						if(textFieldprenomupdate.getText().trim() != "" 
								&& textFieldnomupdate.getText().trim() != "" 
								&& textFieldadresseupdate.getText().trim() != ""
								&& textFieldemailupdate.getText().trim() != ""
								
								) {
							if(Person.CurrentUser.getrole()==3) {
								// JOptionPane.showMessageDialog(null, "organisateur", "InfoBox: ", JOptionPane.INFORMATION_MESSAGE);
								person = new Organizer( Person.CurrentUser.getIDperson(), 
										textFieldnomupdate.getText(),textFieldprenomupdate.getText(),  textFieldadresseupdate.getText(),textFieldemailupdate.getText(), 
										passwordFieldupdate.getText().isBlank()? Person.CurrentUser.getPassWord() :passwordFieldupdate.getText() ,3);
							} else if(Person.CurrentUser.getrole()==2) {
								// JOptionPane.showMessageDialog(null, "rdbtnGestionnaireInscription", "InfoBox: ", JOptionPane.INFORMATION_MESSAGE);
								person = new RoomManager( Person.CurrentUser.getIDperson(), 
										textFieldnomupdate.getText(),textFieldprenomupdate.getText(),  textFieldadresseupdate.getText(),textFieldemailupdate.getText(), 
										passwordFieldupdate.getText().isBlank()? Person.CurrentUser.getPassWord() :passwordFieldupdate.getText() ,2 );
						
							} else if(Person.CurrentUser.getrole()== 4) {
								// JOptionPane.showMessageDialog(null, "rdbtnSpectateurInscription", "InfoBox: ", JOptionPane.INFORMATION_MESSAGE);
								person = new Spectator( Person.CurrentUser.getIDperson(), 
										textFieldnomupdate.getText(),textFieldprenomupdate.getText(),  textFieldadresseupdate.getText(),textFieldemailupdate.getText(), 
										passwordFieldupdate.getText().isBlank()? Person.CurrentUser.getPassWord() :passwordFieldupdate.getText() , 4);
							}
							var result = person.update(be.niver.connect.ConnectDataBase.getInstance());
							if(result) {
								Person.CurrentUser = person;
								JOptionPane.showMessageDialog(null, "Modification éffectuer avec succès ", "bosquet Wallon ", JOptionPane.INFORMATION_MESSAGE);
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
				

		
	}
	
	private void fillInformation() {
		
		textFieldnomupdate.setText(Person.CurrentUser.getFirstName());
		textFieldprenomupdate.setText(Person.CurrentUser.getLastName());
		textFieldemailupdate.setText(Person.CurrentUser.getE_Mail());
		textFieldadresseupdate.setText(Person.CurrentUser.getAdress());
	}
	
	private void hideAllPanel() {
		
		panelUpdateUser.setVisible(false);
		panelAcceuil.setVisible(false);
		panelReservation.setVisible(false);
	}
	
	private void menu() 
	{
		JMenuBar menuBar = new JMenuBar();
		menuBar.setMargin(new Insets(5, 0, 5, 0));
		menuBar.setFont(new Font("HP Simplified", Font.BOLD, 28));
		setJMenuBar(menuBar);
		
		JMenu mnexitacceuil, Bookshowacceuil, mnuser, ReservationRoom, RoomManagerSpace, Retour, 
		ListReservationOrganizer, updateuser, GestionreservationRoomManager, reserverSepectator, 
		MescommandeSpectator, MonPagnierSpectator;
		mnexitacceuil=new JMenu("Quiter"); 
		mnexitacceuil.setBackground(Color.RED);
		mnexitacceuil.setHorizontalAlignment(SwingConstants.RIGHT);
		mnexitacceuil.setFont(new Font("HP Simplified", Font.BOLD | Font.ITALIC, 15));
		mnexitacceuil.setForeground(Color.BLACK);
		
		Bookshowacceuil =new JMenu("Consulter les spectacles"); 
		Bookshowacceuil.setHorizontalAlignment(SwingConstants.RIGHT);
		Bookshowacceuil.setFont(new Font("HP Simplified", Font.BOLD | Font.ITALIC, 15));
		Bookshowacceuil.setForeground(Color.BLACK);
		
		Retour =new JMenu("Retour"); 
		Retour.setHorizontalAlignment(SwingConstants.RIGHT);
		Retour.setFont(new Font("HP Simplified", Font.BOLD | Font.ITALIC, 15));
		Retour.setForeground(Color.BLACK);
		
		RoomManagerSpace =new JMenu("Espace manager"); 
		RoomManagerSpace.setHorizontalAlignment(SwingConstants.RIGHT);
		RoomManagerSpace.setFont(new Font("HP Simplified", Font.BOLD | Font.ITALIC, 15));
		RoomManagerSpace.setForeground(Color.BLACK);
		
		ReservationRoom =new JMenu("Reserver une salle"); 
	
		ReservationRoom.setHorizontalAlignment(SwingConstants.RIGHT);
		ReservationRoom.setFont(new Font("HP Simplified", Font.BOLD | Font.ITALIC, 15));
		ReservationRoom.setForeground(Color.BLACK);
		//JOptionPane.showMessageDialog(null, Person.CurrentUser.getIDperson(), "bosquet Wallon ",JOptionPane.ERROR_MESSAGE);
		
		
		
			mnuser=new JMenu(Person.CurrentUser.getFirstName() + " " +  Person.CurrentUser.getLastName()); 
			mnuser.setBackground(Color.RED);
			mnuser.setHorizontalAlignment(SwingConstants.LEFT);
			mnuser.setFont(new Font("HP Simplified", Font.BOLD | Font.ITALIC, 15));
			mnuser.setForeground(Color.BLACK);
			
			ListReservationOrganizer = new JMenu("Mes reservation");
			ListReservationOrganizer.setHorizontalAlignment(SwingConstants.RIGHT);
			ListReservationOrganizer.setForeground(Color.BLACK);
			ListReservationOrganizer.setFont(new Font("HP Simplified", Font.BOLD | Font.ITALIC, 15));
			
			
			updateuser = new JMenu("Modifier mes données");
			updateuser.setHorizontalAlignment(SwingConstants.RIGHT);
			updateuser.setForeground(Color.BLACK);
			updateuser.setFont(new Font("HP Simplified", Font.BOLD | Font.ITALIC, 15));
			
			GestionreservationRoomManager = new JMenu("Gerer les reservations");
			GestionreservationRoomManager.setHorizontalAlignment(SwingConstants.RIGHT);
			GestionreservationRoomManager.setForeground(Color.BLACK);
			GestionreservationRoomManager.setFont(new Font("HP Simplified", Font.BOLD | Font.ITALIC, 15));
			
			reserverSepectator = new JMenu("Réserver un Spectacle");
			reserverSepectator.setHorizontalAlignment(SwingConstants.RIGHT);
			reserverSepectator.setForeground(Color.BLACK);
			reserverSepectator.setFont(new Font("HP Simplified", Font.BOLD | Font.ITALIC, 15));
			
			MescommandeSpectator = new JMenu("Mes commandes");
			MescommandeSpectator.setHorizontalAlignment(SwingConstants.RIGHT);
			MescommandeSpectator.setForeground(Color.BLACK);
			MescommandeSpectator.setFont(new Font("HP Simplified", Font.BOLD | Font.ITALIC, 15));
			
			MonPagnierSpectator = new JMenu("Gerer les reservations");
			MonPagnierSpectator.setHorizontalAlignment(SwingConstants.RIGHT);
			MonPagnierSpectator.setForeground(Color.BLACK);
			MonPagnierSpectator.setFont(new Font("HP Simplified", Font.BOLD | Font.ITALIC, 15));
			mnuser.add(updateuser);
			if(Person.CurrentUser.getrole()==3) {
				mnuser.add(ListReservationOrganizer);
			}
			else if(Person.CurrentUser.getrole()==2) {
				mnuser.add(GestionreservationRoomManager);
			
			}else if(Person.CurrentUser.getrole()==4) {
				mnuser.add(reserverSepectator);
				mnuser.add(MescommandeSpectator);
				mnuser.add(MonPagnierSpectator);
			}
			
			
			// BUTON User
			updateuser.addMouseListener(new MouseAdapter() {
				
				@Override
				public void mouseClicked(MouseEvent e) {
					hideAllPanel();
					panelUpdateUser.setVisible(true);
				}
				
			});
			
			ReservationRoom.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					hideAllPanel();
					panelReservation.setVisible(true);
					
				}
			});
			// action button quiter
			mnexitacceuil.addMouseListener(new MouseAdapter() {
				
				@Override
				public void mouseClicked(MouseEvent e) {
					dispose();
				}
				
			});
			
			// action button Retour
			Retour.addMouseListener(new MouseAdapter() {
							
							@Override
							public void mouseClicked(MouseEvent e) {
								hideAllPanel();
								panelAcceuil.setVisible(true);
							}
							
						});
		
		
		menuBar.add(mnuser);
		
		
		menuBar.add(Bookshowacceuil);
		menuBar.add(ReservationRoom);
		menuBar.add(RoomManagerSpace);
		menuBar.add(Retour);
		menuBar.add(mnexitacceuil);
		
		
	}
}
