package be.niver.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import be.niver.bosquetwallonweb.Person;

import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import java.awt.TextField;
import com.jgoodies.forms.factories.DefaultComponentFactory;

public class SpaceSpectator extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SpaceSpectator frame = new SpaceSpectator();
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
	public SpaceSpectator() {
		initComponnent();
		
	}

	private void initComponnent() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 867, 799);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Espace client Bosquet Wallon");
		lblNewLabel.setBounds(0, 0, 869, 36);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Vivaldi", Font.BOLD, 30));
		contentPane.add(lblNewLabel);
		
		JButton btnAjouterpagnierSpectator = new JButton("Ajouter au pagnier");
		btnAjouterpagnierSpectator.setBounds(219, 681, 155, 46);
		btnAjouterpagnierSpectator.setForeground(Color.BLACK);
		btnAjouterpagnierSpectator.setBackground(SystemColor.textHighlight);
		contentPane.add(btnAjouterpagnierSpectator);
		
		JRadioButton rdbtnconcertSpectator = new JRadioButton("Concert   \u00E0  10h00  - 13h00");
		rdbtnconcertSpectator.setBackground(Color.WHITE);
		rdbtnconcertSpectator.setFont(new Font("Vivaldi", Font.BOLD, 20));
		rdbtnconcertSpectator.setBounds(30, 149, 250, 33);
		contentPane.add(rdbtnconcertSpectator);
		
		JRadioButton rdbtnArtspectator = new JRadioButton("Art  \u00E0  10h00  - 13h00");
		rdbtnArtspectator.setFont(new Font("Vivaldi", Font.BOLD, 20));
		rdbtnArtspectator.setBackground(Color.WHITE);
		rdbtnArtspectator.setBounds(40, 314, 250, 33);
		contentPane.add(rdbtnArtspectator);
		
		JRadioButton rdbtnTheatreSpectator = new JRadioButton("Th\u00E9atre  \u00E0  13h30  - 17h30");
		rdbtnTheatreSpectator.setFont(new Font("Vivaldi", Font.BOLD, 20));
		rdbtnTheatreSpectator.setBackground(Color.WHITE);
		rdbtnTheatreSpectator.setBounds(40, 369, 250, 33);
		contentPane.add(rdbtnTheatreSpectator);
		
		JRadioButton rdbtnDanseSpectator = new JRadioButton("Danse  \u00E0 13h30  - 17h30");
		rdbtnDanseSpectator.setFont(new Font("Vivaldi", Font.BOLD, 20));
		rdbtnDanseSpectator.setBackground(Color.WHITE);
		rdbtnDanseSpectator.setBounds(30, 203, 250, 28);
		contentPane.add(rdbtnDanseSpectator);
		
		ButtonGroup groupShow = new ButtonGroup();
		groupShow.add(rdbtnconcertSpectator);
		groupShow.add(rdbtnArtspectator);
		groupShow.add(rdbtnTheatreSpectator);
		groupShow.add(rdbtnDanseSpectator);
		

		
		JLabel lblNewLabel_1 = new JLabel("Liste des spactacles");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Vivaldi", Font.BOLD, 20));
		lblNewLabel_1.setBounds(10, 69, 171, 25);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Date de representation : 01/01/2021");
		lblNewLabel_2.setForeground(Color.BLUE);
		lblNewLabel_2.setFont(new Font("Vivaldi", Font.BOLD, 20));
		lblNewLabel_2.setBounds(30, 102, 285, 26);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Date de representation : 03/01/2021");
		lblNewLabel_2_1.setForeground(Color.BLUE);
		lblNewLabel_2_1.setFont(new Font("Vivaldi", Font.BOLD, 20));
		lblNewLabel_2_1.setBounds(30, 259, 285, 26);
		contentPane.add(lblNewLabel_2_1);
		
		JPanel panel = new JPanel();
		panel.setBounds(345, 42, 10, 436);
		contentPane.add(panel);
		
		JLabel lblNewLabel_1_1 = new JLabel("places disponible pour ce spectacle");
		lblNewLabel_1_1.setForeground(Color.RED);
		lblNewLabel_1_1.setFont(new Font("Vivaldi", Font.BOLD, 20));
		lblNewLabel_1_1.setBackground(Color.WHITE);
		lblNewLabel_1_1.setBounds(374, 69, 234, 25);
		contentPane.add(lblNewLabel_1_1);
		
		JRadioButton rdbtnPlaceDebout = new JRadioButton("Debout");
		rdbtnPlaceDebout.setEnabled(false);
		rdbtnPlaceDebout.setFont(new Font("Vivaldi", Font.BOLD, 20));
		rdbtnPlaceDebout.setBounds(362, 157, 103, 21);
		contentPane.add(rdbtnPlaceDebout);
		
		JLabel lblNewLabel_3 = new JLabel("places");
		lblNewLabel_3.setFont(new Font("Vivaldi", Font.BOLD, 20));
		lblNewLabel_3.setBounds(365, 111, 100, 28);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("encore disponibles");
		lblNewLabel_3_1.setForeground(new Color(0, 128, 0));
		lblNewLabel_3_1.setFont(new Font("Vivaldi", Font.BOLD, 20));
		lblNewLabel_3_1.setBounds(458, 111, 127, 28);
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("nombre ticket");
		lblNewLabel_3_2.setFont(new Font("Vivaldi", Font.BOLD, 20));
		lblNewLabel_3_2.setBounds(595, 111, 100, 28);
		contentPane.add(lblNewLabel_3_2);
		
		TextField textFieldPlaceDeboutEncoreDisponible = new TextField();
		textFieldPlaceDeboutEncoreDisponible.setForeground(new Color(0, 128, 0));
		textFieldPlaceDeboutEncoreDisponible.setFont(new Font("Vivaldi", Font.BOLD, 15));
		textFieldPlaceDeboutEncoreDisponible.setEditable(false);
		textFieldPlaceDeboutEncoreDisponible.setText("8000");
		textFieldPlaceDeboutEncoreDisponible.setBounds(508, 157, 58, 21);
		contentPane.add(textFieldPlaceDeboutEncoreDisponible);
		
		TextField textFieldDeboutNbreplacesDesirer = new TextField();
		textFieldDeboutNbreplacesDesirer.setForeground(new Color(0, 0, 0));
		textFieldDeboutNbreplacesDesirer.setFont(new Font("Vivaldi", Font.BOLD, 15));
		textFieldDeboutNbreplacesDesirer.setBounds(595, 157, 58, 21);
		contentPane.add(textFieldDeboutNbreplacesDesirer);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("assis version concert");
		lblNewLabel_1_1_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1_1_1.setFont(new Font("Vivaldi", Font.BOLD, 20));
		lblNewLabel_1_1_1.setBackground(Color.WHITE);
		lblNewLabel_1_1_1.setBounds(374, 203, 234, 21);
		contentPane.add(lblNewLabel_1_1_1);
		
		JRadioButton rdbtnOrAVC = new JRadioButton("Or");
		rdbtnOrAVC.setEnabled(false);
		rdbtnOrAVC.setFont(new Font("Vivaldi", Font.BOLD, 20));
		rdbtnOrAVC.setBounds(362, 230, 103, 21);
		contentPane.add(rdbtnOrAVC);
		
		TextField textFieldPlaceOrEncoreDisponibleAVC = new TextField();
		textFieldPlaceOrEncoreDisponibleAVC.setText("500");
		textFieldPlaceOrEncoreDisponibleAVC.setForeground(new Color(0, 128, 0));
		textFieldPlaceOrEncoreDisponibleAVC.setFont(new Font("Vivaldi", Font.BOLD, 15));
		textFieldPlaceOrEncoreDisponibleAVC.setEditable(false);
		textFieldPlaceOrEncoreDisponibleAVC.setBounds(508, 230, 58, 21);
		contentPane.add(textFieldPlaceOrEncoreDisponibleAVC);
		
		TextField textFieldOrNbreplacesDesirerAVC = new TextField();
		textFieldOrNbreplacesDesirerAVC.setForeground(Color.BLACK);
		textFieldOrNbreplacesDesirerAVC.setFont(new Font("Vivaldi", Font.BOLD, 15));
		textFieldOrNbreplacesDesirerAVC.setBounds(595, 230, 58, 21);
		contentPane.add(textFieldOrNbreplacesDesirerAVC);
		
		JRadioButton rdbtnArgentAVC = new JRadioButton("Argent");
		rdbtnArgentAVC.setEnabled(false);
		rdbtnArgentAVC.setFont(new Font("Vivaldi", Font.BOLD, 20));
		rdbtnArgentAVC.setBounds(362, 259, 103, 21);
		contentPane.add(rdbtnArgentAVC);
		
		TextField textFieldPlaceArgentEncoreDisponibleAVC = new TextField();
		textFieldPlaceArgentEncoreDisponibleAVC.setText("1500");
		textFieldPlaceArgentEncoreDisponibleAVC.setForeground(new Color(0, 128, 0));
		textFieldPlaceArgentEncoreDisponibleAVC.setFont(new Font("Vivaldi", Font.BOLD, 15));
		textFieldPlaceArgentEncoreDisponibleAVC.setEditable(false);
		textFieldPlaceArgentEncoreDisponibleAVC.setBounds(508, 259, 58, 21);
		contentPane.add(textFieldPlaceArgentEncoreDisponibleAVC);
		
		TextField textFieldArgentNbreplacesDesirerAVC = new TextField();
		textFieldArgentNbreplacesDesirerAVC.setForeground(Color.BLACK);
		textFieldArgentNbreplacesDesirerAVC.setFont(new Font("Vivaldi", Font.BOLD, 15));
		textFieldArgentNbreplacesDesirerAVC.setBounds(595, 259, 58, 21);
		contentPane.add(textFieldArgentNbreplacesDesirerAVC);
		
		JRadioButton rdbtnBronzeAVC = new JRadioButton("Bronze");
		rdbtnBronzeAVC.setEnabled(false);
		rdbtnBronzeAVC.setFont(new Font("Vivaldi", Font.BOLD, 20));
		rdbtnBronzeAVC.setBounds(362, 291, 103, 21);
		contentPane.add(rdbtnBronzeAVC);
		
		TextField textFieldPlaceBronzeEncoreDisponibleAVC = new TextField();
		textFieldPlaceBronzeEncoreDisponibleAVC.setText("3000");
		textFieldPlaceBronzeEncoreDisponibleAVC.setForeground(new Color(0, 128, 0));
		textFieldPlaceBronzeEncoreDisponibleAVC.setFont(new Font("Vivaldi", Font.BOLD, 15));
		textFieldPlaceBronzeEncoreDisponibleAVC.setEditable(false);
		textFieldPlaceBronzeEncoreDisponibleAVC.setBounds(508, 291, 58, 21);
		contentPane.add(textFieldPlaceBronzeEncoreDisponibleAVC);
		
		TextField textFieldBronzeNbreplacesDesirerAVC = new TextField();
		textFieldBronzeNbreplacesDesirerAVC.setForeground(Color.BLACK);
		textFieldBronzeNbreplacesDesirerAVC.setFont(new Font("Vivaldi", Font.BOLD, 15));
		textFieldBronzeNbreplacesDesirerAVC.setBounds(595, 291, 58, 21);
		contentPane.add(textFieldBronzeNbreplacesDesirerAVC);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Assis version Cirque");
		lblNewLabel_1_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1_1.setFont(new Font("Vivaldi", Font.BOLD, 20));
		lblNewLabel_1_1_1_1.setBackground(Color.WHITE);
		lblNewLabel_1_1_1_1.setBounds(373, 338, 234, 21);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		ButtonGroup groupAVC= new ButtonGroup();
		groupAVC.add(rdbtnOrAVC);
		groupAVC.add(rdbtnArgentAVC);
		groupAVC.add(rdbtnBronzeAVC);
		
		
		JRadioButton rdbtnOrC = new JRadioButton("Or");
		rdbtnOrC.setEnabled(false);
		rdbtnOrC.setFont(new Font("Vivaldi", Font.BOLD, 20));
		rdbtnOrC.setBounds(362, 396, 103, 21);
		contentPane.add(rdbtnOrC);
		
		TextField textFieldPlaceOrEncoreDisponibleC = new TextField();
		textFieldPlaceOrEncoreDisponibleC.setText("2000");
		textFieldPlaceOrEncoreDisponibleC.setForeground(new Color(0, 128, 0));
		textFieldPlaceOrEncoreDisponibleC.setFont(new Font("Vivaldi", Font.BOLD, 15));
		textFieldPlaceOrEncoreDisponibleC.setEditable(false);
		textFieldPlaceOrEncoreDisponibleC.setBounds(508, 396, 58, 21);
		contentPane.add(textFieldPlaceOrEncoreDisponibleC);
		
		TextField textFieldOrNbreplacesDesirerC = new TextField();
		textFieldOrNbreplacesDesirerC.setForeground(Color.BLACK);
		textFieldOrNbreplacesDesirerC.setFont(new Font("Vivaldi", Font.BOLD, 15));
		textFieldOrNbreplacesDesirerC.setBounds(595, 396, 58, 21);
		contentPane.add(textFieldOrNbreplacesDesirerC);
		
		JRadioButton rdbtnArgentC = new JRadioButton("Argent");
		rdbtnArgentC.setEnabled(false);
		rdbtnArgentC.setFont(new Font("Vivaldi", Font.BOLD, 20));
		rdbtnArgentC.setBounds(362, 425, 103, 21);
		contentPane.add(rdbtnArgentC);
		
		TextField textFieldPlaceArgentEncoreDisponibleC = new TextField();
		textFieldPlaceArgentEncoreDisponibleC.setText("1500");
		textFieldPlaceArgentEncoreDisponibleC.setForeground(new Color(0, 128, 0));
		textFieldPlaceArgentEncoreDisponibleC.setFont(new Font("Vivaldi", Font.BOLD, 15));
		textFieldPlaceArgentEncoreDisponibleC.setEditable(false);
		textFieldPlaceArgentEncoreDisponibleC.setBounds(508, 425, 58, 21);
		contentPane.add(textFieldPlaceArgentEncoreDisponibleC);
		
		TextField textFieldArgentNbreplacesDesirerC = new TextField();
		textFieldArgentNbreplacesDesirerC.setForeground(Color.BLACK);
		textFieldArgentNbreplacesDesirerC.setFont(new Font("Vivaldi", Font.BOLD, 15));
		textFieldArgentNbreplacesDesirerC.setBounds(595, 425, 58, 21);
		contentPane.add(textFieldArgentNbreplacesDesirerC);
		
		JRadioButton rdbtnBronzeC = new JRadioButton("Bronze");
		rdbtnBronzeC.setEnabled(false);
		rdbtnBronzeC.setFont(new Font("Vivaldi", Font.BOLD, 20));
		rdbtnBronzeC.setBounds(362, 457, 103, 21);
		contentPane.add(rdbtnBronzeC);
		
		TextField textFieldPlaceBronzeEncoreDisponibleC = new TextField();
		textFieldPlaceBronzeEncoreDisponibleC.setText("1500");
		textFieldPlaceBronzeEncoreDisponibleC.setForeground(new Color(0, 128, 0));
		textFieldPlaceBronzeEncoreDisponibleC.setFont(new Font("Vivaldi", Font.BOLD, 15));
		textFieldPlaceBronzeEncoreDisponibleC.setEditable(false);
		textFieldPlaceBronzeEncoreDisponibleC.setBounds(508, 457, 58, 21);
		contentPane.add(textFieldPlaceBronzeEncoreDisponibleC);
		
		TextField textFieldBronzeNbreplacesDesirerC = new TextField();
		textFieldBronzeNbreplacesDesirerC.setForeground(Color.BLACK);
		textFieldBronzeNbreplacesDesirerC.setFont(new Font("Vivaldi", Font.BOLD, 15));
		textFieldBronzeNbreplacesDesirerC.setBounds(595, 457, 58, 21);
		contentPane.add(textFieldBronzeNbreplacesDesirerC);
		
		JRadioButton rdbtnDiamantC = new JRadioButton("Diamant");
		rdbtnDiamantC.setEnabled(false);
		rdbtnDiamantC.setFont(new Font("Vivaldi", Font.BOLD, 20));
		rdbtnDiamantC.setBounds(361, 369, 103, 21);
		contentPane.add(rdbtnDiamantC);
		
		TextField textFieldPlaceDiamantEncoreDisponibleC = new TextField();
		textFieldPlaceDiamantEncoreDisponibleC.setText("1000");
		textFieldPlaceDiamantEncoreDisponibleC.setForeground(new Color(0, 128, 0));
		textFieldPlaceDiamantEncoreDisponibleC.setFont(new Font("Vivaldi", Font.BOLD, 15));
		textFieldPlaceDiamantEncoreDisponibleC.setEditable(false);
		textFieldPlaceDiamantEncoreDisponibleC.setBounds(507, 369, 58, 21);
		contentPane.add(textFieldPlaceDiamantEncoreDisponibleC);
		
		TextField textFieldDiamantNbreplacesDesirerC = new TextField();
		textFieldDiamantNbreplacesDesirerC.setForeground(Color.BLACK);
		textFieldDiamantNbreplacesDesirerC.setFont(new Font("Vivaldi", Font.BOLD, 15));
		textFieldDiamantNbreplacesDesirerC.setBounds(594, 369, 58, 21);
		contentPane.add(textFieldDiamantNbreplacesDesirerC);
		
		ButtonGroup groupC= new ButtonGroup();
		groupC.add(rdbtnDiamantC);
		groupC.add(rdbtnBronzeC);
		groupC.add(rdbtnArgentC);
		groupC.add(rdbtnOrC);
		
		JButton btnPayerspectator = new JButton("Payer");
		btnPayerspectator.setForeground(Color.BLACK);
		btnPayerspectator.setBackground(SystemColor.textHighlight);
		btnPayerspectator.setBounds(510, 681, 98, 46);
		contentPane.add(btnPayerspectator);
		
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setMargin(new Insets(5, 0, 5, 0));
		menuBar.setFont(new Font("HP Simplified", Font.BOLD, 28));
		setJMenuBar(menuBar);
		
		JMenu mnexitacceuil, BookshowSpectator, mnuser, mnHome, mnPagnier;
		mnexitacceuil=new JMenu("Quiter"); 
		mnexitacceuil.setBackground(Color.RED);
		mnexitacceuil.setHorizontalAlignment(SwingConstants.RIGHT);
		mnexitacceuil.setFont(new Font("HP Simplified", Font.BOLD | Font.ITALIC, 15));
		mnexitacceuil.setForeground(Color.BLACK);
		
		BookshowSpectator =new JMenu("Mes commandes"); 
		BookshowSpectator.setHorizontalAlignment(SwingConstants.RIGHT);
		BookshowSpectator.setFont(new Font("HP Simplified", Font.BOLD | Font.ITALIC, 15));
		BookshowSpectator.setForeground(Color.BLACK);
		
		mnHome =new JMenu("Accueil"); 
		mnHome.setHorizontalAlignment(SwingConstants.RIGHT);
		mnHome.setFont(new Font("HP Simplified", Font.BOLD | Font.ITALIC, 15));
		mnHome.setForeground(Color.BLACK);
		
		mnPagnier =new JMenu("Mon Pagnier"); 
		mnPagnier.setHorizontalAlignment(SwingConstants.RIGHT);
		mnPagnier.setFont(new Font("HP Simplified", Font.BOLD | Font.ITALIC, 15));
		mnPagnier.setForeground(Color.BLACK);
	
		if(Person.CurrentUser != null && Person.CurrentUser.getIDperson() >0) {
			mnuser=new JMenu(Person.CurrentUser.getFirstName() + " " +  Person.CurrentUser.getLastName()); 
			mnuser.setBackground(Color.RED);
			mnuser.setHorizontalAlignment(SwingConstants.LEFT);
			mnuser.setFont(new Font("HP Simplified", Font.BOLD | Font.ITALIC, 15));
			mnuser.setForeground(Color.BLACK);
			
			menuBar.add(mnuser);
			
			// action
			mnuser.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					
				}
			});
		}
		
		menuBar.add(BookshowSpectator);
		menuBar.add(mnPagnier);
		menuBar.add(mnHome);
		menuBar.add(mnexitacceuil);
	}
}
