package luongNT7database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Myconnect {
	
	private final String ClassName = "com.mysql.jdbc.Driver";
	private final String Url = "jdbc:mysql://localhost:3306/student";
	private final String user= "root";
	private final String pass= "root";
	private Connection connection;
	
	private void connect() {
		try {
			Class.forName(ClassName);
			connection = DriverManager.getConnection(Url, user, pass);
			System.out.print("Successfull");
			} catch (SQLException e) {
				System.out.print("Error connection");
			} catch (ClassNotFoundException e) {
				System.out.print("Class Not Found");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myconnect myConnect = new Myconnect(); 
		myConnect.connect();
	}

}
