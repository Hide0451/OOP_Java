import java.sql.*; 
public class db_connection {
	public static void main(String[] argv) {
        String url = "jdbc:postgresql://127.0.0.1:5432/excursions";
        String user = "postgres";
        String password = "yo_password";
        try {
		Class.forName("org.postgresql.Driver");
	} catch (ClassNotFoundException e) {
		System.out.println("PostgreSQL JDBC Driver is not found.");
		e.printStackTrace();
		return;
	}System.out.println("PostgreSQL JDBC Driver successfully connected");
	Connection conn = null;
	try {
		conn = DriverManager
		.getConnection(url, user, password);
 
	} catch (SQLException e) {
		System.out.println("Connection Failed");
		e.printStackTrace();
		return;
	}
 
	if (conn != null) {
		System.out.println("Connected to database");
	} else {
		System.out.println("Failed to connect to database");
	}
	}
}