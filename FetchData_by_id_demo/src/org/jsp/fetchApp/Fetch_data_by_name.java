package org.jsp.fetchApp;
import java.sql.*;
import java.util.Scanner;
public class Fetch_data_by_name 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter the name ");
		String sname=sc.next();
		
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String qry="select * from btm.student where name=?";
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=admin");
			
			pstmt=con.prepareStatement(qry);
			
			pstmt.setString(1,sname);
			rs=pstmt.executeQuery();
			
			if(rs.next())
			{
				int sid=rs.getInt(1);
				System.out.println("Student id : "+sid);
				
				double sprc=rs.getDouble(3);
				System.out.println("Student percentage : "+sprc);
			}
			else
			{
				System.err.println("Invalid Name...!");
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
				try 
				{
					rs.close();
				} 
				catch (SQLException e) 
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
				catch (SQLException e) 
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
				catch (SQLException e) 
				{
					e.printStackTrace();
				}
			}
			sc.close();
		}
		
	}

}
