package be.niver.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class UpdateUser extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordFieldUpdateuser;
	private JTextField textFieldEmailUpdateuser;
	private JTextField textFieldAdresseUpdateuser;
	private JTextField textFieldPrenomUpdateuser;
	private JTextField textFieldNomUpdateuser;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateUser frame = new UpdateUser();
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
	public UpdateUser() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 756, 560);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblModificationDuCompte = new JLabel("Modification du compte");
		lblModificationDuCompte.setBounds(137, 10, 468, 33);
		lblModificationDuCompte.setHorizontalAlignment(SwingConstants.CENTER);
		lblModificationDuCompte.setForeground(Color.BLUE);
		lblModificationDuCompte.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 33));
		contentPane.add(lblModificationDuCompte);
		
		JLabel lblNomInscription = new JLabel("Nom");
		lblNomInscription.setBounds(6, 212, 90, 27);
		lblNomInscription.setHorizontalAlignment(SwingConstants.LEFT);
		lblNomInscription.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 20));
		contentPane.add(lblNomInscription);
		
		JLabel lblPrenom = new JLabel("Prenom");
		lblPrenom.setBounds(6, 248, 90, 27);
		lblPrenom.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 20));
		contentPane.add(lblPrenom);
		
		JLabel lblNewLabel_1 = new JLabel("Adresse");
		lblNewLabel_1.setBounds(6, 285, 90, 28);
		lblNewLabel_1.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 20));
		contentPane.add(lblNewLabel_1);
		
		JButton btnModifierUpdateuser = new JButton("modifier");
		btnModifierUpdateuser.setBounds(153, 459, 98, 46);
		btnModifierUpdateuser.setForeground(Color.BLACK);
		btnModifierUpdateuser.setBackground(SystemColor.textHighlight);
		contentPane.add(btnModifierUpdateuser);
		
		JButton btnFermerUpdateuser = new JButton("Fermer");
		btnFermerUpdateuser.setBounds(639, 459, 98, 46);
		btnFermerUpdateuser.setForeground(Color.BLACK);
		btnFermerUpdateuser.setBackground(new Color(220, 20, 60));
		contentPane.add(btnFermerUpdateuser);
		
		JLabel lblNewLabel_1_1 = new JLabel("E-Mail");
		lblNewLabel_1_1.setBounds(6, 323, 90, 28);
		lblNewLabel_1_1.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 20));
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Code");
		lblNewLabel_1_2.setBounds(6, 361, 90, 28);
		lblNewLabel_1_2.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 20));
		contentPane.add(lblNewLabel_1_2);
		
		passwordFieldUpdateuser = new JPasswordField();
		passwordFieldUpdateuser.setBounds(106, 361, 228, 28);
		contentPane.add(passwordFieldUpdateuser);
		
		textFieldEmailUpdateuser = new JTextField();
		textFieldEmailUpdateuser.setBounds(106, 323, 228, 28);
		textFieldEmailUpdateuser.setFont(new Font("Vivaldi", Font.BOLD, 20));
		textFieldEmailUpdateuser.setColumns(10);
		contentPane.add(textFieldEmailUpdateuser);
		
		textFieldAdresseUpdateuser = new JTextField();
		textFieldAdresseUpdateuser.setBounds(106, 288, 228, 28);
		textFieldAdresseUpdateuser.setFont(new Font("Vivaldi", Font.BOLD, 20));
		textFieldAdresseUpdateuser.setColumns(10);
		contentPane.add(textFieldAdresseUpdateuser);
		
		textFieldPrenomUpdateuser = new JTextField();
		textFieldPrenomUpdateuser.setBounds(106, 254, 228, 28);
		textFieldPrenomUpdateuser.setFont(new Font("Vivaldi", Font.BOLD, 20));
		textFieldPrenomUpdateuser.setColumns(10);
		contentPane.add(textFieldPrenomUpdateuser);
		
		textFieldNomUpdateuser = new JTextField();
		textFieldNomUpdateuser.setBounds(106, 218, 228, 28);
		textFieldNomUpdateuser.setFont(new Font("Vivaldi", Font.BOLD, 20));
		textFieldNomUpdateuser.setColumns(10);
		contentPane.add(textFieldNomUpdateuser);
	}
}
