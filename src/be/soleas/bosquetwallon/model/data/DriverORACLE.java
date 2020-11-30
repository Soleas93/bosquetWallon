package be.soleas.bosquetwallon.model.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;


public class DriverORACLE {
	private static Connection connection = null;
	
	private static final String DRIVER= "oracle.jdbc.OracleDriver";
	private static final String DBURL= "jdbc:oracle:thin:@[host]:[port]:[sid]";

    private DriverORACLE() {
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(DBURL);
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Impossible de trouver le driver pour la base de donnée!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Impossible de se connecter à  la base de donnée.");
        }

        if (connection == null) {
            JOptionPane.showMessageDialog(null, "La base de donnée est innaccessible, fermeture du programme.");
            System.exit(0);
        }
    }

    public static Connection getInstance() {
        if (connection == null) {
            new DriverORACLE();
        }

        return connection;
    }
}
