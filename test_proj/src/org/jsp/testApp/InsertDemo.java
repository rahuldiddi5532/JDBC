package org.jsp.testApp;

import java.sql.*;
public class InsertDemo 
{
	public static void main(String[] args) {
		 Connection con=null;
		 Statement stmt=null;
//		 String qry1="insert into btm.student values(101,'rupesh',35.45)";//DML
		 String qry2="insert into btm.student values(102,'jay',45.56)";//DML
		 String qry3="insert into btm.student values(103,'sushma',56.78)";//DML
		 try
		 {
			 Class.forName("com.mysql.jdbc.Driver");
			 System.out.println("Driver Class is loaded sucessfully!");
			 
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=admin");
			 System.out.println("Connection established with the Database...");
			 
			 stmt=con.createStatement();
			 System.out.println("Platform Created sussfully!");
//			 stmt.execute(qry1);
			 stmt.execute(qry2);
			 stmt.execute(qry3);
			 System.out.println("Record Inserted!");
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
