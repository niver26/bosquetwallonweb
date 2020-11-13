package be.niver.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;


import javax.swing.JTextField;
import javax.swing.ImageIcon;

public class Plannification extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldTitreFichesigspec;
	private JTextField textFieldartisteFichesigspec;
	private JTextField textFielddateFichesigspec;
	private JTextField textFieldheureouvertureporteFichesigspec;
	private JTextField textFieldheuredebutFichesigspec;
	private JTextField textFieldheurefin;
	private JTextField textFieldDeboutplan;
	private JTextField textFieldorconcertplan;
	private JTextField textFieldargentconcertplan;
	private JTextField textFieldbronzeconcertplan;
	private JTextField textFielddiamantcirqueplan;
	private JTextField textFieldorcirqueplan;
	private JTextField textFieldargentcirqueplan;
	private JTextField textFieldbronzecirqueplan;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Plannification frame = new Plannification();
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
	public Plannification() {
		initComponents();
	}


	private void initComponents() {
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1009, 749);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDeboutPlannification = new JLabel("Debout");
		lblDeboutPlannification.setHorizontalAlignment(SwingConstants.LEFT);
		lblDeboutPlannification.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 20));
		lblDeboutPlannification.setBounds(355, 63, 112, 27);
		contentPane.add(lblDeboutPlannification);
		
		
		
		JLabel lblAssisVersionConcert = new JLabel("Assis version concert");
		lblAssisVersionConcert.setBackground(Color.GRAY);
		lblAssisVersionConcert.setForeground(Color.RED);
		lblAssisVersionConcert.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 20));
		lblAssisVersionConcert.setBounds(361, 112, 176, 27);
		contentPane.add(lblAssisVersionConcert);
		
		;
		
		JLabel lblArgentPlannification = new JLabel("Argent");
		lblArgentPlannification.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 20));
		lblArgentPlannification.setBounds(378, 172, 89, 28);
		contentPane.add(lblArgentPlannification);
		
		
		
		JButton btnValiderplanification = new JButton("Valider");
		btnValiderplanification.setForeground(Color.BLACK);
		btnValiderplanification.setBackground(SystemColor.textHighlight);
		btnValiderplanification.setBounds(564, 586, 98, 46);
		contentPane.add(btnValiderplanification);
		
		JButton btnexitPageInscription = new JButton("Quiter");
		btnexitPageInscription.setForeground(Color.BLACK);
		btnexitPageInscription.setBackground(new Color(220, 20, 60));
		btnexitPageInscription.setBounds(819, 586, 98, 46);
		contentPane.add(btnexitPageInscription);
		
		JLabel lblOrPlannification = new JLabel("Or");
		lblOrPlannification.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 20));
		lblOrPlannification.setBounds(378, 139, 92, 28);
		contentPane.add(lblOrPlannification);
		
		
		JLabel lblBronzePlanification = new JLabel("Bronze");
		lblBronzePlanification.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 20));
		lblBronzePlanification.setBounds(378, 204, 98, 28);
		contentPane.add(lblBronzePlanification);
		
		JLabel lblNewLabel = new JLabel("Planification du Spectacle Bosquet Wallon");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 33));
		lblNewLabel.setBounds(325, 20, 670, 33);
		contentPane.add(lblNewLabel);
		
		JLabel lblPrixPlannification = new JLabel("Prix");
		lblPrixPlannification.setBackground(Color.GRAY);
		lblPrixPlannification.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrixPlannification.setForeground(Color.RED);
		lblPrixPlannification.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 20));
		lblPrixPlannification.setBounds(511, 112, 101, 27);
		contentPane.add(lblPrixPlannification);
		
		JLabel lblAssisVersionConcert_1 = new JLabel("Assis version concert");
		lblAssisVersionConcert_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblAssisVersionConcert_1.setForeground(Color.RED);
		lblAssisVersionConcert_1.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 20));
		lblAssisVersionConcert_1.setBackground(Color.GRAY);
		lblAssisVersionConcert_1.setBounds(681, 73, 153, 27);
		contentPane.add(lblAssisVersionConcert_1);
		
		JLabel lblPrixPlannification_1 = new JLabel("Prix");
		lblPrixPlannification_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrixPlannification_1.setForeground(Color.RED);
		lblPrixPlannification_1.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 20));
		lblPrixPlannification_1.setBackground(Color.GRAY);
		lblPrixPlannification_1.setBounds(841, 73, 132, 27);
		contentPane.add(lblPrixPlannification_1);
		
		JLabel lblOrPlannification_1 = new JLabel("Or");
		lblOrPlannification_1.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 20));
		lblOrPlannification_1.setBounds(742, 135, 89, 28);
		contentPane.add(lblOrPlannification_1);
		
		JLabel lblArgentPlannification_1 = new JLabel("Argent");
		lblArgentPlannification_1.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 20));
		lblArgentPlannification_1.setBounds(742, 168, 86, 28);
		contentPane.add(lblArgentPlannification_1);
		
		JLabel lblBronzePlanification_1 = new JLabel("Bronze");
		lblBronzePlanification_1.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 20));
		lblBronzePlanification_1.setBounds(742, 200, 74, 28);
		contentPane.add(lblBronzePlanification_1);
		
		JLabel lblOrPlannification_1_1 = new JLabel("Diamant");
		lblOrPlannification_1_1.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 20));
		lblOrPlannification_1_1.setBounds(742, 99, 89, 28);
		contentPane.add(lblOrPlannification_1_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(640, 63, 3, 165);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.DARK_GRAY);
		panel_1.setBounds(345, 63, 628, 4);
		contentPane.add(panel_1);
		
		JLabel lblFicheSignaltiqueDu = new JLabel("fiche signal\u00E9tique du spectacle");
		lblFicheSignaltiqueDu.setHorizontalAlignment(SwingConstants.CENTER);
		lblFicheSignaltiqueDu.setForeground(Color.DARK_GRAY);
		lblFicheSignaltiqueDu.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 33));
		lblFicheSignaltiqueDu.setBounds(303, 257, 670, 33);
		contentPane.add(lblFicheSignaltiqueDu);
		
		
		JLabel Date = new JLabel("Date");
		Date.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 20));
		Date.setBounds(369, 411, 132, 28);
		contentPane.add(Date);
		
		JLabel lblOrPlannification_1_2 = new JLabel("ouverture des portes");
		lblOrPlannification_1_2.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 20));
		lblOrPlannification_1_2.setBounds(361, 454, 140, 28);
		contentPane.add(lblOrPlannification_1_2);
		
		
		JLabel Heuredebut = new JLabel("Heure d\u00E9but");
		Heuredebut.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 20));
		Heuredebut.setBounds(361, 492, 129, 28);
		contentPane.add(Heuredebut);
		
		
		JLabel lblHeurefin = new JLabel("Heure fin");
		lblHeurefin.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 20));
		lblHeurefin.setBounds(361, 530, 138, 28);
		contentPane.add(lblHeurefin);
		
		JLabel lblTitrefichsigspec = new JLabel("Titre");
		lblTitrefichsigspec.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 20));
		lblTitrefichsigspec.setBounds(369, 337, 132, 28);
		contentPane.add(lblTitrefichsigspec);
		
		
		
		JLabel lblArtiste = new JLabel("Artiste");
		lblArtiste.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 20));
		lblArtiste.setBounds(369, 373, 132, 28);
		contentPane.add(lblArtiste);
		
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Plannification.class.getResource("/images/show.jpg")));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		lblNewLabel_1.setBounds(0, 0, 328, 632);
		contentPane.add(lblNewLabel_1);
		
		textFieldTitreFichesigspec = new JTextField();
		textFieldTitreFichesigspec.setFont(new Font("Vivaldi", Font.BOLD, 20));
		textFieldTitreFichesigspec.setBounds(511, 337, 406, 28);
		contentPane.add(textFieldTitreFichesigspec);
		textFieldTitreFichesigspec.setColumns(10);
		
		textFieldartisteFichesigspec = new JTextField();
		textFieldartisteFichesigspec.setFont(new Font("Vivaldi", Font.BOLD, 20));
		textFieldartisteFichesigspec.setColumns(10);
		textFieldartisteFichesigspec.setBounds(511, 380, 406, 28);
		contentPane.add(textFieldartisteFichesigspec);
		
		textFielddateFichesigspec = new JTextField();
		textFielddateFichesigspec.setFont(new Font("Vivaldi", Font.BOLD, 20));
		textFielddateFichesigspec.setColumns(10);
		textFielddateFichesigspec.setBounds(511, 418, 406, 28);
		contentPane.add(textFielddateFichesigspec);
		
		textFieldheureouvertureporteFichesigspec = new JTextField();
		textFieldheureouvertureporteFichesigspec.setFont(new Font("Vivaldi", Font.BOLD, 20));
		textFieldheureouvertureporteFichesigspec.setColumns(10);
		textFieldheureouvertureporteFichesigspec.setBounds(511, 454, 406, 28);
		contentPane.add(textFieldheureouvertureporteFichesigspec);
		
		textFieldheuredebutFichesigspec = new JTextField();
		textFieldheuredebutFichesigspec.setFont(new Font("Vivaldi", Font.BOLD, 20));
		textFieldheuredebutFichesigspec.setColumns(10);
		textFieldheuredebutFichesigspec.setBounds(511, 492, 406, 28);
		contentPane.add(textFieldheuredebutFichesigspec);
		
		textFieldheurefin = new JTextField();
		textFieldheurefin.setFont(new Font("Vivaldi", Font.BOLD, 20));
		textFieldheurefin.setColumns(10);
		textFieldheurefin.setBounds(511, 530, 406, 28);
		contentPane.add(textFieldheurefin);
		
		textFieldDeboutplan = new JTextField();
		textFieldDeboutplan.setFont(new Font("Vivaldi", Font.BOLD, 20));
		textFieldDeboutplan.setColumns(10);
		textFieldDeboutplan.setBounds(480, 69, 150, 21);
		contentPane.add(textFieldDeboutplan);
		
		textFieldorconcertplan = new JTextField();
		textFieldorconcertplan.setFont(new Font("Vivaldi", Font.BOLD, 20));
		textFieldorconcertplan.setColumns(10);
		textFieldorconcertplan.setBounds(480, 146, 150, 21);
		contentPane.add(textFieldorconcertplan);
		
		textFieldargentconcertplan = new JTextField();
		textFieldargentconcertplan.setFont(new Font("Vivaldi", Font.BOLD, 20));
		textFieldargentconcertplan.setColumns(10);
		textFieldargentconcertplan.setBounds(480, 179, 150, 21);
		contentPane.add(textFieldargentconcertplan);
		
		textFieldbronzeconcertplan = new JTextField();
		textFieldbronzeconcertplan.setFont(new Font("Vivaldi", Font.BOLD, 20));
		textFieldbronzeconcertplan.setColumns(10);
		textFieldbronzeconcertplan.setBounds(480, 211, 150, 21);
		contentPane.add(textFieldbronzeconcertplan);
		
		textFielddiamantcirqueplan = new JTextField();
		textFielddiamantcirqueplan.setFont(new Font("Vivaldi", Font.BOLD, 20));
		textFielddiamantcirqueplan.setColumns(10);
		textFielddiamantcirqueplan.setBounds(823, 104, 150, 21);
		contentPane.add(textFielddiamantcirqueplan);
		
		textFieldorcirqueplan = new JTextField();
		textFieldorcirqueplan.setFont(new Font("Vivaldi", Font.BOLD, 20));
		textFieldorcirqueplan.setColumns(10);
		textFieldorcirqueplan.setBounds(823, 146, 150, 21);
		contentPane.add(textFieldorcirqueplan);
		
		textFieldargentcirqueplan = new JTextField();
		textFieldargentcirqueplan.setFont(new Font("Vivaldi", Font.BOLD, 20));
		textFieldargentcirqueplan.setColumns(10);
		textFieldargentcirqueplan.setBounds(823, 179, 150, 21);
		contentPane.add(textFieldargentcirqueplan);
		
		textFieldbronzecirqueplan = new JTextField();
		textFieldbronzecirqueplan.setFont(new Font("Vivaldi", Font.BOLD, 20));
		textFieldbronzecirqueplan.setColumns(10);
		textFieldbronzecirqueplan.setBounds(823, 211, 150, 21);
		contentPane.add(textFieldbronzecirqueplan);
	}
}
