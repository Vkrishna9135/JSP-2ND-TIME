package Org.jsp.FirstServlet_1;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
@WebServlet(urlPatterns = "/fs",loadOnStartup = 5)

public class FirstServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse resp)
			throws ServletException, IOException {
		String FirstName=req.getParameter("fn");
		String LastName=req.getParameter("ln");
		String Email=req.getParameter("eml");
		String State=req.getParameter("st");
		
		PrintWriter out=resp.getWriter();
		out.println("<html><body bgcolor='orange'> "
				+ "<h1>User Details: "
				+FirstName+""+LastName+" my contact details "
						+Email+ " from"+State+"</body></html>");
		out.close();
		
		
		
		
	}

}
