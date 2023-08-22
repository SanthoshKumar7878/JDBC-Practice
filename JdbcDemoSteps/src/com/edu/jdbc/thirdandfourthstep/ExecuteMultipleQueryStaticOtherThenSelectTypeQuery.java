package com.edu.jdbc.thirdandfourthstep;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ExecuteMultipleQueryStaticOtherThenSelectTypeQuery 
{
   public static void main(String[]args)
   {
	   try
	     {
		   Class.forName("com.mysql.cj.jdbc.Driver");
		   String dburl = "jdbc:mysql://localhost:3306/adbe1?user=root&password=root";
		   Connection con = DriverManager.getConnection(dburl);
		   String query1 = "insert into student values(6,'ravi','d',1994,76)";
		   String query2 = "delete from student where marks=55";
		   String query3 = "update student set marks=57 where id=3";
		   Statement stmt = con.createStatement();
		   
		   stmt.addBatch(query1);
		   stmt.addBatch(query2);
		   stmt.addBatch(query3);
		   
		   int a[] = stmt.executeBatch();
		   
		   for(int i : a)
		     {
			    System.out.println(i);
		     }
	     }
	   catch (ClassNotFoundException | SQLException e) 
	     {
	     	e.printStackTrace();
	     }
	   
   }
}
