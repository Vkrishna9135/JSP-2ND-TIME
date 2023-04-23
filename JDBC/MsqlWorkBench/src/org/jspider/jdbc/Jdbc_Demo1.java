package org.jspider.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc_Demo1 {
	public static void main(String[] args) {
		Connection con=null;
		Statement stmt=null;
		String query="SELECT * FROM btm.employee;";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("class loaded & registerd");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&&password=Admin@123");
			System.out.println("connection established with database server");
			stmt=con.createStatement();
			System.out.println("platform is created");
			stmt.executeQuery(query);
			System.out.println("data fetched");
			
		} catch (SQLException|ClassNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			if(stmt!=null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				if(con!=null) {
					try {
						con.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}

}
