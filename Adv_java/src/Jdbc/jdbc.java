package Jdbc;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//Exercise 1 : Write a program to create a table accountant with columns id,name. emailId and password.
//
//Exercise 2: Write a program to insert 2 records in accountant table .
//
//Exercise 3: Write a program to get the list of accountants from accountant table.
//
//Exercise 4 : Write a program to delete a accountant whose id = 405 from accountant table.
public class jdbc {
	private Connection con=null;
	public Connection c()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost/test2","root","P@ssword123");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	public void createtable()
	{
		
		try {	
			Statement stmt = (Statement) c().createStatement();
			String sql = "create table accountant" +
	                "(id INTEGER , " +
	                " name VARCHAR(30), " + 
	                " email VARCHAR(30), " + 
	                " password VARCHAR(30)";  

		          ((java.sql.Statement) stmt).executeUpdate(sql);
		         System.out.println("Created table in database...");   	  
		      } catch (SQLException e) {
		         e.printStackTrace();
		      } 
	}
	
	public static void main(String[] args) {
		jdbc j=new jdbc();
		j.createtable();
	}
}
