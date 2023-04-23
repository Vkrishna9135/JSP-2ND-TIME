package com.UI_Resourse;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.annotation.WebServlet.*;
@WebServlet("/fs");
public class FirstServ extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("nm");
		String place=req.getParameter("pl");
		
		PrintWriter out =resp.getWriter();
		out.println("<html><body bgcolor='yellow'>"
				+"<h1>User Details: "+name+"from "+place+"</h1>"
				+"</body></html>");
				out.close( );
				
		
	}
	
}
