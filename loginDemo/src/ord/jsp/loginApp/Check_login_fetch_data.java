package ord.jsp.loginApp;
import java.sql.*;
import java.util.Scanner;

public class Check_login_fetch_data 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name...");
		String nm=sc.next();
		
		System.out.println("Enter password...");
		String pw=sc.next();
		
		
	Connection con=null;
	PreparedStatement pstmt=null;
	ResultSet rs=null;
	
	String qry="select username from btm.user where name=? and password=?";
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=admin");
			
			pstmt=con.prepareStatement(qry);
			
			pstmt.setString(1,nm);
			
			pstmt.setString(2,pw);
			
			rs=pstmt.executeQuery();
			
			if(rs.next())
			{
				String uname=rs.getString("username");//use 1 not 3
				System.out.println("User_name = "+uname);
				System.out.println("Welcome to JDBCf");
			}
			else
			{
				System.err.println("Invalid name or password...!");
			}
		} 
		catch (ClassNotFoundException | SQLException e) {
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
