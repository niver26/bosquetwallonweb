package be.niver.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;

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
import javax.swing.JList;
import javax.swing.JComboBox;

public class Inscription extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordFieldInscription;
	private JTextField textFieldemailInscription;
	private JTextField textFieldadresseInscription;
	private JTextField textFieldprenomInscription;
	private JTextField textFieldNomInscription;
	private JTextField textField;
	private JTextField textFieldTitulaireCartebancaire;

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
		lblNewLabel.setBounds(10, 10, 758, 33);
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
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.inactiveCaption);
		panel.setBounds(412, 65, 466, 324);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_3_1 = new JLabel("Information r\u00E9lative au paiement et au remboursement");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3_1.setForeground(Color.GRAY);
		lblNewLabel_3_1.setFont(new Font("Arial", Font.BOLD, 17));
		lblNewLabel_3_1.setBounds(10, 0, 490, 27);
		panel.add(lblNewLabel_3_1);
		
		textField = new JTextField();
		textField.setBounds(10, 112, 427, 27);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNumerDeCarteInscription = new JLabel("Numer de carte bancaire");
		lblNumerDeCarteInscription.setHorizontalAlignment(SwingConstants.LEFT);
		lblNumerDeCarteInscription.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 20));
		lblNumerDeCarteInscription.setBounds(10, 69, 427, 27);
		panel.add(lblNumerDeCarteInscription);
		
		JLabel lblPeriodeDeValidit = new JLabel("Periode de validit\u00E9");
		lblPeriodeDeValidit.setHorizontalAlignment(SwingConstants.LEFT);
		lblPeriodeDeValidit.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 20));
		lblPeriodeDeValidit.setBounds(10, 149, 427, 27);
		panel.add(lblPeriodeDeValidit);
		
		JLabel lblNewLabel_4 = new JLabel("/");
		lblNewLabel_4.setFont(new Font("Wide Latin", Font.BOLD, 18));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(120, 186, 19, 34);
		panel.add(lblNewLabel_4);
		
		JLabel lblTitulaireDeCarte = new JLabel("Titulaire de carte bancaire");
		lblTitulaireDeCarte.setHorizontalAlignment(SwingConstants.LEFT);
		lblTitulaireDeCarte.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 20));
		lblTitulaireDeCarte.setBounds(10, 223, 427, 27);
		panel.add(lblTitulaireDeCarte);
		
		textFieldTitulaireCartebancaire = new JTextField();
		textFieldTitulaireCartebancaire.setToolTipText("");
		textFieldTitulaireCartebancaire.setColumns(10);
		textFieldTitulaireCartebancaire.setBounds(10, 260, 427, 27);
		panel.add(textFieldTitulaireCartebancaire);
		
		JComboBox<String> comboBoxMoisInscrition = new JComboBox<String>();
		comboBoxMoisInscrition.setBounds(20, 186, 73, 32);
		panel.add(comboBoxMoisInscrition);
		comboBoxMoisInscrition.setToolTipText("mois");
		comboBoxMoisInscrition.setBackground(Color.WHITE);
		
		JComboBox<String> comboBoxanneeInscrition = new JComboBox<String>();
		comboBoxanneeInscrition.setBounds(159, 188, 73, 32);
		panel.add(comboBoxanneeInscrition);
		comboBoxanneeInscrition.setToolTipText("ann\u00E9e");
		comboBoxanneeInscrition.setToolTipText("mois");
		comboBoxanneeInscrition.setBackground(Color.WHITE);
		
		// add items to the combo box
			comboBoxanneeInscrition.addItem("2020");
			comboBoxanneeInscrition.addItem("2021");
			comboBoxanneeInscrition.addItem("2022");
			comboBoxanneeInscrition.addItem("2023");
			comboBoxanneeInscrition.addItem("2024");
			comboBoxanneeInscrition.addItem("2025");
			comboBoxanneeInscrition.addItem("2025");
			comboBoxanneeInscrition.addItem("2027");
			comboBoxanneeInscrition.addItem("2028");
			comboBoxanneeInscrition.addItem("2029");
			comboBoxanneeInscrition.addItem("2023");
		
		
		// add items to the combo box
				comboBoxMoisInscrition.addItem("01");
				comboBoxMoisInscrition.addItem("02");
				comboBoxMoisInscrition.addItem("03");
				comboBoxMoisInscrition.addItem("04");
				comboBoxMoisInscrition.addItem("05");
				comboBoxMoisInscrition.addItem("06");
				comboBoxMoisInscrition.addItem("07");
				comboBoxMoisInscrition.addItem("08");
				comboBoxMoisInscrition.addItem("09");
				comboBoxMoisInscrition.addItem("10");
				comboBoxMoisInscrition.addItem("11");
				comboBoxMoisInscrition.addItem("12");
		
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
		
		
	}
	
}
