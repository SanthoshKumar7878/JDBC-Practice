package com.edu.jdbc.secondstep;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
public class ThirdWayOfConnection
{
    public static void main(String[] args)
    {
    	try 
    	 {
    		//step->1=>loading the driver second way
			Class.forName("com.mysql.cj.jdbc.Driver");
			//step->2=>create or establish the connection by third way
			File f=new File("./credentials/configuration.properties");//path of the file
			FileReader reader = new FileReader(f);
			Properties prop = new Properties();
			prop.load(reader);
			String dburl=prop.getProperty("dburl");
			Connection con =DriverManager.getConnection(dburl,prop);
			//check the connection
			if(con!= null)
			{
				System.out.println("Connection done...");
			}
			else
			{
				System.out.println("Connection failed...");
			}
		 } 
    	catch (ClassNotFoundException | IOException | SQLException e)
    	 {
			e.printStackTrace();
		 }
    }
}
