package com.edu.jdbc.thirdandfourthstep;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DynamicSelectTypeQuery
{
	static Scanner sc;
   public static void main(String[]args)
   {
	   System.out.println("enter the id valur");
	   sc = new Scanner(System.in);
	   int id = sc.nextInt();
	   try
	    {
		  Class.forName("com.mysql.cj.jdbc.Driver");
		  String dburl = "jdbc:mysql://localhost:3306/adbe1?user=root&password=root";
		  Connection con = DriverManager.getConnection(dburl);
		  String query = "select * from student where id=?";
		  PreparedStatement pstmt = con.prepareStatement(query);
		  
		  pstmt.setInt(1 , id );
		  
		  ResultSet rs = pstmt.executeQuery();
		 if(rs.next())
		    {
		     	  int id1 = rs.getInt(1);
			      String fname = rs.getString(2);
			      String lname = rs.getString(3);
			      int dob = rs.getInt(4);
			      double marks = rs.getDouble(5);
			  
			      System.out.println(id1+"  "+fname+"  "+lname+"  "+dob+"  "+marks);
		    }
		 else 
		   {
			 System.out.println("no data found.......");
		   }
	    }
	   catch (ClassNotFoundException | SQLException e) 
	    {
		   e.printStackTrace();
	    }
	}
}
