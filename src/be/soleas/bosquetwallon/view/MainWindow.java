package be.soleas.bosquetwallon.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JTabbedPane;

import be.soleas.bosquetwallon.controller.MainWindowController;

import javax.swing.JPanel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;
import java.awt.Dimension;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class MainWindow {

	public static JFrame mainFrame;
	public static JPanel connec = Connection.Get();
	public static JPanel register = Registration.Get();
	public static JPanel showList = ShowList.Get();
	public static JPanel bookPerformance = be.soleas.bosquetwallon.view.bookPerformance.Get();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					initialize();
					MainWindow.mainFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private static void initialize() {
		mainFrame = new JFrame();
		mainFrame.setMinimumSize(new Dimension(800, 600));
		mainFrame.setTitle("BosquetWallon");
		mainFrame.setBounds(100, 100, 800, 600);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		mainFrame.setContentPane(connec);
		
		JMenuBar menuBar = new JMenuBar();
		mainFrame.setJMenuBar(menuBar);
		
		JMenu mnNewMenu_1 = new JMenu("Spectacles");
		mnNewMenu_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainWindowController.switchPanel(showList);
			}
		});
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("New menu item");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainWindowController.switchPanel(showList);
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem);
		
		JMenu mnNewMenu = new JMenu("Ma commande");
		menuBar.add(mnNewMenu);
	}
	
	/*public static void switchPanel(JPanel panel) {
		mainFrame.setContentPane(panel);
		mainFrame.repaint();
		mainFrame.revalidate();
	}*/
}
