package testThings;
import java.sql.*;
public class Maintest {

	public Maintest() {
		// TODO Auto-generated constructor stub
		String url = "jdbc:mysql://localhost:3306/yourDatabase"; // Replace with your DB URL
        String username = "yourUsername";  // Replace with your DB username
        String password = "yourPassword";  // Replace with your DB password

        try {
            // Load MySQL JDBC Driver (if not using Maven)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connection established successfully!");

            // Close the connection
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Maintest();
	}

}
