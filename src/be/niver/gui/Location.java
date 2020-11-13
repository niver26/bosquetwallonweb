package be.niver.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;

public class Location extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldloyerlocation;
	private JTextField textFieldaccomtelocation;
	private JTextField textFieldgarantilocation;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Location frame = new Location();
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
	public Location() {
		initComponents();
		
	}

	
	
	private void initComponents() 
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1115, 657);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLocationtitre = new JLabel("Formulaire De Location");
		lblLocationtitre.setHorizontalAlignment(SwingConstants.CENTER);
		lblLocationtitre.setForeground(Color.BLUE);
		lblLocationtitre.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 40));
		lblLocationtitre.setBounds(517, 10, 420, 46);
		contentPane.add(lblLocationtitre);
		
		JLabel lblJour = new JLabel("Jour");
		lblJour.setHorizontalAlignment(SwingConstants.LEFT);
		lblJour.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 25));
		lblJour.setBounds(517, 85, 90, 27);
		contentPane.add(lblJour);
		
		JLabel lblPrenom = new JLabel("Accompte");
		lblPrenom.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 25));
		lblPrenom.setBounds(517, 155, 90, 27);
		contentPane.add(lblPrenom);
		
		
		
		JButton btnValiderPageLocation = new JButton("Valider");
		btnValiderPageLocation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnValiderPageLocation.setForeground(Color.BLACK);
		btnValiderPageLocation.setBackground(SystemColor.textHighlight);
		btnValiderPageLocation.setBounds(517, 564, 98, 46);
		contentPane.add(btnValiderPageLocation);
		
		JButton btnexitPageLocation = new JButton("Quiter");
		btnexitPageLocation.setForeground(Color.BLACK);
		btnexitPageLocation.setBackground(new Color(220, 20, 60));
		btnexitPageLocation.setBounds(839, 564, 98, 46);
		contentPane.add(btnexitPageLocation);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel.setIcon(new ImageIcon(Location.class.getResource("/images/imgAcceuil.jpg")));
		lblNewLabel.setBounds(0, 0, 454, 620);
		contentPane.add(lblNewLabel);
		
		
		
		JLabel lblGarrantie = new JLabel("Garrantie");
		lblGarrantie.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 25));
		lblGarrantie.setBounds(509, 192, 98, 27);
		contentPane.add(lblGarrantie);
		
		
		
		JLabel lblPrenom_1 = new JLabel("Loyer");
		lblPrenom_1.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 25));
		lblPrenom_1.setBounds(517, 122, 90, 27);
		contentPane.add(lblPrenom_1);
		
		JLabel lblserviceoptionelLocation = new JLabel("Services Optionnels");
		lblserviceoptionelLocation.setBackground(Color.PINK);
		lblserviceoptionelLocation.setHorizontalAlignment(SwingConstants.CENTER);
		lblserviceoptionelLocation.setForeground(Color.RED);
		lblserviceoptionelLocation.setFont(new Font("Vivaldi", Font.BOLD, 22));
		lblserviceoptionelLocation.setBounds(517, 238, 288, 37);
		contentPane.add(lblserviceoptionelLocation);
		
		JCheckBox chckbxPersonelBarlocation = new JCheckBox("Personnel Bar");
		chckbxPersonelBarlocation.setBackground(Color.WHITE);
		chckbxPersonelBarlocation.setBounds(528, 290, 120, 21);
		contentPane.add(chckbxPersonelBarlocation);
		
		JCheckBox chckbxPersSecuritelocation = new JCheckBox("Personnel S\u00E9curit\u00E9");
		chckbxPersSecuritelocation.setBackground(Color.WHITE);
		chckbxPersSecuritelocation.setBounds(528, 323, 120, 21);
		contentPane.add(chckbxPersSecuritelocation);
		
		JCheckBox chckbxPersVestiaireLocation = new JCheckBox("Personnel vestiaires");
		chckbxPersVestiaireLocation.setBackground(Color.WHITE);
		chckbxPersVestiaireLocation.setBounds(528, 354, 120, 21);
		contentPane.add(chckbxPersVestiaireLocation);
		
		JCheckBox chckbxNettoyageSalleLocation = new JCheckBox("Nettoyage salle");
		chckbxNettoyageSalleLocation.setBackground(Color.WHITE);
		chckbxNettoyageSalleLocation.setBounds(528, 389, 120, 21);
		contentPane.add(chckbxNettoyageSalleLocation);
		
		JCheckBox chckbxAssuranceLocation = new JCheckBox("Assurances tout risque");
		chckbxAssuranceLocation.setBackground(Color.WHITE);
		chckbxAssuranceLocation.setBounds(675, 290, 138, 21);
		contentPane.add(chckbxAssuranceLocation);
		
		JCheckBox chckbxSonLocation = new JCheckBox("ing\u00E9nieur du son");
		chckbxSonLocation.setBackground(Color.WHITE);
		chckbxSonLocation.setBounds(675, 323, 138, 21);
		contentPane.add(chckbxSonLocation);
		
		JCheckBox chckbxLumiereLocation = new JCheckBox("ing\u00E9nieur lumi\u00E8re");
		chckbxLumiereLocation.setBackground(Color.WHITE);
		chckbxLumiereLocation.setBounds(675, 354, 138, 21);
		contentPane.add(chckbxLumiereLocation);
		
		JCheckBox chckbxPresseLocation = new JCheckBox("Service de presse");
		chckbxPresseLocation.setBackground(Color.WHITE);
		chckbxPresseLocation.setBounds(675, 389, 138, 21);
		contentPane.add(chckbxPresseLocation);
		
		// create an empty combo box with items of type String
		JComboBox<String> comboBoxJourLocation = new JComboBox<String>();
		comboBoxJourLocation.setBackground(Color.WHITE);
		 
		// add items to the combo box
		comboBoxJourLocation.addItem("Lundi");
		comboBoxJourLocation.addItem("Mardi");
		comboBoxJourLocation.addItem("Mercredi");
		comboBoxJourLocation.addItem("Jeudi");
		comboBoxJourLocation.addItem("Vendredi");
		comboBoxJourLocation.addItem("Samedi");
		comboBoxJourLocation.addItem("Dimanche");
		comboBoxJourLocation.setFont(new Font("Vivaldi", Font.BOLD, 25));
		comboBoxJourLocation.setBounds(617, 85, 465, 28);
		contentPane.add(comboBoxJourLocation);
		
		JCheckBox chckbxAfficheLocation = new JCheckBox("colleur d\u2019affiche");
		chckbxAfficheLocation.setBackground(Color.WHITE);
		chckbxAfficheLocation.setBounds(528, 424, 120, 21);
		contentPane.add(chckbxAfficheLocation);
		
		JCheckBox chckbxOptionAllInLocation = new JCheckBox("option all in");
		chckbxOptionAllInLocation.setBackground(Color.WHITE);
		chckbxOptionAllInLocation.setBounds(938, 354, 138, 21);
		contentPane.add(chckbxOptionAllInLocation);
		
		JCheckBox chckbxHotessesLocation = new JCheckBox("hotesses");
		chckbxHotessesLocation.setBackground(Color.WHITE);
		chckbxHotessesLocation.setBounds(938, 323, 138, 21);
		contentPane.add(chckbxHotessesLocation);
		
		JCheckBox chckbxBackstageLocation = new JCheckBox("Backstage");
		chckbxBackstageLocation.setBackground(Color.WHITE);
		chckbxBackstageLocation.setBounds(938, 290, 138, 21);
		contentPane.add(chckbxBackstageLocation);
		
		JCheckBox chckbxTraiteurLocation = new JCheckBox("option traiteur");
		chckbxTraiteurLocation.setBackground(Color.WHITE);
		chckbxTraiteurLocation.setBounds(938, 389, 138, 21);
		contentPane.add(chckbxTraiteurLocation);
		
		JCheckBox chckbxChampagneLocation = new JCheckBox("champagne");
		chckbxChampagneLocation.setBackground(Color.WHITE);
		chckbxChampagneLocation.setBounds(938, 422, 138, 21);
		contentPane.add(chckbxChampagneLocation);
		
		JLabel lblServicesVip_1 = new JLabel("Services vip");
		lblServicesVip_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblServicesVip_1.setForeground(Color.RED);
		lblServicesVip_1.setFont(new Font("Vivaldi", Font.BOLD, 22));
		lblServicesVip_1.setBackground(Color.PINK);
		lblServicesVip_1.setBounds(882, 238, 200, 37);
		contentPane.add(lblServicesVip_1);
		
		textFieldloyerlocation = new JTextField();
		textFieldloyerlocation.setFont(new Font("Vivaldi", Font.BOLD, 20));
		textFieldloyerlocation.setBounds(617, 122, 465, 27);
		contentPane.add(textFieldloyerlocation);
		textFieldloyerlocation.setColumns(10);
		
		textFieldaccomtelocation = new JTextField();
		textFieldaccomtelocation.setFont(new Font("Vivaldi", Font.BOLD, 20));
		textFieldaccomtelocation.setColumns(10);
		textFieldaccomtelocation.setBounds(617, 155, 465, 27);
		contentPane.add(textFieldaccomtelocation);
		
		textFieldgarantilocation = new JTextField();
		textFieldgarantilocation.setFont(new Font("Vivaldi", Font.BOLD, 20));
		textFieldgarantilocation.setColumns(10);
		textFieldgarantilocation.setBounds(617, 192, 465, 27);
		contentPane.add(textFieldgarantilocation);
		
		

		
	}
	

	
	
	/**
	 * this method createEvents() for creating events
	 * 
	 */
	private void createEvents() 
	{
		
		
		
	}
}
