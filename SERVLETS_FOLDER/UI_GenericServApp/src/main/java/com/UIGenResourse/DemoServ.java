package com.UIGenResourse;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.*;
public class DemoServ extends GenericServlet{
	public static void main(String[] args) {
	}
	@Override
	public void service(ServletRequest req, ServletResponse resp) 
			throws ServletException, IOException {
		String name=req.getParameter("nm");
		String place=req.getParameter("pl");
		PrintWriter out=resp.getWriter();
		out.println("<html><body bgcolor='orange'>"+"<h1>user details: "+name+" from "+place+"</h1>"+"</body></html>");
		out.close();
	}
}
