package org.jsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Student {

	public static void main(String[] args) {
		Connection con=null;
		Statement stmt=null;
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","admin");
			System.out.println("driver is connected");
			
			
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
