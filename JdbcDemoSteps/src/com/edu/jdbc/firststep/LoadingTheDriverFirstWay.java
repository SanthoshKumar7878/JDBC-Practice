package com.edu.jdbc.firststep;

import java.sql.SQLException;

public class LoadingTheDriverFirstWay 
{
   public static void main(String[] args)
   {
	   //step->1=>loading the driver first way
	   try
	   {
		 java.sql.Driver driver = new com.mysql.jdbc.Driver();
		 java.sql.DriverManager.registerDriver(driver);
		 System.out.println("loading the driver first way done....");
	   }
	   catch (SQLException e)
	   {
		 e.printStackTrace();
	   }
   }
}
