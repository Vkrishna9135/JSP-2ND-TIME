package org.btm.FirstServlet;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
@WebServlet("/fs")

public class FirstServlet extends GenericServlet {
	public static void main(String[] args) {
	}
	@Override
	public void init() throws ServletException {
		System.out.println(" intialization is done to the object ");
	}
	@Override
	public void service(ServletRequest req, ServletResponse resp) 
			throws ServletException, IOException {
		String Firstname=req.getParameter("fnm");
		String Lastname=req.getParameter("lnm");
		String email=req.getParameter("eml");
		//PRESENTATION LOGIC..............
		PrintWriter out=resp.getWriter();
		out.println("<html><body bgcolor='orange'> "
				+ "<h1>User Details :"
				+Firstname+Lastname+" form tadipatri and my email address :"
						+email+" !    ThankYou"
								+ "</body></html>");
		out.close();
		System.out.println("service method is execited ");
	}
	@Override
	public void destroy() {
		System.out.println(" close costly re-sourses");
	}

}
