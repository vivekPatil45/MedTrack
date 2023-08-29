package com.medtrack.db;
import java.sql.*;

public class ConnectDB 
{
	static Connection con=null;
	public static Connection connect()
	{
		if(con==null)
		{
			try 
			{
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/med_db","root","");
				System.out.println("Connection establishedd..........");
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return con;	
	}
}
