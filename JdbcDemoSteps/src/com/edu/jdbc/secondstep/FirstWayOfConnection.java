package com.edu.jdbc.secondstep;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class FirstWayOfConnection 
{
  public static void main(String[] args)
  {
	  try 
	  {
		//step->1=>loading the driver second way
		Class.forName("com.mysql.cj.jdbc.Driver");
		//step->1=>create or establish the connection by first way
		String dburl="jdbc:mysql://localhost:3306/adbe1?user=root&password=root";
		Connection con = DriverManager.getConnection(dburl);
		if(con!=null)
		{
			System.out.println("connection done...");
		}
		else
		{
			System.out.println("connection failed....try again...");
		}
	  } 
	  catch (ClassNotFoundException | SQLException e) 
	  {
		e.printStackTrace();
	  }
  }
}
