package JDBCTesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class T {
	static Connection con;
	Scanner sc=new Scanner(System.in);
	T()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost/JDBCTest","root","P@ssword123");
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	// Write a java program to update the bank table with column ("Accountant","AccountantBal") using resultSet object.
	public void Ex1()
	{
	
		Statement st;
		int result = 0;
		try {
			st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			//String sql = ("Create table bank (Acc VARCHAR (25) not null, AccBal int (10) not null)"); 
			String sql = ("alter table bank rename  column Acc to Accountant , rename column AccBal to AccountantBal ");
			result = st.executeUpdate(sql);
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (result > 0) 
			System.out.println(result + ": records affected ");
		else
			System.out.println("Entry compited");

		
	}
//	Exercise 2 : Write a JAVA program to insert 5 records in BANK table with
//	column ("AccountNo","AccountBal")  using prepared statement.
	public void Ex2()
	{ 
		for(int i=1;i<5;i++)
		{
			System.out.println("Enter a  AC name");
			String name = sc.next();
			System.out.println("Enter Ac bal");
			int bal = sc.nextInt();
			int rowsInserted = 0;
			try {
				String sql = ("insert into bank values(?,?)");
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, name);
				ps.setInt(2, bal);
				rowsInserted = ps.executeUpdate();
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			if (rowsInserted > 0)
				System.out.println("data inserted succcessfully");
		}
		
	}
	//Exercise 3 : Write a JAVA program to update the records in BANK table using Statement.executeUpdate().
	public void Ex3()
	{
		try {
			String sql = ("update bank set Accountant=?,AccountantBal=? where Accountant=?");
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, "gopal");
			ps.setInt(2, 1000);
			ps.setString(3, "gopal");
			ps.executeUpdate();
			System.out.println("record is update");
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
//	Exercise 4 : Write a JAVA program to get  connection object using hostname , user,password stored in external properties file.
	public void Ex4()
	{
		String hostname="jdbc:mysql://localhost/JDBCTest";
		String user="root";
		String password="P@ssword123";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection(hostname,user,password);
			if(c != null)
				System.out.println("connection success");
			c.close();
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	//Exercise 5: Write a Java program to create  a table  countries including columns country_id,country_name and region_id .
	public void Ex5()
	{
		try {
			Statement st = con.createStatement();

			String sql = ("Create table countries(CountryId int not null,CountryName varchar(20) not null,regionId int not null,primary key(CountryId))");
			st.executeUpdate(sql); 
			System.out.println("Table created");
			con.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
	//Exercise 6 : Write a Java program to  alter table countries inclurcarding columns country_id,country_name and region_id  to add a column region_id .
	public void Ex6()
	{
		try {

			Statement st = con.createStatement();
			String sql = ("alter table countries add regionname  varhcar(20) null");
			st.executeUpdate(sql);
			System.out.println("Successfully alter table");
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}
	//Exercise 7 : Write a Java program  to insert a record with values taken from user into the table countries against 
	//each columns using prepared statement. We can use a string array to store our own values.
	public void Ex7()
	{
		System.out.println("Enter country Id");
		int CId = sc.nextInt();
		System.out.println("Enter country name");
		String Cname = sc.next();
		System.out.println("Enter region Id name");
		int RId = sc.nextInt();
		System.out.println("Enter region name");
		String Rname = sc.next();
		
		try {
			String sql = ("insert into countries (CountryId,CountryName,regionId,regionName)values (?,?,?,?)");
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, CId);
			ps.setString(2, Cname);
			ps.setInt(3, RId);
			ps.setString(4, Rname);
			int a= ps.executeUpdate();
			System.out.println(a);
			if(a>0)
				System.out.println("record inserted successfully");
		}
		catch (SQLException e) {

			e.printStackTrace();
		}

	}
	public static void main(String[] args) {
		
		T t=new T();
		t.Ex1();
		t.Ex2();
		t.Ex3();
		t.Ex4();
		t.Ex5();
		t.Ex6();
		t.Ex7();
	}

}
