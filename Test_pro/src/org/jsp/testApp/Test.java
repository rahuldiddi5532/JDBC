package org.jsp.testApp;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Test 
{
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Load and Register the Driver Seucessfully!!...");
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		try {
			java.sql.Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=admin");
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}

}
