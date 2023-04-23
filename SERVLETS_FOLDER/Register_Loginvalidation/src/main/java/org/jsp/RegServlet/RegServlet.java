package org.jsp.RegServlet;


import java.io.IOException;


import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/fs")

public class RegServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String sid =req.getParameter("i");
		int id=Integer.parseInt(sid);
		String name=req.getParameter("nm");
		String uname=req.getParameter("unm");
		String email=req.getParameter("eml");
		String password=req.getParameter("pw");
	
	
		
		PrintWriter out=resp.getWriter();
		out.println("<html><body bgcolor='orange'>"
				+ "<h1> Registeration Details inserted succesfully</h1>"
				+ "</body></html>");
		out.close();
		
		// persistance logic.........
		Connection con=null;
		PreparedStatement pstmt =null;
		String qry="insert into btm.reguser values(?,?,?,?,?)";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println(" loaded & registered driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=Admin@123");
			System.out.println(" connection established between the java application & data base server");
			pstmt=con.prepareStatement(qry);
			System.out.println("platform created");
			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			System.out.println("1 executed");
			pstmt.setString(3, uname);
			System.out.println("2 executed");
			pstmt.setString(4, email);
			System.out.println("3 executed");
			pstmt.setString(5, password);
			System.out.println("4 executed");
			
			pstmt.executeUpdate();
			
		
			System.out.println("data inserted succesfully");
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		finally {
			if(pstmt!=null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
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