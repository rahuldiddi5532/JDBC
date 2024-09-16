package org.jsp.psot1App;

import java.io.*;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.http.*;

public class FirstServlet extends HttpServlet 
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			                       throws ServletException, IOException 
	{
		String sid=req.getParameter("id");
		int id=Integer.parseInt(sid);
		
		String name=req.getParameter("nm");
		String dept=req.getParameter("dept");
		
		String sperc=req.getParameter("perc");
		double perc=Double.parseDouble(sperc);
		
		//presentation logic
		PrintWriter out=resp.getWriter();
		out.println("<html><body bgcolor='yellow'>"
				+ "<h1>Student name "+name+" from "+dept+"</h1>"
						+ "</body></html>");
		out.close();
		
		
		//presistnce-logic
		Connection con=null;
		PreparedStatement pstmt=null;
		String qry="insert into btm.students values(?,?,?,?)";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=admin");
			pstmt=con.prepareStatement(qry);
			pstmt.setInt(1,id);
			pstmt.setString(2,name);
			pstmt.setString(3,dept);
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
