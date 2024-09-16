package org.jsp.testApp;
import java.sql.*;
public class Test2 
{
	public static void main(String[] args) {
		Connection con=null;
		Statement stmt=null;
		String qry2="insert into rahul.student values(102,'ram',81.21)";
		
//		String qry3="update rahul.student set name='rajaram' where id=102";
//		String qry4="delete from rahul.student where id=102";
	try
	{
	  Class.forName("com.mysql.jdbc.Driver");	
	  System.out.println("Driver load and registord successfully...!");
	  
	  con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=admin");
	  System.out.println("Connection established between Java-app and Database server.");
	   
	  stmt=con.createStatement();
	  stmt.execute(qry2);
//	  stmt.executeUpdate(qry3);
//	  stmt.execute(qry4);
	  
	}
	catch(ClassNotFoundException |SQLException e)
	{
		e.printStackTrace();
	}
	finally
	{
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
		
		if(stmt!=null)
		{
			try
			{
				stmt.close();
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		}
		System.out.println("Costly resources closed sucessfully..!");
	}
	}
	
}
