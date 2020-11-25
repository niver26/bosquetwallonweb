package be.niver.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.SwingConstants;
import java.awt.Choice;
import javax.swing.JComboBox;

public class Payment extends JFrame {

	private JPanel contentPane;
	private JTextField NomPrenomTitulaireCarte;
	private JTextField textFieldCarteNumber;
	private JTextField textFieldCodedesecuritecarte;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Payment frame = new Payment();
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
	public Payment() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 866, 641);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("Mode de paiement");
		lblNewLabel_1_1_2_1.setForeground(Color.RED);
		lblNewLabel_1_1_2_1.setFont(new Font("Vivaldi", Font.BOLD, 20));
		lblNewLabel_1_1_2_1.setBackground(Color.WHITE);
		lblNewLabel_1_1_2_1.setBounds(6, 10, 234, 25);
		contentPane.add(lblNewLabel_1_1_2_1);
		
		JRadioButton rdbtnVisa = new JRadioButton("Visa");
		rdbtnVisa.setFont(new Font("Vivaldi", Font.BOLD, 20));
		rdbtnVisa.setBackground(Color.WHITE);
		rdbtnVisa.setBounds(6, 52, 643, 21);
		contentPane.add(rdbtnVisa);
		
		JRadioButton rdbtnPaypal = new JRadioButton("PayPal");
		rdbtnPaypal.setFont(new Font("Vivaldi", Font.BOLD, 20));
		rdbtnPaypal.setBackground(Color.WHITE);
		rdbtnPaypal.setBounds(6, 81, 643, 21);
		contentPane.add(rdbtnPaypal);
		
		JRadioButton rdbtnVirementSepa = new JRadioButton("Virement SEPA \u00E0 effectuer dans les 7 jours calendrier");
		rdbtnVirementSepa.setFont(new Font("Vivaldi", Font.BOLD, 20));
		rdbtnVirementSepa.setBackground(Color.WHITE);
		rdbtnVirementSepa.setBounds(6, 113, 662, 21);
		contentPane.add(rdbtnVirementSepa);
		
		JButton btnFinaliser = new JButton("Finaliser");
		btnFinaliser.setForeground(Color.BLACK);
		btnFinaliser.setBackground(SystemColor.textHighlight);
		btnFinaliser.setBounds(258, 505, 98, 46);
		contentPane.add(btnFinaliser);
		
		JLabel lblNewLabel_1_1_2_1_1 = new JLabel("Nom et prenom du titulaire de la carte");
		lblNewLabel_1_1_2_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_2_1_1.setFont(new Font("Vivaldi", Font.BOLD, 20));
		lblNewLabel_1_1_2_1_1.setBackground(Color.WHITE);
		lblNewLabel_1_1_2_1_1.setBounds(6, 176, 413, 25);
		contentPane.add(lblNewLabel_1_1_2_1_1);
		
		NomPrenomTitulaireCarte = new JTextField();
		NomPrenomTitulaireCarte.setFont(new Font("Vivaldi", Font.PLAIN, 20));
		NomPrenomTitulaireCarte.setBounds(6, 211, 413, 37);
		contentPane.add(NomPrenomTitulaireCarte);
		NomPrenomTitulaireCarte.setColumns(10);
		
		JLabel lblNewLabel_1_1_2_1_1_1 = new JLabel("Numero de la carte");
		lblNewLabel_1_1_2_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_2_1_1_1.setFont(new Font("Vivaldi", Font.BOLD, 20));
		lblNewLabel_1_1_2_1_1_1.setBackground(Color.WHITE);
		lblNewLabel_1_1_2_1_1_1.setBounds(6, 258, 413, 25);
		contentPane.add(lblNewLabel_1_1_2_1_1_1);
		
		textFieldCarteNumber = new JTextField();
		textFieldCarteNumber.setFont(new Font("Vivaldi", Font.PLAIN, 20));
		textFieldCarteNumber.setColumns(10);
		textFieldCarteNumber.setBounds(6, 293, 413, 37);
		contentPane.add(textFieldCarteNumber);
		
		JLabel lblNewLabel_1_1_2_1_1_1_1 = new JLabel("Expiration");
		lblNewLabel_1_1_2_1_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_2_1_1_1_1.setFont(new Font("Vivaldi", Font.BOLD, 20));
		lblNewLabel_1_1_2_1_1_1_1.setBackground(Color.WHITE);
		lblNewLabel_1_1_2_1_1_1_1.setBounds(6, 340, 413, 25);
		contentPane.add(lblNewLabel_1_1_2_1_1_1_1);
		
		JLabel lblNewLabel = new JLabel("/");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(97, 375, 25, 37);
		contentPane.add(lblNewLabel);
		
		textFieldCodedesecuritecarte = new JTextField();
		textFieldCodedesecuritecarte.setFont(new Font("Vivaldi", Font.PLAIN, 20));
		textFieldCodedesecuritecarte.setColumns(10);
		textFieldCodedesecuritecarte.setBounds(6, 457, 70, 37);
		contentPane.add(textFieldCodedesecuritecarte);
		
		JLabel lblNewLabel_1_1_2_1_1_1_2 = new JLabel("Code de s\u00E9curit\u00E9 \u00E0 3 chiffres");
		lblNewLabel_1_1_2_1_1_1_2.setForeground(Color.BLACK);
		lblNewLabel_1_1_2_1_1_1_2.setFont(new Font("Vivaldi", Font.BOLD, 20));
		lblNewLabel_1_1_2_1_1_1_2.setBackground(Color.WHITE);
		lblNewLabel_1_1_2_1_1_1_2.setBounds(6, 422, 413, 25);
		contentPane.add(lblNewLabel_1_1_2_1_1_1_2);
		
		JComboBox<String> comboBoxMoi = new JComboBox<String>();
		comboBoxMoi.setToolTipText("");
		comboBoxMoi.setFont(new Font("Vivaldi", Font.PLAIN, 20));
		comboBoxMoi.setBackground(Color.WHITE);
		comboBoxMoi.setBounds(6, 375, 81, 37);
		contentPane.add(comboBoxMoi);
		
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
		comboBoxAnnee.setBounds(132, 375, 88, 37);
		contentPane.add(comboBoxAnnee);
		
		// add items to the combo box
					comboBoxAnnee.addItem("2020");
					comboBoxAnnee.addItem("2021");
					comboBoxAnnee.addItem("2022");
					comboBoxAnnee.addItem("2023");
					comboBoxAnnee.addItem("2024");
					comboBoxAnnee.addItem("2025");
					comboBoxAnnee.addItem("2025");
					comboBoxAnnee.addItem("2027");
					comboBoxAnnee.addItem("2028");
					comboBoxAnnee.addItem("2029");
					comboBoxAnnee.addItem("2023");
				
		
	}
}
