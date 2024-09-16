package org.jsp.fetchApp;

import java.io.*;
//import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.*;
import javax.servlet.http.*;
public class Fetch_data extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException 
	{
		String sid=req.getParameter("id");
		int id=Integer.parseInt(sid);
		
		
		Connection con=null;
		PreparedStatement pstmt=null;
		String qry="select * from school.student where id=?";
		ResultSet rs=null;
		PrintWriter out=resp.getWriter();
//		out.println("<html><body bgcolor='red'>"
//		  		+ "<h1>Student name is rahul from department</h1>"
//		  				+ "</body></html>");
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=admin");
			pstmt=con.prepareStatement(qry);
			pstmt.setInt(1,id);
			rs=pstmt.executeQuery();
			
			if(rs.next())
			{
				String name=rs.getString("name");
				String dept=rs.getString("Dept");
//				System.out.println(name+","+dept);
			  out.println("<html><body bgcolor='red'>"
			  		+ "<h1>Student name is "+name+" from "+dept+" department</h1>"
			  				+ "</body></html>");
			}
			else
			{
				out.println("<html><body bgcolor='yellow'>"
				  		+ "<h1>Invalid id....!</h1>"
				  				+ "</body></html>");
			}
			
		} 
		catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}
		finally {
			try {
				if(rs!=null) rs.close();
				if(pstmt!=null) pstmt.close();
				if(con!=null) con.close();
			}
			catch(SQLException e)
			{
			  e.printStackTrace();
			}
//			out.close();
//			if(rs!=null)
//			{
//				try {
//					rs.close();
//				} 
//				catch(SQLException e) 
//				{
//					e.printStackTrace();
//				}
//			}
//			
//			if(pstmt!=null)
//			{
//				try {
//					pstmt.close();
//				} 
//				catch(SQLException e) 
//				{
//					e.printStackTrace();
//				}
//			}
//			
//			if(con!=null)
//			{
//				try {
//					con.close();
//				} 
//				catch (SQLException e) 
//				{
//					e.printStackTrace();
//				}
//			}
		}
		
	
	}

}
