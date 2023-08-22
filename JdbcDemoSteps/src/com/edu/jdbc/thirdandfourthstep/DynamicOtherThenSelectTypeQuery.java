package com.edu.jdbc.thirdandfourthstep;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DynamicOtherThenSelectTypeQuery 
{
	static Scanner sc;
   public static void main(String[] args)
   {
     System.out.println("Enter the record by giving the below details");
     sc = new Scanner(System.in);
     System.out.println("enter the id");
     int id = sc.nextInt();
     System.out.println("enter the first name");
     String fname = sc.next();
     System.out.println("enter the last name");
     String lname = sc.next();
     System.out.println("enter the date of birth");
     int dob = sc.nextInt();
     System.out.println("enter the mark");
     double marks = sc.nextDouble();
     
     try
      {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String dburl = "jdbc:mysql://localhost:3306/adbe1?user=root&password=root";
		Connection con = DriverManager.getConnection(dburl);
		String query = "insert into student values(?,?,?,?,?)";
		PreparedStatement pstmt = con.prepareStatement(query);
		pstmt.setInt(1, id);
		pstmt.setString(2, fname);
		pstmt.setString(3,lname);
		pstmt.setInt(4, dob);
		pstmt.setDouble(5,marks);
		
		int cont = pstmt.executeUpdate();
		
		if(cont>0)
	      {
		    System.out.println("data inserted successfully");
	      }
	   else
    	 {
	       System.out.println("data inserted failed");
	     }
	  } 
     catch (ClassNotFoundException | SQLException e) 
      {
		e.printStackTrace();
	  }
     
     
   }
   
}
