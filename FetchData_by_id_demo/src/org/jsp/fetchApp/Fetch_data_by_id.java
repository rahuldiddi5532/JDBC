package org.jsp.fetchApp;
import java.sql.*;
import java.util.Scanner;
public class Fetch_data_by_id 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enete the id ");
		int sid=sc.nextInt();
		
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String qry="select * from btm.student where id=?";
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
		    
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=admin");
			
			pstmt=con.prepareStatement(qry);
			pstmt.setInt(1,sid);
			rs=pstmt.executeQuery();
			
			if(rs.next())
			{
				int id=rs.getInt(1);
				System.out.println("Student id : "+id);
				
				String name=rs.getString("name");
				System.out.println("Student name : "+name);
				
				double perc=rs.getDouble(3);
				System.out.println("Student percentage : "+perc);
				
			}
			else
			{
				System.err.println("Invalid id");
			}
		} 
		catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}
		finally
		{
			if(rs!=null)
			{
				try {
					rs.close();
				}
				catch (SQLException e) 
				{
				e.printStackTrace();
				}
			}
			if(pstmt!=null)
			{
				try {
					pstmt.close();
				}
				catch (SQLException e) 
				{
				e.printStackTrace();
				}
			}
			if(con!=null)
			{
				try {
					con.close();
				}
				catch (SQLException e) 
				{
				e.printStackTrace();
				}
			}
			sc.close();
		}
		
	}

}
