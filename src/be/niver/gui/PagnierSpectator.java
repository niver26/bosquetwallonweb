package be.niver.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class PagnierSpectator extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PagnierSpectator frame = new PagnierSpectator();
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
	public PagnierSpectator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1021, 661);
		contentPane = new JPanel();
		contentPane.setForeground(Color.LIGHT_GRAY);
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnPayerspectator = new JButton("Payer");
		btnPayerspectator.setForeground(Color.BLACK);
		btnPayerspectator.setBackground(SystemColor.textHighlight);
		btnPayerspectator.setBounds(510, 568, 98, 46);
		contentPane.add(btnPayerspectator);
		
		JRadioButton rdbtnSeFaireLivrerEnvoi10edeplus = new JRadioButton("Se faire livrer les places par envoi s\u00E9curis\u00E9, dans ce cas un suppl\u00E9ment de 10 euro sera factur\u00E9");
		rdbtnSeFaireLivrerEnvoi10edeplus.setBackground(Color.WHITE);
		rdbtnSeFaireLivrerEnvoi10edeplus.setFont(new Font("Vivaldi", Font.BOLD, 20));
		rdbtnSeFaireLivrerEnvoi10edeplus.setBounds(10, 508, 662, 21);
		contentPane.add(rdbtnSeFaireLivrerEnvoi10edeplus);
		
		JRadioButton rdbtnSeFaireLivrerTimbre = new JRadioButton("Se faire livrer les places par envoi avec timbres prior");
		rdbtnSeFaireLivrerTimbre.setBackground(Color.WHITE);
		rdbtnSeFaireLivrerTimbre.setFont(new Font("Vivaldi", Font.BOLD, 20));
		rdbtnSeFaireLivrerTimbre.setBounds(10, 476, 643, 21);
		contentPane.add(rdbtnSeFaireLivrerTimbre);
		
		JRadioButton rdbtnSurPlace = new JRadioButton("Reprendre les places sur place le jour du spectacle");
		rdbtnSurPlace.setBackground(Color.WHITE);
		rdbtnSurPlace.setFont(new Font("Vivaldi", Font.BOLD, 20));
		rdbtnSurPlace.setBounds(10, 447, 643, 21);
		contentPane.add(rdbtnSurPlace);
		
		ButtonGroup groupModelivaraison = new ButtonGroup();
		groupModelivaraison.add(rdbtnSurPlace);
		groupModelivaraison.add(rdbtnSeFaireLivrerTimbre);
		groupModelivaraison.add(rdbtnSeFaireLivrerEnvoi10edeplus);
		
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("Mode de livraison");
		lblNewLabel_1_1_2_1.setForeground(Color.RED);
		lblNewLabel_1_1_2_1.setFont(new Font("Vivaldi", Font.BOLD, 20));
		lblNewLabel_1_1_2_1.setBackground(Color.WHITE);
		lblNewLabel_1_1_2_1.setBounds(10, 405, 234, 25);
		contentPane.add(lblNewLabel_1_1_2_1);
		
		JLabel lblVotrePagnier = new JLabel("Votre pagnier");
		lblVotrePagnier.setHorizontalAlignment(SwingConstants.CENTER);
		lblVotrePagnier.setForeground(Color.BLUE);
		lblVotrePagnier.setFont(new Font("Vivaldi", Font.BOLD, 30));
		lblVotrePagnier.setBounds(65, 10, 869, 36);
		contentPane.add(lblVotrePagnier);
		
		JTextPane textPanePanier = new JTextPane();
		textPanePanier.setBackground(UIManager.getColor("CheckBox.background"));
		textPanePanier.setBounds(10, 56, 598, 339);
		contentPane.add(textPanePanier);
		
		JLabel lblNewLabel_1_1_2_1_1 = new JLabel("Montant \u00E0 payer");
		lblNewLabel_1_1_2_1_1.setForeground(Color.RED);
		lblNewLabel_1_1_2_1_1.setFont(new Font("Vivaldi", Font.BOLD, 20));
		lblNewLabel_1_1_2_1_1.setBackground(Color.WHITE);
		lblNewLabel_1_1_2_1_1.setBounds(700, 56, 148, 25);
		contentPane.add(lblNewLabel_1_1_2_1_1);
		
		textField = new JTextField();
		textField.setForeground(Color.RED);
		textField.setFont(new Font("Vivaldi", Font.BOLD, 20));
		textField.setEditable(false);
		textField.setBounds(700, 113, 148, 36);
		contentPane.add(textField);
		textField.setColumns(10);
	}
}
