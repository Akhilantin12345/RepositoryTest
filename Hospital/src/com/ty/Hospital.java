package com.ty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Hospital 
{

	public static void main(String[] args) 
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hsp","root","root");
			Statement statement = connection.createStatement();
			statement.execute("insert into hsp values(100,'KLE')");
			statement.execute("insert into hsp values(101,'LakeView')");
			statement.execute("insert into hsp values(102,'Dakshata')");
			connection.close();
			System.out.println("Data Saved");
		} 
		catch (ClassNotFoundException | SQLException e) 
		{

			e.printStackTrace();
		}

	}

}
