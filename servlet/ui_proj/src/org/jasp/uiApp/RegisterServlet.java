package org.jasp.uiApp;
import java.io.*;
import javax.servlet.*;
public class RegisterServlet extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException 
	{//fetching data from UI/From
		String name=req.getParameter("nm");
		String place=req.getParameter("pl");
		
		
		//presentation logic
		PrintWriter out=resp.getWriter();
		out.println("<html><body bgcolor='yellow'>"
				+ "<h1>Student name is "+name+" from "+place+"</h1>"
						+ "</body></html>");
		out.close();
	}

}
