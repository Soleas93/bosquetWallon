package be.soleas.bosquetwallon.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

import be.soleas.bosquetwallon.controller.MainWindowController;

import java.awt.CardLayout;
import javax.swing.JLayeredPane;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.BoxLayout;
import java.awt.Component;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.SystemColor;
import javax.swing.JFormattedTextField;
import javax.swing.JSeparator;
import javax.swing.border.LineBorder;

public class Registration extends JPanel {
	
	private static JPanel panel;
	private JTextField tfFirstname;
	private JTextField tfName;
	private JTextField textField;
	private JTextField textField_1;
	private JFormattedTextField textField_2;
	private JRadioButton rdSpectator;
	private JRadioButton rdOrganizer;
	private JLayeredPane layeredPane;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	
	private Registration() {
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("3dlu:grow"),
				ColumnSpec.decode("center:110px"),
				FormSpecs.LABEL_COMPONENT_GAP_COLSPEC,
				ColumnSpec.decode("center:0dlu"),
				FormSpecs.LABEL_COMPONENT_GAP_COLSPEC,
				ColumnSpec.decode("center:120px"),
				ColumnSpec.decode("120px"),
				FormSpecs.LABEL_COMPONENT_GAP_COLSPEC,
				ColumnSpec.decode("0dlu"),
				ColumnSpec.decode("110px"),
				ColumnSpec.decode("3dlu:grow"),},
			new RowSpec[] {
				FormSpecs.LINE_GAP_ROWSPEC,
				RowSpec.decode("default:grow"),
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("30px"),
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.LINE_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("75px"),
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("max(45dlu;default)"),
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("default:grow"),}));
		//mainFrame.getContentPane().add(panel_1, BorderLayout.NORTH);
		
		JLabel title = new JLabel("Nouvel utilisateur");
		title.setFont(new Font("Tahoma", Font.PLAIN, 18));
		mainPanel.add(title, "6, 4, 2, 1, center, center");
		
		JLabel lblNewLabel_2 = new JLabel("Pseudo");
		mainPanel.add(lblNewLabel_2, "2, 6");
		
		textField_3 = new JTextField();
		mainPanel.add(textField_3, "6, 6, 2, 1, center, center");
		textField_3.setColumns(25);
		
		JLabel lblNewLabel_3 = new JLabel("Mot de passe");
		mainPanel.add(lblNewLabel_3, "2, 8");
		
		textField_5 = new JTextField();
		mainPanel.add(textField_5, "6, 8, 2, 1, center, center");
		textField_5.setColumns(25);
		
		JLabel lblNewLabel_4 = new JLabel("Email");
		mainPanel.add(lblNewLabel_4, "2, 10");
		
		textField_4 = new JTextField();
		textField_4.setColumns(25);
		mainPanel.add(textField_4, "6, 10, 2, 1, center, center");
		
		JSeparator separator = new JSeparator();
		mainPanel.add(separator, "6, 12");
		
		JLabel lbFirstname = new JLabel("Prénom");
		mainPanel.add(lbFirstname, "2, 14, center, center");
		
		tfFirstname = new JTextField();
		mainPanel.add(tfFirstname, "6, 14, 2, 1, center, center");
		tfFirstname.setColumns(25);
		
		JLabel lbName = new JLabel("Nom");
		mainPanel.add(lbName, "2, 16, center, center");
		
		tfName = new JTextField();
		mainPanel.add(tfName, "6, 16, 2, 1, center, center");
		tfName.setColumns(25);
		
		JLabel lbAddress = new JLabel("Adresse");
		mainPanel.add(lbAddress, "2, 18, 1, 3, center, center");
		panel = mainPanel;
		
		JTextArea textArea = new JTextArea();
		textArea.setBorder(new LineBorder(new Color(0, 0, 0)));
		textArea.setTabSize(4);
		textArea.setRows(3);
		textArea.setColumns(25);
		mainPanel.add(textArea, "6, 18, 2, 3, fill, fill");
		
		JSeparator separator_1 = new JSeparator();
		mainPanel.add(separator_1, "2, 22");
		
		JLabel lbType = new JLabel("Type");
		mainPanel.add(lbType, "2, 24, default, center");
		
		rdSpectator = new JRadioButton("Spectateur");
		rdSpectator.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdSpectator.isSelected()) {
					rdOrganizer.setSelected(false);
					CardLayout cards = (CardLayout) layeredPane.getLayout();
					cards.show(layeredPane, "spectator" );
				}
			}
		});
		rdSpectator.setSelected(true);
		mainPanel.add(rdSpectator, "6, 24, center, default");
		
		rdOrganizer = new JRadioButton("Organisateur");
		rdOrganizer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdOrganizer.isSelected()) {
					rdSpectator.setSelected(false);
					CardLayout cards = (CardLayout) layeredPane.getLayout();
					cards.show(layeredPane, "organizer" );
				}
			}
		});
		mainPanel.add(rdOrganizer, "7, 24, center, default");
		
		layeredPane = new JLayeredPane();
		mainPanel.add(layeredPane, "2, 26, 6, 1, center, center");
		layeredPane.setLayout(new CardLayout(0, 0));
		
		JPanel spectator = new JPanel();
		layeredPane.add(spectator, "spectator");
		GridBagLayout gbl_spectator = new GridBagLayout();
		gbl_spectator.columnWidths = new int[] {138, 220, 12};
		gbl_spectator.rowHeights = new int[]{34, 34, 0};
		gbl_spectator.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_spectator.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		spectator.setLayout(gbl_spectator);
		
		JLabel lblDateDeNaissance = new JLabel("Date de naissance");
		GridBagConstraints gbc_lblDateDeNaissance = new GridBagConstraints();
		gbc_lblDateDeNaissance.anchor = GridBagConstraints.EAST;
		gbc_lblDateDeNaissance.insets = new Insets(0, 0, 5, 5);
		gbc_lblDateDeNaissance.gridx = 0;
		gbc_lblDateDeNaissance.gridy = 0;
		spectator.add(lblDateDeNaissance, gbc_lblDateDeNaissance);
		
		DateFormat dob = new SimpleDateFormat("d/M/yyyy");
		textField_2 = new JFormattedTextField(dob);
		textField_2.setText("01/01/1900");
		textField_2.setToolTipText("jj/mm/aaaa");
		textField_2.setColumns(25);
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 0);
		gbc_textField_2.gridx = 1;
		gbc_textField_2.gridy = 0;
		spectator.add(textField_2, gbc_textField_2);
		
		JPanel organizer = new JPanel();
		layeredPane.add(organizer, "organizer");
		GridBagLayout gbl_organizer = new GridBagLayout();
		gbl_organizer.columnWidths = new int[] {138, 220, 12};
		gbl_organizer.rowHeights = new int[] {35, 35};
		gbl_organizer.columnWeights = new double[]{0.0, 0.0};
		gbl_organizer.rowWeights = new double[]{0.0, 0.0};
		organizer.setLayout(gbl_organizer);
		
		JLabel lblNewLabel = new JLabel("Nom professionnel");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		organizer.add(lblNewLabel, gbc_lblNewLabel);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 0;
		organizer.add(textField, gbc_textField);
		textField.setColumns(25);
		
		JLabel lblNewLabel_1 = new JLabel("Numéro Tva");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 1;
		organizer.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.gridx = 1;
		gbc_textField_1.gridy = 1;
		organizer.add(textField_1, gbc_textField_1);
		textField_1.setColumns(25);
		
		JButton btnValidate = new JButton("Valider");
		btnValidate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainWindowController.switchPanel(MainWindow.connec);
			}
		});
		mainPanel.add(btnValidate, "10, 28, center, top");
	}
	
	public static JPanel Get() {
		if(panel == null)
			new Registration();
		return panel;
	}
	
	

}
