package org.jsp;
import java.sql.*;
public class Stage1_loadDriver {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306";
		String username="root";
		String password="Admin";
		
		try {
			Class.forName("con.mysql.cj.jdbc.Driver");
			System.out.println("driver is loaded");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
