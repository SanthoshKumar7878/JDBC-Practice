package com.edu.jdbc.thirdandfourthstep;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StaticSelectTypeQuery
{
   public static void main (String[] args)
   {
	   try
	   {
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 String dburl = "jdbc:mysql://localhost:3306/adbe1?user=root&password=root";
		 Connection con = DriverManager.getConnection(dburl);
		 String query ="select * from student";
		 Statement stmt = con.createStatement();
		 ResultSet rs= stmt.executeQuery(query);
		 while(rs.next() )
		 {
			 int id = rs.getInt(1);
			 String fname = rs.getString(2);
			 String lname = rs.getString(3);
			 int dob = rs.getInt(4);
			 double marks = rs.getDouble(5);
			 System.out.println(id+"  "+fname+"  "+lname+"  "+dob+"  "+marks);
		 }
	   } 
	   catch (ClassNotFoundException | SQLException e) 
	   {
		 e.printStackTrace();
	   }
   }
}
