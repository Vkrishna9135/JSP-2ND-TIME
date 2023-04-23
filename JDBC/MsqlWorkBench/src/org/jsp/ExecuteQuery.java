package org.jsp;
import java.sql.*;
class ExecuteQuery {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306";
		Connection con=null;
		Statement stmt=null;
		String query="SELECT * FROM btm.employee;";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("class loaded & registered ");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&&password=Admin@123");
			System.out.println("connection established with database server");
			System.out.println();
			stmt=con.createStatement();
			stmt.execute(query);
		} catch (ClassNotFoundException |SQLException e) {
			
			e.printStackTrace();
		}
		finally {
			if(con!=null&&stmt!=null) {
				try {
					con.close();
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			System.out.println("costly resources is closed");
		}
		
		
	}

}
