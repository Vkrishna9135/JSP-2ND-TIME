package org.jspider.jdbc;
import java.sql.*;
import com.mysql.cj.protocol.Resultset;

public class FetchData {
	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String query="SELECT * FROM btm.employee";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			try {
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&&password=Admin@123");
				pstmt=con.prepareStatement(query);
				rs=pstmt.executeQuery();
				
				while(rs.next()) {
					int id=rs.getInt("eid");
					String name=rs.getString(2);
					System.out.println("id ="+id+"name :"+name);
				}
				}
				
				
				
			} catch (ClassNotFoundException|SQLException e) {
			
				e.printStackTrace();
			}
			finally {
				if(rs!=null) {
					rs.close();
				}
				
			}}
	}
			
			
		
