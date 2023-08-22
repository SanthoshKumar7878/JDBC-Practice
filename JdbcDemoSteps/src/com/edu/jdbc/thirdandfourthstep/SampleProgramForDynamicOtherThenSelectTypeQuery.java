package com.edu.jdbc.thirdandfourthstep;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class SampleProgramForDynamicOtherThenSelectTypeQuery 
{
	static Scanner sc;
   public static void main(String []args)
   {
	   sc = new Scanner(System.in);
	   System.out.println("Enter student id");
	   int id = sc.nextInt();
	   System.out.println("Enter student new marks");
	   double marks = sc.nextDouble();
	   try
	     {
	     	Class.forName("com.mysql.cj.jdbc.Driver");
	     	String dburl = "jdbc:mysql://localhost:3306/adbe1?user=root&password=root";
	     	Connection con = DriverManager.getConnection(dburl);
	     	String queruy = "update student set marks=? where id=?";
	     	PreparedStatement pstmt = con.prepareStatement(queruy);
	     	pstmt.setDouble(1, marks);
	     	pstmt.setInt(2, id);
	     	int count = pstmt.executeUpdate();
	     	
	     	if(count!=0)
	     	{
	     		System.out.println("Updation data is successfully");
	     	}
	     	else
	     	{
	     		System.out.println("updation is failed");
	     	}
	     } 
	   catch (ClassNotFoundException | SQLException e)
	     {
			e.printStackTrace();
	     }
   }
}
