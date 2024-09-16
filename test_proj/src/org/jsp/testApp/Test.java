package org.jsp.testApp;

import java.sql.*;

public class Test 
{
    public static void main(String[] args) {
	 Connection con=null;
	 try
	 {
		 Class.forName("com.mysql.jdbc.Driver");
		 System.out.println("Driver Class is loaded sucessfully!");
		 
		 con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=admin");
		 System.out.println("Connection established with the Database...");
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
			 
			 System.out.println("Costly resources closed successfully.....");
		 }
	 }
	 
	}
}
