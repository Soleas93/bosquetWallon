package be.soleas.bosquetwallon.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JTextArea;
import java.awt.Component;
import java.awt.ComponentOrientation;
import javax.swing.border.LineBorder;

public class ShowList extends JPanel{
	private static JPanel panel;
	private JPanel listPanel;
	private JPanel listPerformance;
	private JScrollPane scrollPane_perf;
	
	private ShowList() {
		JPanel mainPanel = new JPanel();
		mainPanel.setBackground(new Color(176, 196, 222));
		GridBagLayout gbl_mainPanel = new GridBagLayout();
		gbl_mainPanel.columnWidths = new int[]{10, 90, 130, 128, 90, 10, 0};
		gbl_mainPanel.rowHeights = new int[]{0, 23, 0, 0, 0};
		gbl_mainPanel.columnWeights = new double[]{1.0, 6.0, 0.0, 0.0, 6.0, 1.0, Double.MIN_VALUE};
		gbl_mainPanel.rowWeights = new double[]{1.0, 0.0, 6.0, 1.0, Double.MIN_VALUE};
		mainPanel.setLayout(gbl_mainPanel);
		
		JLabel lblNewLabel = new JLabel("Spectacles");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridwidth = 2;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 2;
		gbc_lblNewLabel.gridy = 1;
		mainPanel.add(lblNewLabel, gbc_lblNewLabel);
		
		panel = mainPanel;
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridwidth = 4;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 2;
		mainPanel.add(scrollPane, gbc_scrollPane);
		
		listPanel = new JPanel();
		scrollPane.setViewportView(listPanel);
		listPanel.setLayout(new BoxLayout(listPanel, BoxLayout.Y_AXIS));
		
		JPanel show = new JPanel();
		show.setBorder(new LineBorder(new Color(0, 0, 0)));
		show.setAlignmentY(Component.TOP_ALIGNMENT);
		show.setBackground(new Color(192, 192, 192));
		listPanel.add(show);
		GridBagLayout gbl_show = new GridBagLayout();
		gbl_show.columnWidths = new int[]{245, 35, 0};
		gbl_show.rowHeights = new int[]{51, 51, 0, 0, 0};
		gbl_show.columnWeights = new double[]{1.0, 0.0, Double.MIN_VALUE};
		gbl_show.rowWeights = new double[]{0.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
		show.setLayout(gbl_show);
		
		JLabel title = new JLabel("Le nom du spectacle");
		title.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		title.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		title.setFont(new Font("Tahoma", Font.BOLD, 13));
		GridBagConstraints gbc_title = new GridBagConstraints();
		gbc_title.insets = new Insets(0, 0, 5, 5);
		gbc_title.fill = GridBagConstraints.BOTH;
		gbc_title.gridx = 0;
		gbc_title.gridy = 0;
		show.add(title, gbc_title);
		
		JButton btnNewButton = new JButton("Représentations");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				scrollPane_perf.setVisible(!scrollPane_perf.isVisible());
				//System.out.println("scrollpane_perf is " + scrollPane_perf.isVisible() );
				//show.repaint();
			}
		});
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton.gridx = 1;
		gbc_btnNewButton.gridy = 0;
		show.add(btnNewButton, gbc_btnNewButton);
		
		JTextArea txtrIciVientLa = new JTextArea();
		txtrIciVientLa.setEditable(false);
		txtrIciVientLa.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		txtrIciVientLa.setText("Ici vient la description du spectacle...\r\nJe me demande si elle peut se trouver\r\n sur plusieurs lignes");
		GridBagConstraints gbc_txtrIciVientLa = new GridBagConstraints();
		gbc_txtrIciVientLa.insets = new Insets(0, 0, 5, 0);
		gbc_txtrIciVientLa.anchor = GridBagConstraints.NORTH;
		gbc_txtrIciVientLa.gridwidth = 2;
		gbc_txtrIciVientLa.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtrIciVientLa.gridx = 0;
		gbc_txtrIciVientLa.gridy = 1;
		show.add(txtrIciVientLa, gbc_txtrIciVientLa);
		
		scrollPane_perf = new JScrollPane();
		scrollPane_perf.setVisible(false);
		GridBagConstraints gbc_scrollPane_perf = new GridBagConstraints();
		gbc_scrollPane_perf.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPane_perf.gridwidth = 2;
		gbc_scrollPane_perf.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_perf.gridx = 0;
		gbc_scrollPane_perf.gridy = 2;
		show.add(scrollPane_perf, gbc_scrollPane_perf);
		
		listPerformance = new JPanel();
		scrollPane_perf.setViewportView(listPerformance);
		listPerformance.setLayout(new BoxLayout(listPerformance, BoxLayout.Y_AXIS));
		
		JPanel performance = new JPanel();
		listPerformance.add(performance);
		
		JLabel lblNewLabel_1 = new JLabel("Vendredi 25 Décembre de 13h00 à 15h00");
		performance.add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("Réserver");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainWindowController.switchPanel(MainWindow.bookPerformance);
			}
		});
		btnNewButton_1.setAlignmentX(Component.RIGHT_ALIGNMENT);
		performance.add(btnNewButton_1);
		
		JPanel performance_1 = new JPanel();
		listPerformance.add(performance_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Vendredi 25 Décembre de 13h00 à 15h00");
		performance_1.add(lblNewLabel_1_1);
		
		JButton btnNewButton_1_1 = new JButton("Réserver");
		btnNewButton_1_1.setAlignmentX(1.0f);
		performance_1.add(btnNewButton_1_1);
	}

	public static JPanel Get() {
		if(panel == null)
			new ShowList();
		return panel;
	}
}
