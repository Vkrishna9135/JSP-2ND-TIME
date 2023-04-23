package CRUDOperations;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertData {
	
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/jdbc";
		String username="root";
		String password="Admin@123";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,username,password);
			Statement st=con.createStatement();
			String query="create table btm.student";
			st.execute(query);
			con.close();
		}catch(Exception e) {
			System.out.println("Exception Occured");
			e.printStackTrace();
		}
	}

}
