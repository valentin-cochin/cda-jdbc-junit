package cda.junit.daosql;

import static cda.junit.ihm.Ihm.IHM_INS;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class MyConnection {
	private static Connection connexion = null;

	private MyConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Properties appProps = new Properties();
			appProps.load(MyConnection.class.getResourceAsStream("/db.properties"));
			connexion = DriverManager.getConnection(appProps.getProperty("url"),
													appProps.getProperty("username"),
													appProps.getProperty("password"));
		}
		catch (Exception e) {
			e.printStackTrace();
			IHM_INS.display("Connexion à la BDD échouée");
		}
	}

	public static Connection getConnection() {
		if (connexion == null) {
			new MyConnection();
		}
		return connexion;
	}

	public static void stop() {
		if (connexion != null) {
			try {
				connexion.close();
			} catch (SQLException e) {
				IHM_INS.display("La déconnexion à la BDD a échouée");
			}
		}
	}
}
