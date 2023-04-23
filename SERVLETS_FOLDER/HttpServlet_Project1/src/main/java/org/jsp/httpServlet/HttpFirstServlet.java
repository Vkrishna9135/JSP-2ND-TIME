package org.jsp.httpServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = "/fs")

public class HttpFirstServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		String sid=req.getParameter("i");
		int id=Integer.parseInt(sid);
		
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String query="select * from btm.student where id=?";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=Admin@123");
			pstmt=con.prepareStatement(query);
			
			pstmt.setInt(1, id);
			rs=pstmt.executeQuery();
			
			PrintWriter out=resp.getWriter();
			if(rs.next()) {
				String sname=rs.getString(2);
				String dept=rs.getString(3);
				out.println("<html><body bgcolor='yellow'>"
						+ "<h1>STUDENT DETAILS: "
						+sname+" from "+dept+" deportment"
								+ "</h1>"+"</body></html>");
				out.close();
			}
			else {
				out.println("<html><body bgcolor='yellow'>"
						+ "<h1> NO DATA FOUND!!!!!</h1>"+"</body></html>");
				out.close();
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		finally {
			if(rs!=null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
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
