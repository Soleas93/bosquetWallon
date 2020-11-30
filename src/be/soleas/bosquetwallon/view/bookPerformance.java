package be.soleas.bosquetwallon.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import be.soleas.bosquetwallon.controller.MainWindowController;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.BoxLayout;
import javax.swing.JSlider;
import javax.swing.JFormattedTextField;

public class bookPerformance extends JPanel{
	private static JPanel panel;
	
	private bookPerformance() {
		JPanel mainPanel = new JPanel();
		mainPanel.setBackground(new Color(176, 196, 222));
		GridBagLayout gbl_mainPanel = new GridBagLayout();
		gbl_mainPanel.columnWidths = new int[]{10, 90, 130, 128, 90, 10, 0};
		gbl_mainPanel.rowHeights = new int[]{0, 23, 0, 0, 0, 0, 0};
		gbl_mainPanel.columnWeights = new double[]{1.0, 0.0, 1.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_mainPanel.rowWeights = new double[]{1.0, 0.0, 0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		mainPanel.setLayout(gbl_mainPanel);
		
		JLabel lblNewLabel = new JLabel("Tiitre spectacle");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridwidth = 2;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 2;
		gbc_lblNewLabel.gridy = 1;
		mainPanel.add(lblNewLabel, gbc_lblNewLabel);
		
		panel = mainPanel;
		
		JLabel lblNewLabel_1 = new JLabel("date et heure de la réprésentation");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.gridwidth = 2;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 2;
		gbc_lblNewLabel_1.gridy = 2;
		mainPanel.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridwidth = 4;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 3;
		mainPanel.add(scrollPane, gbc_scrollPane);
		
		JPanel configuration = new JPanel();
		scrollPane.setViewportView(configuration);
		configuration.setLayout(new BoxLayout(configuration, BoxLayout.Y_AXIS));
		
		JPanel category = new JPanel();
		configuration.add(category);
		
		JLabel lblNewLabel_2 = new JLabel("nomCategorie");
		category.add(lblNewLabel_2);
		
		NumberFormat integerFieldFormatter = NumberFormat.getIntegerInstance();
		integerFieldFormatter.setGroupingUsed(false);
		integerFieldFormatter.setMaximumFractionDigits(0);
		
		JFormattedTextField formattedTextField = new JFormattedTextField(integerFieldFormatter);
		formattedTextField.setText("0");
		formattedTextField.setColumns(10);
		category.add(formattedTextField);
		
		panel = mainPanel;
		
		JLabel lblNewLabel_3 = new JLabel("Prix total :");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 1;
		gbc_lblNewLabel_3.gridy = 4;
		mainPanel.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		JButton btnNewButton = new JButton("Confirmer");
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 4;
		gbc_btnNewButton.gridy = 4;
		mainPanel.add(btnNewButton, gbc_btnNewButton);
	}

	public static JPanel Get() {
		if(panel == null)
			new bookPerformance();
		return panel;
	}
}
