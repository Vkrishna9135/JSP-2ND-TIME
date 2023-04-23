package org.com.RegisterServlet;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
@WebServlet("/fs")


public class RegisterServlet extends GenericServlet  {
	@Override
	public void init() throws ServletException {
		System.out.println("Object is intialized");
	}
	@Override
	public void service(ServletRequest req, ServletResponse resp)
			throws ServletException, IOException {
		String name=req.getParameter("nm");
		String place=req.getParameter("pl");
		
		PrintWriter out=resp.getWriter();
		out.println("<html><body bgcolor='pink'>"
				+ "<h1> I m "
				+name+ " from "+place);
		out.close();
		System.out.println("service method is executed ");
	}
 
	
	

}
