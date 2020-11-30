package be.soleas.bosquetwallon.controller;

import javax.swing.JPanel;

import be.soleas.bosquetwallon.view.MainWindow;

public class MainWindowController {

	public static void switchPanel(JPanel panel) {
		MainWindow.mainFrame.setContentPane(panel);
		MainWindow.mainFrame.repaint();
		MainWindow.mainFrame.revalidate();
	}
}
