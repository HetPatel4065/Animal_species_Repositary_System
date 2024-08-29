import java.sql.*;

public class DBConnection {

	String dbURL = "jdbc:mysql://localhost:3306/java_project";
	String dbuserName = "root";
	String dbpassword = "";
	String driver="com.mysql.cj.jdbc.Driver";

	public Connection getConnection() throws Exception{
		Class.forName(driver);
		Connection connection = DriverManager.getConnection(dbURL, dbuserName,dbpassword);
			if (connection != null){
				System.out.println("Connected With DataBase..........");
			}else{
				System.out.println("Not Connected With DataBase..........");
			}
		return connection;
	}
}
