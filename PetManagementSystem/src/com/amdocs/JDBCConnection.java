package com.amdocs;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCConnection {
//	public static Connection con;
	public static Connection getConnection() {
		Connection con;
		try
		{  
//			Class.forName("com.mysql.cj.jdbc.Driver");  
			con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/ProjectDB","root","admin");  
			//here sonoo is database name, root is username and password  
			return con;
		}
		catch(Exception e)
		{ System.out.println(e);
		}  
		return null;
	}
}
