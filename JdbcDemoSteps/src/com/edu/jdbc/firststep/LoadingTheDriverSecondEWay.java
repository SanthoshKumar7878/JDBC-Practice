package com.edu.jdbc.firststep;

public class LoadingTheDriverSecondEWay
{
	public static void main(String[] args)
	{
		//step->1=>loading the driver second way
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("loading the driver second way done....");
		} 
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	}
}
