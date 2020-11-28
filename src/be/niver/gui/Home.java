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
import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import be.niver.bosquetwallonweb.Booking;
import be.niver.bosquetwallonweb.Order;
import be.niver.bosquetwallonweb.Organizer;
import be.niver.bosquetwallonweb.Person;
import be.niver.bosquetwallonweb.PlanningOfRoom;
import be.niver.bosquetwallonweb.Representation;
import be.niver.bosquetwallonweb.RoomManager;
import be.niver.bosquetwallonweb.Show;
import be.niver.bosquetwallonweb.Spectator;

import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;

import java.awt.SystemColor;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import javax.swing.JList;
import javax.swing.JRadioButton;
import javax.swing.JTextPane;

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
	private JPanel panelReservation;
	private JPanel panelPllanningRoom;
	private JPanel panelPaiement;
	private JPanel panelListePlanning;
	private JPanel panelListeReservationManager;
	private JPanel panelFicheSignaletiqueSpectacle;
	private JPanel panelPagnierSpectator;
	private JPanel panelLESCommandesSpectator;
	private JTextField textFieldgarrantie;
	private JTextField textFieldAccompte;
	private JTextField textFieldLoyer;
	private JTextField textFieldNumeroManager;
	private JTextField textFieldNumeroReservation;
	private JTextField textFieldNumeroPlanning;
	private JTextField textField;
	private JTextField textFieldCode3chiffresCarte;
	private JTextField textFieldNumeroCarte;
	private JTextField textFieldNomTitulairecarte;
	private JTextField textFieldPrixdebout;
	private JTextField textFieldPrixOrConcert;
	private JTextField textFieldpricargentConcert;
	private JTextField textFieldBronzeConcert;
	private JTextField textFieldprixdiamantCirque;
	private JTextField textFieldprixorCirque;
	private JTextField textFieldprixargentCirque;
	private JTextField textFieldprixbronzeCirque;
	private JTextField textField_1;
	private JTextField textFieldTitreFS;
	private JTextField textFieldIDartisteFS;
	private JTextField textField_5;
	private JTextField textFieldheureouvertureporteFS;
	private JTextField textFieldHeuredebutFS;
	private JTextField textFieldHeurefinFS;
	private JTextField textFieldMontantaPayerSpectator;
	
	
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
		FicheSignalitique();
		Reservation();
		PlanningRoom();
		ListedesPlanning();
		Paiement();
		lesReservationRoomManager();
		PagnierSpectateur();
		LesCommandeSpectateur();
		UpdatePlanningRoom() ;
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
		panelAcceuil.setBounds(0, 0, 962, 801);
		contentPane.add(panelAcceuil);
		panelAcceuil.setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(Home.class.getResource("/images/fondacceuil.PNG")));
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBackground(Color.RED);
		lblNewLabel.setBounds(0, 0, 952, 91);
		panelAcceuil.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Home.class.getResource("/images/lumiere.jpg")));
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(0, 112, 962, 689);
		panelAcceuil.add(lblNewLabel_1);
		
	}
	
	
	private void LesCommandeSpectateur() {
		panelLESCommandesSpectator = new JPanel();
		panelLESCommandesSpectator.setBackground(Color.WHITE);
		panelLESCommandesSpectator.setBounds(0, 0, 962, 801);
		contentPane.add(panelLESCommandesSpectator);
		panelLESCommandesSpectator.setLayout(null);
		
		JLabel lblVosCommandes = new JLabel("Vos Commandes");
		lblVosCommandes.setHorizontalAlignment(SwingConstants.CENTER);
		lblVosCommandes.setForeground(Color.BLUE);
		lblVosCommandes.setFont(new Font("Vivaldi", Font.BOLD, 30));
		lblVosCommandes.setBounds(10, 0, 942, 46);
		panelLESCommandesSpectator.add(lblVosCommandes);
		
		JComboBox comboBoxToutelesCommandes = new JComboBox();
		comboBoxToutelesCommandes.setBackground(Color.WHITE);
		comboBoxToutelesCommandes.setBounds(10, 130, 942, 37);
		panelLESCommandesSpectator.add(comboBoxToutelesCommandes);
		
		
		Spectator spectator = new Spectator();
		spectator = new Spectator(spectator.getIDPerson_fk());

		Order order = new Order();
		//if(spectator.getIDPerson_fk() == Person.CurrentUser.getIDperson()) {
		 order = new Order(order.getIDOrder(),spectator, order.getPaymentMethod(), order.getDeliveryMethod(), order.getPrice() );
		 
		 var result =  order.findAll(be.niver.connect.ConnectDataBase.getInstance());
		 
		 for(var p : result ) {
			 	comboBoxToutelesCommandes.addItem(p);
			}
		 // }
		
		
	}
	private void PagnierSpectateur() {
		
		panelPagnierSpectator = new JPanel();
		panelPagnierSpectator.setBackground(Color.WHITE);
		panelPagnierSpectator.setBounds(0, 0, 962, 791);
		contentPane.add(panelPagnierSpectator);
		panelPagnierSpectator.setLayout(null);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("Mode de livraison");
		lblNewLabel_1_1_2_1.setForeground(Color.RED);
		lblNewLabel_1_1_2_1.setFont(new Font("Vivaldi", Font.BOLD, 20));
		lblNewLabel_1_1_2_1.setBackground(Color.WHITE);
		lblNewLabel_1_1_2_1.setBounds(28, 405, 234, 25);
		panelPagnierSpectator.add(lblNewLabel_1_1_2_1);
		
		JRadioButton rdbtnSurPlace = new JRadioButton("Reprendre les places sur place le jour du spectacle");
		rdbtnSurPlace.setFont(new Font("Vivaldi", Font.BOLD, 20));
		rdbtnSurPlace.setBackground(Color.WHITE);
		rdbtnSurPlace.setBounds(28, 447, 643, 21);
		panelPagnierSpectator.add(rdbtnSurPlace);
		
		JRadioButton rdbtnSeFaireLivrerTimbre = new JRadioButton("Se faire livrer les places par envoi avec timbres prior");
		rdbtnSeFaireLivrerTimbre.setFont(new Font("Vivaldi", Font.BOLD, 20));
		rdbtnSeFaireLivrerTimbre.setBackground(Color.WHITE);
		rdbtnSeFaireLivrerTimbre.setBounds(28, 476, 643, 21);
		panelPagnierSpectator.add(rdbtnSeFaireLivrerTimbre);
		
		JRadioButton rdbtnSeFaireLivrerEnvoi10edeplus = new JRadioButton("Se faire livrer les places par envoi s\u00E9curis\u00E9, dans ce cas un suppl\u00E9ment de 10 euro sera factur\u00E9");
		rdbtnSeFaireLivrerEnvoi10edeplus.setFont(new Font("Vivaldi", Font.BOLD, 20));
		rdbtnSeFaireLivrerEnvoi10edeplus.setBackground(Color.WHITE);
		rdbtnSeFaireLivrerEnvoi10edeplus.setBounds(28, 508, 662, 21);
		panelPagnierSpectator.add(rdbtnSeFaireLivrerEnvoi10edeplus);
		
		
		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnSurPlace);
		group.add(rdbtnSeFaireLivrerTimbre);
		group.add(rdbtnSeFaireLivrerEnvoi10edeplus);
		
		
		JButton btnPayerspectator = new JButton("Payer");
		btnPayerspectator.setForeground(Color.BLACK);
		btnPayerspectator.setBackground(SystemColor.textHighlight);
		btnPayerspectator.setBounds(528, 568, 98, 46);
		panelPagnierSpectator.add(btnPayerspectator);
		
		JLabel lblNewLabel_1_1_2_1_1 = new JLabel("Montant \u00E0 payer");
		lblNewLabel_1_1_2_1_1.setForeground(Color.RED);
		lblNewLabel_1_1_2_1_1.setFont(new Font("Vivaldi", Font.BOLD, 20));
		lblNewLabel_1_1_2_1_1.setBackground(Color.WHITE);
		lblNewLabel_1_1_2_1_1.setBounds(718, 56, 148, 25);
		panelPagnierSpectator.add(lblNewLabel_1_1_2_1_1);
		
		textFieldMontantaPayerSpectator = new JTextField();
		textFieldMontantaPayerSpectator.setForeground(Color.RED);
		textFieldMontantaPayerSpectator.setFont(new Font("Vivaldi", Font.BOLD, 20));
		textFieldMontantaPayerSpectator.setEditable(false);
		textFieldMontantaPayerSpectator.setColumns(10);
		textFieldMontantaPayerSpectator.setBounds(718, 113, 148, 36);
		panelPagnierSpectator.add(textFieldMontantaPayerSpectator);
		
		JTextPane textPanePanier = new JTextPane();
		textPanePanier.setBackground(SystemColor.menu);
		textPanePanier.setBounds(28, 56, 598, 339);
		panelPagnierSpectator.add(textPanePanier);
		
		JLabel lblVotrePagnier = new JLabel("Votre pagnier");
		lblVotrePagnier.setHorizontalAlignment(SwingConstants.CENTER);
		lblVotrePagnier.setForeground(Color.BLUE);
		lblVotrePagnier.setFont(new Font("Vivaldi", Font.BOLD, 30));
		lblVotrePagnier.setBounds(83, 10, 869, 36);
		panelPagnierSpectator.add(lblVotrePagnier);
		
		//action btnPayerspectator
		
		btnPayerspectator.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				hideAllPanel();
				panelPaiement.setVisible(true);
			}
			
		});
		
	}
	
	private void FicheSignalitique() {
		panelFicheSignaletiqueSpectacle = new JPanel();
		panelFicheSignaletiqueSpectacle.setBackground(Color.WHITE);
		panelFicheSignaletiqueSpectacle.setBounds(0, 0, 962, 827);
		contentPane.add(panelFicheSignaletiqueSpectacle);
		panelFicheSignaletiqueSpectacle.setLayout(null);
		
		JLabel lblFicheSignaltiqueDu = new JLabel("fiche signal\u00E9tique du spectacle");
		lblFicheSignaltiqueDu.setHorizontalAlignment(SwingConstants.CENTER);
		lblFicheSignaltiqueDu.setForeground(Color.BLUE);
		lblFicheSignaltiqueDu.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 33));
		lblFicheSignaltiqueDu.setBounds(0, 10, 952, 33);
		panelFicheSignaletiqueSpectacle.add(lblFicheSignaltiqueDu);
		
		textFieldTitreFS = new JTextField();
		textFieldTitreFS.setFont(new Font("Vivaldi", Font.BOLD, 20));
		textFieldTitreFS.setColumns(10);
		textFieldTitreFS.setBounds(262, 251, 406, 28);
		panelFicheSignaletiqueSpectacle.add(textFieldTitreFS);
		
		textFieldIDartisteFS = new JTextField();
		textFieldIDartisteFS.setFont(new Font("Vivaldi", Font.BOLD, 20));
		textFieldIDartisteFS.setColumns(10);
		textFieldIDartisteFS.setBounds(262, 294, 406, 28);
		panelFicheSignaletiqueSpectacle.add(textFieldIDartisteFS);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Vivaldi", Font.BOLD, 20));
		textField_5.setColumns(10);
		textField_5.setBounds(262, 332, 406, 28);
		panelFicheSignaletiqueSpectacle.add(textField_5);
		
		textFieldheureouvertureporteFS = new JTextField();
		textFieldheureouvertureporteFS.setFont(new Font("Vivaldi", Font.BOLD, 20));
		textFieldheureouvertureporteFS.setColumns(10);
		textFieldheureouvertureporteFS.setBounds(262, 368, 406, 28);
		panelFicheSignaletiqueSpectacle.add(textFieldheureouvertureporteFS);
		
		textFieldHeuredebutFS = new JTextField();
		textFieldHeuredebutFS.setFont(new Font("Vivaldi", Font.BOLD, 20));
		textFieldHeuredebutFS.setColumns(10);
		textFieldHeuredebutFS.setBounds(262, 406, 406, 28);
		panelFicheSignaletiqueSpectacle.add(textFieldHeuredebutFS);
		
		textFieldHeurefinFS = new JTextField();
		textFieldHeurefinFS.setFont(new Font("Vivaldi", Font.BOLD, 20));
		textFieldHeurefinFS.setColumns(10);
		textFieldHeurefinFS.setBounds(262, 444, 406, 28);
		panelFicheSignaletiqueSpectacle.add(textFieldHeurefinFS);
		
		JButton btnValiderFS = new JButton("Valider");
		btnValiderFS.setForeground(Color.BLACK);
		btnValiderFS.setBackground(SystemColor.textHighlight);
		btnValiderFS.setBounds(315, 500, 98, 46);
		panelFicheSignaletiqueSpectacle.add(btnValiderFS);
		
		JLabel lblTitrefichsigspec = new JLabel("Titre");
		lblTitrefichsigspec.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 20));
		lblTitrefichsigspec.setBounds(120, 251, 132, 28);
		panelFicheSignaletiqueSpectacle.add(lblTitrefichsigspec);
		
		JLabel lblArtiste = new JLabel("Artiste");
		lblArtiste.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 20));
		lblArtiste.setBounds(120, 287, 132, 28);
		panelFicheSignaletiqueSpectacle.add(lblArtiste);
		
		JLabel Date = new JLabel("Date");
		Date.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 20));
		Date.setBounds(120, 325, 132, 28);
		panelFicheSignaletiqueSpectacle.add(Date);
		
		JLabel lblOrPlannification_1_2 = new JLabel("ouverture des portes");
		lblOrPlannification_1_2.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 20));
		lblOrPlannification_1_2.setBounds(112, 368, 140, 28);
		panelFicheSignaletiqueSpectacle.add(lblOrPlannification_1_2);
		
		JLabel Heuredebut = new JLabel("Heure d\u00E9but");
		Heuredebut.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 20));
		Heuredebut.setBounds(112, 406, 129, 28);
		panelFicheSignaletiqueSpectacle.add(Heuredebut);
		
		JLabel lblHeurefin = new JLabel("Heure fin");
		lblHeurefin.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 20));
		lblHeurefin.setBounds(112, 444, 138, 28);
		panelFicheSignaletiqueSpectacle.add(lblHeurefin);
		
		JLabel lblNewLabel_2 = new JLabel("Choisir un spectacle \u00E0 encoder");
		lblNewLabel_2.setFont(new Font("Vivaldi", Font.BOLD, 20));
		lblNewLabel_2.setBounds(120, 81, 548, 22);
		panelFicheSignaletiqueSpectacle.add(lblNewLabel_2);
		
		JComboBox comboBoxListSpectacle = new JComboBox();
		comboBoxListSpectacle.setBackground(Color.WHITE);
		comboBoxListSpectacle.setBounds(120, 135, 548, 28);
		panelFicheSignaletiqueSpectacle.add(comboBoxListSpectacle);
		
		/**
		 * Show(int iDShow, String title, Representation representation_show_fk, PlanningOfRoom planning_show_fk,
			Organizer organizer_show_fk)
		 */
		Representation representation = new Representation();
		representation = new Representation(representation.getIDRepresentation());
		PlanningOfRoom planningOfRoom =  new PlanningOfRoom();
		planningOfRoom =  new PlanningOfRoom(planningOfRoom.getIDplanningOfRoom());
		Organizer orginizer = new Organizer();
		orginizer = new Organizer(orginizer.getIDPerson_Organizer_fk());
		 Show show = new Show();
		 
		 //if(orginizer.getIDPerson_Organizer_fk() == Person.CurrentUser.getIDperson()) {
			 show = new Show(show.getIDShow(),show.getTitle(),representation,planningOfRoom,orginizer);
			 
			 var result =  show.findAll(be.niver.connect.ConnectDataBase.getInstance());
			 
			 for(var p : result ) {
				 	comboBoxListSpectacle.addItem(p);
				}
			 // }
		 
	}
	
	private void lesReservationRoomManager() {
		
		panelListeReservationManager = new JPanel();
		panelListeReservationManager.setBackground(Color.WHITE);
		panelListeReservationManager.setBounds(0, 0, 962, 801);
		contentPane.add(panelListeReservationManager);
		panelListeReservationManager.setLayout(null);
		
		JLabel lblListeDesReservation = new JLabel("Liste Des Reservations");
		lblListeDesReservation.setHorizontalAlignment(SwingConstants.CENTER);
		lblListeDesReservation.setForeground(Color.BLUE);
		lblListeDesReservation.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 40));
		lblListeDesReservation.setBounds(167, 10, 565, 46);
		panelListeReservationManager.add(lblListeDesReservation);
		
		JComboBox<PlanningOfRoom> comboBoxlistReservationManager = new JComboBox<PlanningOfRoom>();
		comboBoxlistReservationManager.setBounds(10, 88, 942, 62);
		panelListeReservationManager.add(comboBoxlistReservationManager);
		
		// add items to the combo box
		
		RoomManager roomManager =  new RoomManager();
		 roomManager =  new RoomManager(roomManager.getIDPerson_RoomManager_fk());
		 PlanningOfRoom planningOfRoom = new PlanningOfRoom();
		// if(roomManager.getIDPerson_RoomManager_fk() == Person.CurrentUser.getIDperson()) {
			 planningOfRoom = new PlanningOfRoom(planningOfRoom.getIDplanningOfRoom(),planningOfRoom.getBiginDate(),
					planningOfRoom.getEndDate(), roomManager);
			 var result =  planningOfRoom.findAll(be.niver.connect.ConnectDataBase.getInstance());
			
			 for(var p : result ) {
				 comboBoxlistReservationManager.addItem(p);
				}
			 
		
		 //}
	}
	
	
	
	private void Paiement() {
		panelPaiement = new JPanel();
		panelPaiement.setBackground(Color.WHITE);
		panelPaiement.setBounds(0, 0, 962, 801);
		contentPane.add(panelPaiement);
		panelPaiement.setLayout(null);
		
		textFieldCode3chiffresCarte = new JTextField();
		textFieldCode3chiffresCarte.setFont(new Font("Vivaldi", Font.PLAIN, 20));
		textFieldCode3chiffresCarte.setColumns(10);
		textFieldCode3chiffresCarte.setBounds(294, 457, 70, 37);
		panelPaiement.add(textFieldCode3chiffresCarte);
		
		JButton btnFinaliserPaiement = new JButton("Finaliser");
		btnFinaliserPaiement.setForeground(Color.BLACK);
		btnFinaliserPaiement.setBackground(SystemColor.textHighlight);
		btnFinaliserPaiement.setBounds(546, 505, 98, 46);
		panelPaiement.add(btnFinaliserPaiement);
		
		JLabel lblNewLabel_1_1_2_1_1_1_2 = new JLabel("Code de s\u00E9curit\u00E9 \u00E0 3 chiffres");
		lblNewLabel_1_1_2_1_1_1_2.setForeground(Color.BLACK);
		lblNewLabel_1_1_2_1_1_1_2.setFont(new Font("Vivaldi", Font.BOLD, 20));
		lblNewLabel_1_1_2_1_1_1_2.setBackground(Color.WHITE);
		lblNewLabel_1_1_2_1_1_1_2.setBounds(294, 422, 413, 25);
		panelPaiement.add(lblNewLabel_1_1_2_1_1_1_2);
		
		JComboBox<String> comboBoxMoi = new JComboBox<String>();
		comboBoxMoi.setToolTipText("");
		comboBoxMoi.setFont(new Font("Vivaldi", Font.PLAIN, 20));
		comboBoxMoi.setBackground(Color.WHITE);
		comboBoxMoi.setBounds(294, 375, 81, 37);
		panelPaiement.add(comboBoxMoi);
		
		// add items to the combo box
				comboBoxMoi.addItem("01");
				comboBoxMoi.addItem("02");
				comboBoxMoi.addItem("03");
				comboBoxMoi.addItem("04");
				comboBoxMoi.addItem("05");
				comboBoxMoi.addItem("06");
				comboBoxMoi.addItem("07");
				comboBoxMoi.addItem("08");
				comboBoxMoi.addItem("09");
				comboBoxMoi.addItem("10");
				comboBoxMoi.addItem("11");
				comboBoxMoi.addItem("12");
		
		JComboBox<String> comboBoxAnnee = new JComboBox<String>();
		comboBoxAnnee.setToolTipText("");
		comboBoxAnnee.setFont(new Font("Vivaldi", Font.PLAIN, 20));
		comboBoxAnnee.setBackground(Color.WHITE);
		comboBoxAnnee.setBounds(420, 375, 88, 37);
		panelPaiement.add(comboBoxAnnee);
		
		// add items to the combo box
			comboBoxAnnee.addItem("2020");
			comboBoxAnnee.addItem("2021");
			comboBoxAnnee.addItem("2022");
			comboBoxAnnee.addItem("2023");
			comboBoxAnnee.addItem("2024");
			comboBoxAnnee.addItem("2025");
			comboBoxAnnee.addItem("2026");
			comboBoxAnnee.addItem("2027");
			comboBoxAnnee.addItem("2028");
			comboBoxAnnee.addItem("2029");
			comboBoxAnnee.addItem("2030");
		
		
		JLabel lblNewLabel_1_1_2_1_1_1_1 = new JLabel("Expiration");
		lblNewLabel_1_1_2_1_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_2_1_1_1_1.setFont(new Font("Vivaldi", Font.BOLD, 20));
		lblNewLabel_1_1_2_1_1_1_1.setBackground(Color.WHITE);
		lblNewLabel_1_1_2_1_1_1_1.setBounds(294, 340, 413, 25);
		panelPaiement.add(lblNewLabel_1_1_2_1_1_1_1);
		
		textFieldNumeroCarte = new JTextField();
		textFieldNumeroCarte.setFont(new Font("Vivaldi", Font.PLAIN, 20));
		textFieldNumeroCarte.setColumns(10);
		textFieldNumeroCarte.setBounds(294, 293, 413, 37);
		panelPaiement.add(textFieldNumeroCarte);
		
		textFieldNomTitulairecarte = new JTextField();
		textFieldNomTitulairecarte.setFont(new Font("Vivaldi", Font.PLAIN, 20));
		textFieldNomTitulairecarte.setColumns(10);
		textFieldNomTitulairecarte.setBounds(294, 211, 413, 37);
		panelPaiement.add(textFieldNomTitulairecarte);
		
		JLabel lblNewLabel_1_1_2_1_1_1 = new JLabel("Numero de la carte");
		lblNewLabel_1_1_2_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_2_1_1_1.setFont(new Font("Vivaldi", Font.BOLD, 20));
		lblNewLabel_1_1_2_1_1_1.setBackground(Color.WHITE);
		lblNewLabel_1_1_2_1_1_1.setBounds(294, 258, 413, 25);
		panelPaiement.add(lblNewLabel_1_1_2_1_1_1);
		
		JLabel lblNewLabel_1_1_2_1_1 = new JLabel("Nom et prenom du titulaire de la carte");
		lblNewLabel_1_1_2_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_2_1_1.setFont(new Font("Vivaldi", Font.BOLD, 20));
		lblNewLabel_1_1_2_1_1.setBackground(Color.WHITE);
		lblNewLabel_1_1_2_1_1.setBounds(294, 176, 413, 25);
		panelPaiement.add(lblNewLabel_1_1_2_1_1);
		
		JRadioButton rdbtnVirementSepa = new JRadioButton("Virement SEPA \u00E0 effectuer dans les 7 jours calendrier");
		rdbtnVirementSepa.setFont(new Font("Vivaldi", Font.BOLD, 20));
		rdbtnVirementSepa.setBackground(Color.WHITE);
		rdbtnVirementSepa.setBounds(294, 113, 662, 21);
		panelPaiement.add(rdbtnVirementSepa);
		
		JRadioButton rdbtnPaypal = new JRadioButton("PayPal");
		rdbtnPaypal.setFont(new Font("Vivaldi", Font.BOLD, 20));
		rdbtnPaypal.setBackground(Color.WHITE);
		rdbtnPaypal.setBounds(294, 81, 643, 21);
		panelPaiement.add(rdbtnPaypal);
		
		JRadioButton rdbtnVisa = new JRadioButton("Visa");
		rdbtnVisa.setFont(new Font("Vivaldi", Font.BOLD, 20));
		rdbtnVisa.setBackground(Color.WHITE);
		rdbtnVisa.setBounds(294, 52, 643, 21);
		panelPaiement.add(rdbtnVisa);
		
		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnVirementSepa);
		group.add(rdbtnPaypal);
		group.add(rdbtnVisa);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("Mode de paiement");
		lblNewLabel_1_1_2_1.setForeground(Color.RED);
		lblNewLabel_1_1_2_1.setFont(new Font("Vivaldi", Font.BOLD, 20));
		lblNewLabel_1_1_2_1.setBackground(Color.WHITE);
		lblNewLabel_1_1_2_1.setBounds(294, 10, 234, 25);
		panelPaiement.add(lblNewLabel_1_1_2_1);
		
		
		
		
		
		
		
		
	}
	
	private void ListedesPlanning() {
		
		panelListePlanning = new JPanel();
		panelListePlanning.setBackground(Color.WHITE);
		panelListePlanning.setBounds(0, 0, 962, 801);
		contentPane.add(panelListePlanning);
		panelListePlanning.setLayout(null);
		
		JComboBox comboBoxListePlanning = new JComboBox();
		comboBoxListePlanning.setBackground(Color.WHITE);
		comboBoxListePlanning.setBounds(46, 67, 879, 54);
		panelListePlanning.add(comboBoxListePlanning);
		
		RoomManager roomManager =  new RoomManager();
		 roomManager =  new RoomManager(roomManager.getIDPerson_RoomManager_fk());
		 PlanningOfRoom planningOfRoom = new PlanningOfRoom();
		// if(roomManager.getIDPerson_RoomManager_fk() == Person.CurrentUser.getIDperson()) {
			 planningOfRoom = new PlanningOfRoom(planningOfRoom.getIDplanningOfRoom(),planningOfRoom.getBiginDate(),
					planningOfRoom.getEndDate(), roomManager);
			 var result =  planningOfRoom.findAll(be.niver.connect.ConnectDataBase.getInstance());
			
			 for(var p : result ) {
				comboBoxListePlanning.addItem(p);
				}
			 
		
		 //}
		
		/*JLabel Heuredebut = new JLabel("Heure d\u00E9but");
		Heuredebut.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 20));
		Heuredebut.setBounds(10, 132, 203, 28);
		panelListePlanning.add(Heuredebut);
		
		JLabel lblHeurefin = new JLabel("Heure fin");
		lblHeurefin.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 20));
		lblHeurefin.setBounds(10, 171, 203, 28);
		panelListePlanning.add(lblHeurefin);
		
		JLabel lblNumero = new JLabel("Numero");
		lblNumero.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 20));
		lblNumero.setBounds(10, 94, 203, 28);
		panelListePlanning.add(lblNumero);
		
		JLabel lblNumeroDeReservation = new JLabel("Numero de reservation");
		lblNumeroDeReservation.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 20));
		lblNumeroDeReservation.setBounds(10, 209, 203, 28);
		panelListePlanning.add(lblNumeroDeReservation);
		
		JLabel lblNumeroDuManager = new JLabel("Numero du Manager");
		lblNumeroDuManager.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 20));
		lblNumeroDuManager.setBounds(10, 257, 203, 28);
		panelListePlanning.add(lblNumeroDuManager);
		
		textFieldNumeroManager = new JTextField();
		textFieldNumeroManager.setBounds(223, 257, 286, 26);
		panelListePlanning.add(textFieldNumeroManager);
		textFieldNumeroManager.setColumns(10);
		
		textFieldNumeroReservation = new JTextField();
		textFieldNumeroReservation.setColumns(10);
		textFieldNumeroReservation.setBounds(223, 216, 286, 26);
		panelListePlanning.add(textFieldNumeroReservation);
		
		textFieldNumeroPlanning = new JTextField();
		textFieldNumeroPlanning.setColumns(10);
		textFieldNumeroPlanning.setBounds(223, 101, 286, 26);
		panelListePlanning.add(textFieldNumeroPlanning);
		
		JDateChooser dateChooserDateDebut = new JDateChooser();
		dateChooserDateDebut.setBounds(223, 134, 286, 26);
		panelListePlanning.add(dateChooserDateDebut);
		
		JDateChooser dateChooserDateFin = new JDateChooser();
		dateChooserDateFin.setBounds(223, 173, 286, 26);
		panelListePlanning.add(dateChooserDateFin);*/
		
		
		
	}
	
	
	private void PlanningRoom() {
		panelPllanningRoom = new JPanel();
		panelPllanningRoom.setBackground(Color.WHITE);
		panelPllanningRoom.setBounds(0, 0, 962, 801);
		contentPane.add(panelPllanningRoom);
		panelPllanningRoom.setLayout(null);
		
		JLabel Heuredebut = new JLabel("Heure d\u00E9but");
		Heuredebut.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 20));
		Heuredebut.setBounds(437, 76, 129, 28);
		panelPllanningRoom.add(Heuredebut);
		
		JLabel lblHeurefin = new JLabel("Heure fin");
		lblHeurefin.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 20));
		lblHeurefin.setBounds(441, 125, 138, 28);
		panelPllanningRoom.add(lblHeurefin);
		
		JDateChooser dateChooserDateDebut = new JDateChooser();
		dateChooserDateDebut.setBounds(576, 76, 333, 28);
		panelPllanningRoom.add(dateChooserDateDebut);
		
		JDateChooser dateChooserDateFin = new JDateChooser();
		dateChooserDateFin.setBounds(576, 125, 333, 28);
		panelPllanningRoom.add(dateChooserDateFin);
		
		JButton btnValiderplanification = new JButton("Valider");
		
		
		
		btnValiderplanification.setForeground(Color.BLACK);
		btnValiderplanification.setBackground(SystemColor.textHighlight);
		btnValiderplanification.setBounds(624, 596, 98, 46);
		panelPllanningRoom.add(btnValiderplanification);
	
		JLabel lblPlanificationDesSalles = new JLabel("Planification des salles");
		lblPlanificationDesSalles.setForeground(Color.BLUE);
		lblPlanificationDesSalles.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 33));
		lblPlanificationDesSalles.setBounds(441, 10, 521, 33);
		panelPllanningRoom.add(lblPlanificationDesSalles);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Home.class.getResource("/images/show.jpg")));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(0, 0, 427, 733);
		panelPllanningRoom.add(lblNewLabel_1);
		
		
		
		//action btnPayerspectator
		
				btnValiderplanification.addMouseListener(new MouseAdapter() {
					
					@Override
					public void mouseClicked(MouseEvent e) {
						try {
							
							if(dateChooserDateDebut.getDate().toString().isBlank() || dateChooserDateFin.getDate().toString().isBlank()) {
								JOptionPane.showMessageDialog(null, "veuillez remplir tous les champs", "bosquet Wallon ", JOptionPane.ERROR_MESSAGE);
								
							}else {
								
								SimpleDateFormat dcn = new SimpleDateFormat("yyyy-MM-dd");
							    String dates1 = dcn.format(dateChooserDateDebut.getDate() );
							    Date date1 = Date.valueOf(dates1);
							   
							    SimpleDateFormat dcn1 = new SimpleDateFormat("yyyy-MM-dd");
							    String dates2 = dcn.format(dateChooserDateFin.getDate() );
							    Date date2 = Date.valueOf(dates2);
							    //System.out.println(date1+ " " +date2);
							    
							    
								PlanningOfRoom  planningOfRoom = new PlanningOfRoom(0, date1, date2,(RoomManager) Person.CurrentUser);
								var result = planningOfRoom.create(be.niver.connect.ConnectDataBase.getInstance());
								
								if(result) {
									JOptionPane.showMessageDialog(null, "planning éffectuer avec succès ", "bosquet Wallon ", JOptionPane.INFORMATION_MESSAGE);
									dateChooserDateDebut.setCalendar(null);
									dateChooserDateFin.setCalendar(null);
									
								}else {
									JOptionPane.showMessageDialog(null, "Erreur rencontrée. Veuillez contacter l'administrateur", "bosquet Wallon ", JOptionPane.ERROR_MESSAGE);
								}
								
							}
							
							
						}
						catch(Exception ex) {
							JOptionPane.showMessageDialog(null, "Erreur rencontrée. Veuillez contacter l'administrateur", "bosquet Wallon ", JOptionPane.ERROR_MESSAGE);
							ex.printStackTrace();
						}
					}
					
				});
		
		
		
	}
	
	private void UpdatePlanningRoom() {
		panelPllanningRoom = new JPanel();
		panelPllanningRoom.setBackground(Color.WHITE);
		panelPllanningRoom.setBounds(0, 0, 962, 801);
		contentPane.add(panelPllanningRoom);
		panelPllanningRoom.setLayout(null);
		
		JLabel Heuredebut = new JLabel("Heure d\u00E9but");
		Heuredebut.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 20));
		Heuredebut.setBounds(437, 76, 129, 28);
		panelPllanningRoom.add(Heuredebut);
		
		JLabel lblHeurefin = new JLabel("Heure fin");
		lblHeurefin.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 20));
		lblHeurefin.setBounds(441, 125, 138, 28);
		panelPllanningRoom.add(lblHeurefin);
		
		JButton btnValiderplanification = new JButton("Valider");
		btnValiderplanification.setForeground(Color.BLACK);
		btnValiderplanification.setBackground(SystemColor.textHighlight);
		btnValiderplanification.setBounds(624, 596, 98, 46);
		panelPllanningRoom.add(btnValiderplanification);
		
		JLabel lblPlanificationDesSalles = new JLabel("Planification des salles");
		lblPlanificationDesSalles.setForeground(Color.BLUE);
		lblPlanificationDesSalles.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 33));
		lblPlanificationDesSalles.setBounds(441, 10, 521, 33);
		panelPllanningRoom.add(lblPlanificationDesSalles);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Home.class.getResource("/images/show.jpg")));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(0, 0, 427, 733);
		panelPllanningRoom.add(lblNewLabel_1);
		
		JDateChooser dateChooserDateDebut = new JDateChooser();
		dateChooserDateDebut.setBounds(576, 76, 333, 28);
		panelPllanningRoom.add(dateChooserDateDebut);
		
		JDateChooser dateChooserDateFin = new JDateChooser();
		dateChooserDateFin.setBounds(576, 125, 333, 28);
		panelPllanningRoom.add(dateChooserDateFin);
		
		
		
		
	}
	
	private void Reservation() {
		panelReservation = new JPanel();
		panelReservation.setBackground(Color.WHITE);
		panelReservation.setBounds(0, 0, 962, 801);
		contentPane.add(panelReservation);
		panelReservation.setLayout(null);
		
		JLabel lblLocationtitre = new JLabel("Formulaire De Reservation");
		lblLocationtitre.setBounds(0, 0, 620, 46);
		lblLocationtitre.setHorizontalAlignment(SwingConstants.CENTER);
		lblLocationtitre.setForeground(Color.BLUE);
		lblLocationtitre.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 40));
		panelReservation.add(lblLocationtitre);
		
		JLabel lblJour = new JLabel("Date debut");
		lblJour.setBounds(10, 63, 118, 27);
		lblJour.setHorizontalAlignment(SwingConstants.LEFT);
		lblJour.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 25));
		panelReservation.add(lblJour);
		
		JLabel lblLoyer = new JLabel("Loyer");
		lblLoyer.setBounds(10, 100, 118, 27);
		lblLoyer.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 25));
		panelReservation.add(lblLoyer);
		
		JLabel lblAccompte = new JLabel("Accompte");
		lblAccompte.setBounds(10, 133, 118, 27);
		lblAccompte.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 25));
		panelReservation.add(lblAccompte);
		
		JLabel lblGarrantie = new JLabel("Garrantie");
		lblGarrantie.setBounds(10, 170, 118, 27);
		lblGarrantie.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 25));
		panelReservation.add(lblGarrantie);
		
		textFieldgarrantie = new JTextField();
		textFieldgarrantie.setBounds(138, 182, 381, 27);
		textFieldgarrantie.setEditable(false);
		textFieldgarrantie.setText("4000 euros");
		textFieldgarrantie.setFont(new Font("Vivaldi", Font.BOLD, 20));
		textFieldgarrantie.setColumns(10);
		panelReservation.add(textFieldgarrantie);
		
		textFieldAccompte = new JTextField();
		textFieldAccompte.setBounds(138, 145, 381, 27);
		textFieldAccompte.setEditable(false);
		textFieldAccompte.setText(" 1000 euros");
		textFieldAccompte.setFont(new Font("Vivaldi", Font.BOLD, 20));
		textFieldAccompte.setColumns(10);
		panelReservation.add(textFieldAccompte);
		
		textFieldLoyer = new JTextField();
		textFieldLoyer.setBounds(138, 112, 381, 27);
		textFieldLoyer.setFont(new Font("Vivaldi", Font.BOLD, 20));
		textFieldLoyer.setColumns(10);
		panelReservation.add(textFieldLoyer);
		
		JCheckBox chckbxPersonelBarlocation = new JCheckBox("Personnel Bar");
		chckbxPersonelBarlocation.setBounds(13, 277, 120, 21);
		chckbxPersonelBarlocation.setBackground(Color.WHITE);
		panelReservation.add(chckbxPersonelBarlocation);
		
		JCheckBox chckbxPersSecuritelocation = new JCheckBox("Personnel S\u00E9curit\u00E9");
		chckbxPersSecuritelocation.setBounds(13, 310, 120, 21);
		chckbxPersSecuritelocation.setBackground(Color.WHITE);
		panelReservation.add(chckbxPersSecuritelocation);
		
		JCheckBox chckbxPersVestiaireLocation = new JCheckBox("Personnel vestiaires");
		chckbxPersVestiaireLocation.setBounds(13, 341, 120, 21);
		chckbxPersVestiaireLocation.setBackground(Color.WHITE);
		panelReservation.add(chckbxPersVestiaireLocation);
		
		JCheckBox chckbxNettoyageSalleLocation = new JCheckBox("Nettoyage salle");
		chckbxNettoyageSalleLocation.setBounds(13, 376, 120, 21);
		chckbxNettoyageSalleLocation.setBackground(Color.WHITE);
		panelReservation.add(chckbxNettoyageSalleLocation);
		
		JCheckBox chckbxAfficheLocation = new JCheckBox("colleur d\u2019affiche");
		chckbxAfficheLocation.setBounds(13, 411, 120, 21);
		chckbxAfficheLocation.setBackground(Color.WHITE);
		panelReservation.add(chckbxAfficheLocation);
		
		JCheckBox chckbxPresseLocation = new JCheckBox("Service de presse");
		chckbxPresseLocation.setBounds(160, 376, 138, 21);
		chckbxPresseLocation.setBackground(Color.WHITE);
		panelReservation.add(chckbxPresseLocation);
		
		JButton  btnValiderPanelReservation = new JButton("Valider");
		btnValiderPanelReservation.setBounds(175, 554, 98, 46);
		btnValiderPanelReservation.setForeground(Color.BLACK);
		btnValiderPanelReservation.setBackground(SystemColor.textHighlight);
		panelReservation.add(btnValiderPanelReservation);
		
		JCheckBox chckbxChampagneLocation = new JCheckBox("champagne");
		chckbxChampagneLocation.setBounds(304, 411, 215, 21);
		chckbxChampagneLocation.setBackground(Color.WHITE);
		panelReservation.add(chckbxChampagneLocation);
		
		JCheckBox chckbxTraiteurLocation = new JCheckBox("option traiteur");
		chckbxTraiteurLocation.setBounds(304, 378, 215, 21);
		chckbxTraiteurLocation.setBackground(Color.WHITE);
		panelReservation.add(chckbxTraiteurLocation);
		
		JCheckBox chckbxOptionAllInLocation = new JCheckBox("option all in");
		chckbxOptionAllInLocation.setBounds(304, 343, 215, 21);
		chckbxOptionAllInLocation.setBackground(Color.WHITE);
		panelReservation.add(chckbxOptionAllInLocation);
		
		JCheckBox chckbxHotessesLocation = new JCheckBox("hotesses");
		chckbxHotessesLocation.setBounds(304, 312, 215, 21);
		chckbxHotessesLocation.setBackground(Color.WHITE);
		panelReservation.add(chckbxHotessesLocation);
		
		JCheckBox chckbxBackstageLocation = new JCheckBox("Backstage");
		chckbxBackstageLocation.setBounds(304, 279, 215, 21);
		chckbxBackstageLocation.setBackground(Color.WHITE);
		panelReservation.add(chckbxBackstageLocation);
		
		JCheckBox chckbxLumiereLocation = new JCheckBox("ing\u00E9nieur lumi\u00E8re");
		chckbxLumiereLocation.setBounds(160, 341, 138, 21);
		chckbxLumiereLocation.setBackground(Color.WHITE);
		panelReservation.add(chckbxLumiereLocation);
		
		JCheckBox chckbxSonLocation = new JCheckBox("ing\u00E9nieur du son");
		chckbxSonLocation.setBounds(160, 310, 138, 21);
		chckbxSonLocation.setBackground(Color.WHITE);
		panelReservation.add(chckbxSonLocation);
		
		JCheckBox chckbxAssuranceLocation = new JCheckBox("Assurances tout risque");
		chckbxAssuranceLocation.setBounds(160, 277, 138, 21);
		chckbxAssuranceLocation.setBackground(Color.WHITE);
		panelReservation.add(chckbxAssuranceLocation);
		
		JLabel lblserviceoptionelLocation = new JLabel("Services Optionnels");
		lblserviceoptionelLocation.setBounds(10, 225, 288, 37);
		lblserviceoptionelLocation.setHorizontalAlignment(SwingConstants.CENTER);
		lblserviceoptionelLocation.setForeground(Color.RED);
		lblserviceoptionelLocation.setFont(new Font("Vivaldi", Font.BOLD, 22));
		lblserviceoptionelLocation.setBackground(Color.PINK);
		panelReservation.add(lblserviceoptionelLocation);
		
		JLabel lblServicesVip_1 = new JLabel("Services vip");
		lblServicesVip_1.setBounds(304, 219, 215, 37);
		lblServicesVip_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblServicesVip_1.setForeground(Color.RED);
		lblServicesVip_1.setFont(new Font("Vivaldi", Font.BOLD, 22));
		lblServicesVip_1.setBackground(Color.PINK);
		panelReservation.add(lblServicesVip_1);
		
		JLabel lblDisponibilites = new JLabel("Configuration ");
		lblDisponibilites.setHorizontalAlignment(SwingConstants.CENTER);
		lblDisponibilites.setForeground(Color.BLUE);
		lblDisponibilites.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 25));
		lblDisponibilites.setBounds(619, 4, 333, 37);
		panelReservation.add(lblDisponibilites);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(138, 65, 381, 37);
		panelReservation.add(dateChooser);
		
		JLabel lblMontant = new JLabel("Montant");
		lblMontant.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 25));
		lblMontant.setBounds(10, 463, 118, 27);
		panelReservation.add(lblMontant);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setFont(new Font("Vivaldi", Font.BOLD, 20));
		textField.setColumns(10);
		textField.setBounds(138, 463, 381, 27);
		panelReservation.add(textField);
		
		textFieldPrixdebout = new JTextField();
		textFieldPrixdebout.setEditable(false);
		textFieldPrixdebout.setFont(new Font("Vivaldi", Font.BOLD, 20));
		textFieldPrixdebout.setColumns(10);
		textFieldPrixdebout.setBounds(761, 129, 150, 24);
		panelReservation.add(textFieldPrixdebout);
		
		JLabel lblPrixPlannification = new JLabel("Prix");
		lblPrixPlannification.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrixPlannification.setForeground(Color.RED);
		lblPrixPlannification.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 20));
		lblPrixPlannification.setBackground(Color.GRAY);
		lblPrixPlannification.setBounds(792, 175, 101, 27);
		panelReservation.add(lblPrixPlannification);
		
		JLabel lblOrPlannification = new JLabel("Or");
		lblOrPlannification.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 20));
		lblOrPlannification.setBounds(655, 202, 86, 28);
		panelReservation.add(lblOrPlannification);
		
		textFieldPrixOrConcert = new JTextField();
		textFieldPrixOrConcert.setEditable(false);
		textFieldPrixOrConcert.setFont(new Font("Vivaldi", Font.BOLD, 20));
		textFieldPrixOrConcert.setColumns(10);
		textFieldPrixOrConcert.setBounds(761, 209, 150, 21);
		panelReservation.add(textFieldPrixOrConcert);
		
		JLabel lblArgentPlannification = new JLabel("Argent");
		lblArgentPlannification.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 20));
		lblArgentPlannification.setBounds(655, 235, 86, 28);
		panelReservation.add(lblArgentPlannification);
		
		textFieldpricargentConcert = new JTextField();
		textFieldpricargentConcert.setEditable(false);
		textFieldpricargentConcert.setFont(new Font("Vivaldi", Font.BOLD, 20));
		textFieldpricargentConcert.setColumns(10);
		textFieldpricargentConcert.setBounds(761, 242, 150, 21);
		panelReservation.add(textFieldpricargentConcert);
		
		JLabel lblBronzeConcert = new JLabel("Bronze");
		lblBronzeConcert.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 20));
		lblBronzeConcert.setBounds(655, 267, 86, 28);
		panelReservation.add(lblBronzeConcert);
		
		textFieldBronzeConcert = new JTextField();
		textFieldBronzeConcert.setEditable(false);
		textFieldBronzeConcert.setFont(new Font("Vivaldi", Font.BOLD, 20));
		textFieldBronzeConcert.setColumns(10);
		textFieldBronzeConcert.setBounds(761, 274, 150, 21);
		panelReservation.add(textFieldBronzeConcert);
		
		textFieldprixdiamantCirque = new JTextField();
		textFieldprixdiamantCirque.setEditable(false);
		textFieldprixdiamantCirque.setFont(new Font("Vivaldi", Font.BOLD, 20));
		textFieldprixdiamantCirque.setColumns(10);
		textFieldprixdiamantCirque.setBounds(761, 336, 150, 21);
		panelReservation.add(textFieldprixdiamantCirque);
		
		textFieldprixorCirque = new JTextField();
		textFieldprixorCirque.setEditable(false);
		textFieldprixorCirque.setFont(new Font("Vivaldi", Font.BOLD, 20));
		textFieldprixorCirque.setColumns(10);
		textFieldprixorCirque.setBounds(761, 378, 150, 21);
		panelReservation.add(textFieldprixorCirque);
		
		textFieldprixargentCirque = new JTextField();
		textFieldprixargentCirque.setEditable(false);
		textFieldprixargentCirque.setFont(new Font("Vivaldi", Font.BOLD, 20));
		textFieldprixargentCirque.setColumns(10);
		textFieldprixargentCirque.setBounds(761, 411, 150, 21);
		panelReservation.add(textFieldprixargentCirque);
		
		textFieldprixbronzeCirque = new JTextField();
		textFieldprixbronzeCirque.setEditable(false);
		textFieldprixbronzeCirque.setFont(new Font("Vivaldi", Font.BOLD, 20));
		textFieldprixbronzeCirque.setColumns(10);
		textFieldprixbronzeCirque.setBounds(761, 443, 150, 21);
		panelReservation.add(textFieldprixbronzeCirque);
		
		JLabel lblPrixPlannification_1 = new JLabel("Prix");
		lblPrixPlannification_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrixPlannification_1.setForeground(Color.RED);
		lblPrixPlannification_1.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 20));
		lblPrixPlannification_1.setBackground(Color.GRAY);
		lblPrixPlannification_1.setBounds(923, 262, 132, 27);
		panelReservation.add(lblPrixPlannification_1);
		
		JLabel lblBronzePlanification_1 = new JLabel("Bronze");
		lblBronzePlanification_1.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 20));
		lblBronzePlanification_1.setBounds(655, 432, 89, 28);
		panelReservation.add(lblBronzePlanification_1);
		
		JLabel lblArgentPlannification_1 = new JLabel("Argent");
		lblArgentPlannification_1.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 20));
		lblArgentPlannification_1.setBounds(655, 400, 89, 28);
		panelReservation.add(lblArgentPlannification_1);
		
		JLabel lblOrPlannification_1 = new JLabel("Or");
		lblOrPlannification_1.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 20));
		lblOrPlannification_1.setBounds(655, 367, 89, 28);
		panelReservation.add(lblOrPlannification_1);
		
		JLabel lblOrPlannification_1_1 = new JLabel("Diamant");
		lblOrPlannification_1_1.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 20));
		lblOrPlannification_1_1.setBounds(655, 331, 89, 28);
		panelReservation.add(lblOrPlannification_1_1);
		
		JLabel lblPrixPlannification_2 = new JLabel("Prix");
		lblPrixPlannification_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrixPlannification_2.setForeground(Color.RED);
		lblPrixPlannification_2.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 20));
		lblPrixPlannification_2.setBackground(Color.GRAY);
		lblPrixPlannification_2.setBounds(792, 308, 101, 21);
		panelReservation.add(lblPrixPlannification_2);
		
		JLabel lblPrixPlannification_3 = new JLabel("Prix");
		lblPrixPlannification_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrixPlannification_3.setForeground(Color.RED);
		lblPrixPlannification_3.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 20));
		lblPrixPlannification_3.setBackground(Color.GRAY);
		lblPrixPlannification_3.setBounds(772, 100, 101, 27);
		panelReservation.add(lblPrixPlannification_3);
		
		JRadioButton rdbtnNewRadioButtonDebout = new JRadioButton("Debout");
		rdbtnNewRadioButtonDebout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnNewRadioButtonDebout.isSelected();
				textFieldPrixdebout.setEditable(true);
			}
		});
		rdbtnNewRadioButtonDebout.setForeground(Color.RED);
		rdbtnNewRadioButtonDebout.setBackground(Color.WHITE);
		rdbtnNewRadioButtonDebout.setFont(new Font("Vivaldi", Font.BOLD, 20));
		rdbtnNewRadioButtonDebout.setBounds(605, 127, 150, 27);
		panelReservation.add(rdbtnNewRadioButtonDebout);
		
		JRadioButton rdbtnAssisVersionConcert = new JRadioButton("Assis version concert");
		rdbtnAssisVersionConcert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnAssisVersionConcert.isSelected();
				textFieldPrixOrConcert.setEditable(true);
				textFieldpricargentConcert.setEditable(true);
				textFieldBronzeConcert.setEditable(true);
			}
		});
		rdbtnAssisVersionConcert.setForeground(Color.RED);
		rdbtnAssisVersionConcert.setFont(new Font("Vivaldi", Font.BOLD, 20));
		rdbtnAssisVersionConcert.setBackground(Color.WHITE);
		rdbtnAssisVersionConcert.setBounds(605, 172, 181, 27);
		panelReservation.add(rdbtnAssisVersionConcert);
		
		JRadioButton rdbtnAssisVersionCirque = new JRadioButton("Assis version cirque");
		rdbtnAssisVersionCirque.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnAssisVersionCirque.isSelected();
				textFieldprixdiamantCirque.setEditable(true);
				textFieldprixorCirque.setEditable(true);
				textFieldprixargentCirque.setEditable(true);
				textFieldprixbronzeCirque.setEditable(true);
			}
		});
		rdbtnAssisVersionCirque.setForeground(Color.RED);
		rdbtnAssisVersionCirque.setFont(new Font("Vivaldi", Font.BOLD, 20));
		rdbtnAssisVersionCirque.setBackground(Color.WHITE);
		rdbtnAssisVersionCirque.setBounds(605, 301, 181, 27);
		panelReservation.add(rdbtnAssisVersionCirque);
		
		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnNewRadioButtonDebout);
		group.add(rdbtnAssisVersionConcert);
		group.add(rdbtnAssisVersionCirque);
		
		JPanel panel = new JPanel();
		panel.setBounds(560, 61, 10, 399);
		panelReservation.add(panel);
		
		JLabel lblDescription = new JLabel("Description");
		lblDescription.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 20));
		lblDescription.setBounds(605, 63, 132, 28);
		panelReservation.add(lblDescription);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Vivaldi", Font.BOLD, 20));
		textField_1.setColumns(10);
		textField_1.setBounds(755, 63, 156, 28);
		panelReservation.add(textField_1);
		
		//btnValiderPanelReservation
		btnValiderPanelReservation.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				hideAllPanel();
				panelPaiement.setVisible(true);
			}
			
		});
		
		
		
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
		panelPllanningRoom.setVisible(false);
		panelListePlanning.setVisible(false);
		panelPaiement.setVisible(false);
		panelListeReservationManager.setVisible(false);
		panelFicheSignaletiqueSpectacle.setVisible(false);
		panelPagnierSpectator.setVisible(false);
		panelLESCommandesSpectator.setVisible(false);
	}
	
	private void menu() 
	{
		JMenuBar menuBar = new JMenuBar();
		menuBar.setMargin(new Insets(5, 0, 5, 0));
		menuBar.setFont(new Font("HP Simplified", Font.BOLD, 28));
		setJMenuBar(menuBar);
		
		JMenu mnexitacceuil, mnuser, Retour, 
		ListReservationOrganizer, updateuser, GestionreservationRoomManager, reserverSepectator, plannifier, plannifierupdate, 
		reserverSalle, MescommandeSpectator, MonPagnierSpectator, ficheSignalitiqueSpectacle;
		
		
		mnexitacceuil=new JMenu("Quiter"); 
		mnexitacceuil.setBackground(Color.RED);
		mnexitacceuil.setHorizontalAlignment(SwingConstants.RIGHT);
		mnexitacceuil.setFont(new Font("HP Simplified", Font.BOLD | Font.ITALIC, 15));
		mnexitacceuil.setForeground(Color.BLACK);
		
		Retour =new JMenu("Retour"); 
		Retour.setHorizontalAlignment(SwingConstants.RIGHT);
		Retour.setFont(new Font("HP Simplified", Font.BOLD | Font.ITALIC, 15));
		Retour.setForeground(Color.BLACK);
		//JOptionPane.showMessageDialog(null, Person.CurrentUser.getIDperson(), "bosquet Wallon ",JOptionPane.ERROR_MESSAGE);
		
		
		/**
		 * menu pour chaque roles
		 */
		
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
			
			GestionreservationRoomManager = new JMenu("Conculter les reservations sur mes planning");
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
			
			MonPagnierSpectator = new JMenu("Aller au Pagnier");
			MonPagnierSpectator.setHorizontalAlignment(SwingConstants.RIGHT);
			MonPagnierSpectator.setForeground(Color.BLACK);
			MonPagnierSpectator.setFont(new Font("HP Simplified", Font.BOLD | Font.ITALIC, 15));
			
			
			plannifierupdate = new JMenu("Modifier un planning");
			plannifierupdate.setHorizontalAlignment(SwingConstants.RIGHT);
			plannifierupdate.setForeground(Color.BLACK);
			plannifierupdate.setFont(new Font("HP Simplified", Font.BOLD | Font.ITALIC, 15));
			
			reserverSalle = new JMenu("reserver la sale");
			reserverSalle.setHorizontalAlignment(SwingConstants.RIGHT);
			reserverSalle.setForeground(Color.BLACK);
			reserverSalle.setFont(new Font("HP Simplified", Font.BOLD | Font.ITALIC, 15));
			
			ficheSignalitiqueSpectacle = new JMenu("Encoder la fiche Signalitique");
			ficheSignalitiqueSpectacle.setHorizontalAlignment(SwingConstants.RIGHT);
			ficheSignalitiqueSpectacle.setForeground(Color.BLACK);
			ficheSignalitiqueSpectacle.setFont(new Font("HP Simplified", Font.BOLD | Font.ITALIC, 15));
			
			mnuser.add(updateuser);
			if(Person.CurrentUser.getrole()==3) {
				mnuser.add(reserverSalle);
				mnuser.add(ficheSignalitiqueSpectacle);
				mnuser.add(ListReservationOrganizer);
			}
			else if(Person.CurrentUser.getrole()==2) {
				mnuser.add(GestionreservationRoomManager);
				mnuser.add(plannifierupdate);
				
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
			
			
			// action plannifierRoom
			plannifierupdate.addMouseListener(new MouseAdapter() {
							
					@Override
					public void mouseClicked(MouseEvent e) {
						hideAllPanel();
						panelPllanningRoom.setVisible(true);
					}
					
				});
			
			//action ListReservationOrganizer
			
			ListReservationOrganizer.addMouseListener(new MouseAdapter() {
				
				@Override
				public void mouseClicked(MouseEvent e) {
					hideAllPanel();
					panelListeReservationManager.setVisible(true);
				}
				
			});
						
			// action GestionreservationRoomManager
				GestionreservationRoomManager.addMouseListener(new MouseAdapter() {
				
				@Override
				public void mouseClicked(MouseEvent e) {
					hideAllPanel();
					panelListePlanning.setVisible(true);
				}
				
			});
				
			//action MonPagnierSpectator
				
			MonPagnierSpectator.addMouseListener(new MouseAdapter() {
				
				@Override
				public void mouseClicked(MouseEvent e) {
					hideAllPanel();
					panelPagnierSpectator.setVisible(true);
				}
				
			});	
				
			// action button quiter
			mnexitacceuil.addMouseListener(new MouseAdapter() {
				
				@Override
				public void mouseClicked(MouseEvent e) {
					dispose();
				}
				
			});
			
			//reserverSalle
			reserverSalle.addMouseListener(new MouseAdapter() {
				
				@Override
				public void mouseClicked(MouseEvent e) {
					hideAllPanel();
					panelReservation.setVisible(true);
				}
				
			});
			
			
			
			
			
			
			
			
			//action MescommandeSpectator
			
			MescommandeSpectator.addMouseListener(new MouseAdapter() {
				
				@Override
				public void mouseClicked(MouseEvent e) {
					hideAllPanel();
					panelLESCommandesSpectator.setVisible(true);
				}
				
			});
			
			//action ficheSignalitiqueSpectacle
			ficheSignalitiqueSpectacle.addMouseListener(new MouseAdapter() {
				
				@Override
				public void mouseClicked(MouseEvent e) {
					hideAllPanel();
					panelFicheSignaletiqueSpectacle.setVisible(true);
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
		menuBar.add(Retour);
		menuBar.add(mnexitacceuil);
		
		
	}
}
