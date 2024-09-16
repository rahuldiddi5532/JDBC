package org.jsp.testApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateDemo 
{
	public static void main(String[] args) 
	{
		 Connection con=null;
		 Statement stmt=null;
		 String qry="update btm.student set name='Ramesh' where id=102";//DML
		 try
		 {
			 Class.forName("com.mysql.jdbc.Driver");
			 System.out.println("Driver Class is loaded sucessfully!");
			 
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=admin");
			 System.out.println("Connection established with the Database...");
			 
			 stmt=con.createStatement();
			 System.out.println("Platform Created sussfully!");
			 stmt.execute(qry);
			 System.out.println("Record Updated``za!");
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
					 con.close();
				 }
				 catch(SQLException e)
				 {
					 e.printStackTrace();
				 }
			 }
				 
				 System.out.println("Costly resources closed successfully.....");
			 }
		 }
		

}
