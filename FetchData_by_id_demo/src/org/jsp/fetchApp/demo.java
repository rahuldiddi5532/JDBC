package org.jsp.fetchApp;
import java.sql.*;
import java.util.Scanner;
public class demo
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter id");
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
			pstmt.setInt(1, sid);
			rs=pstmt.executeQuery();
			
			if(rs.next())
			{
				String sname=rs.getString(2);
				System.out.println("Student name "+sname);
				
				double sprc=rs.getDouble(3);
				System.out.println("Student percentage "+sprc);
			}
			else
			{
				System.err.println("Invalid id...!");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		finally
		{
			if(rs!=null)
			{
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
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
			
			sc.close();
		}
	}
	
}