import java.beans.Statement;
import java.sql.*;
import java.lang.*; 
public class InsertionData {
	public static void main(String[] args) throws ClassNotFoundException{
		Statement stmt=null;
		String qry="insert into student value(1,'krishna','tadipatri',75.95)";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/btm","root","Admin@123");	
					stmt=con.createStatement();
					stmt.execute(qry);
					System.out.println("hello");
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
