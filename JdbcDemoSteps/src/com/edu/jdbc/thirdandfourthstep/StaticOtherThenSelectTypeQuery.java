package com.edu.jdbc.thirdandfourthstep;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StaticOtherThenSelectTypeQuery
{
   public static void main(String[] args)
   {
	   try
	   {
		 //step->1=>loading the driver second way
		  Class.forName("com.mysql.cj.jdbc.Driver");
		//step->2=>create or establish the connection by second way
		  String dburl ="jdbc:mysql://localhost:3306/adbe1?user=root&password=root";
          Connection con = DriverManager.getConnection(dburl);
        //issue the query---->static other than select
		  String query ="insert into student values(4,'mukesh','D',1999,53)";
		//create the statement
		  Statement stmt = con.createStatement( );
		//execute the query
		  int cont = stmt.executeUpdate(query);
		//check the query is executed or not
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

