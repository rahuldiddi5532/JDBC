package org.jsp.testApp;
import java.sql.*;
public class InsertDemo 
{ public static void main(String[] args) {
	
   Connection con=null;
   PreparedStatement pstmt=null;
   String qry="insert into beng.emp values (?,?,?)";
   try
   {
	   Class.forName("com.mysql.jdbc.Driver");
	   con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=admin");
	   
	   pstmt=con.prepareStatement(qry);
//	   //setting the values to the place holders
//	   pstmt.setInt(1,101);
//	   pstmt.setString(2,"Rahul");
//	   pstmt.setDouble(3,25.20);
//	   //executing the query
//	   pstmt.executeUpdate();
//	   
	   //setting the values to the place holders
	   pstmt.setInt(1,102);
	   pstmt.setString(2,"Basu");
	   pstmt.setDouble(3,56.20);
	   //executing the query
	   pstmt.executeUpdate();

	   
   }
   catch(ClassNotFoundException |SQLException e)
   {
	   e.printStackTrace();
   }
   finally
   {
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
