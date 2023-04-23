package org.jspider.jdbc;
import java.sql.*;
import java.lang.*;



public class Jdbc_Demo {


	public static void main(String[] args, java.lang.String url) {
		Connection con=null;
		Statement stmt=null;
	
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Load & Registered");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&&password=Admin@123");
			System.out.println("connection established between with database");
			System.out.println("platform created");
			stmt=con.createStatement();
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
					System.out.println("close all costly resourses ");
				}
			}
		}
	}

}
