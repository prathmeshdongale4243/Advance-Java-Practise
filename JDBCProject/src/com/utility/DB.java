package com.utility;
import java.sql.DriverManager;
import java.sql.*;

public class DB 
{
	private static final String url="jdbc:mysql://localhost:3306/PractiseJDBC";
	private static final String username="root";
	private static final String password="Prathmesh@11";
	
	public static Connection CreateDBcon() 
	{
		Connection con=null;
		try {
			//load the JDBC Driver 
			Class.forName("com.mysql.cj.jdbc.Driver");
			//
			 con=DriverManager.getConnection(url,username,password);
		}
		catch(Exception e) {
			
			System.out.println("Exception ="+e.getMessage());
		}
		return con;	
	}

}
