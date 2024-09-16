package org.jsp.postApp;
import java.io.*;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.http.*;

//import com.mysql.jdbc.*;
@SuppressWarnings("serial")
public class studentsServlet extends HttpServlet
{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
    		throws ServletException, IOException 
    {
    	//fetching the date from the UI
    	String sid=req.getParameter("id");
    	String name=req.getParameter("nm");
    	String dept=req.getParameter("dept");
    	String sperc=req.getParameter("perc");
    	
    	//presentation logic
    	PrintWriter out=resp.getWriter();
    	out.println("<html><body bgcolor='blue'>"
    			+ "<h1>Student name is "+name+" from "+dept+" departement</h1>"
    					+ "</body></html>");
    	out.close();
    	
    	//presistance logic
    	Connection con=null;
    	PreparedStatement pstmt=null;
    	
    	
//    	double perc=Double.parseDouble(sperc);
    	
    	String qry="insert into btm.students values (?,?,?,?)";
    	
    	try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=admin");
			pstmt=con.prepareStatement(qry);
			int id=Integer.parseInt(sid);
			pstmt.setInt(1,id);
			
			pstmt.setString(2, name);
			
			pstmt.setString(3,dept);
			
			double perc=Double.parseDouble(sperc);
			pstmt.setDouble(4,perc);
			
			pstmt.executeUpdate();
			
		} 
    	catch (ClassNotFoundException | SQLException e) 
    	{
			e.printStackTrace();
		}
    	finally
    	{
    		if(pstmt!=null)
    		{
    			try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
    		}
    		
    		if(con!=null)
    		{
    			try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
    		}
    	}
    	
    }
}
