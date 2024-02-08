package ReservationApplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dbconnection {
	private static final String url="jdbc:mysql://localhost:3306/millerjava";
	private static final String name="root";
	private static final String pass="";

	public static Connection getconnection() throws SQLException{
		return DriverManager.getConnection(url,name,pass);
	}
	
}
