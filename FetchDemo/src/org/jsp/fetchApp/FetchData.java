package org.jsp.fetchApp;

import java.sql.*;

public class FetchData 
{
	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String qry="select * from btm.student"; 
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=admin");
			
			pstmt=con.prepareStatement(qry);
			
			rs=pstmt.executeQuery();
			
			while(rs.next())
			{
//				int sid=rs.getInt(1);
//				String sname=rs.getString("name");
//				double sperc=rs.getDouble(3);
//				System.out.println("student id - "+sid);
//				System.out.println("student name - "+sname);
//				System.out.println("student percentage - "+sperc);
				
				System.out.println("Student id: "+rs.getInt(1));
				System.out.println("Student name: "+rs.getString("name"));
				System.out.println("Student percentage: "+rs.getDouble(3));
				System.out.println("----------------------------------");
			}
		}
		catch(ClassNotFoundException |SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			if(rs!=null)
			{
				try
				{
					rs.close();
				}
				catch(SQLException e)
				{
					e.printStackTrace();
				}
			}
			
			if(pstmt!=null)
			{
				try
				{
					pstmt.close();
				}
				catch(SQLException e)
				{
					e.printStackTrace();
				}
			}
			
			if(con!=null)
			{
				try
				{
					con.close();
				}
				catch(SQLException e)
				{
					e.printStackTrace();
				}
			}
			
		}
	}

}
