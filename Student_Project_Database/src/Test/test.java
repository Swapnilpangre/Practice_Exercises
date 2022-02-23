package Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class test {
	private Connection con;
	Scanner sc =new Scanner(System.in);
	public Connection c()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.ConnectionImpl");
			con=DriverManager.getConnection("jdbc:mysql://localhost/Student_Project","root","P@ssword123");
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}

	//1. Display list of all student .
	public void displaystudent()
	{
		try
		{
		    java.sql.Statement selectStmt = c().createStatement();
		    ResultSet rs = ((java.sql.Statement) selectStmt).executeQuery("SELECT * FROM Student");
		    while(rs.next()) { 
		    	System.out.print("st_no : "+rs.getString(1)+"\t");
		    	System.out.print("st_name : "+rs.getString(2)+"\t");
		    	System.out.print("st_dob : "+rs.getDate(3)+"\t");
		    	System.out.print("st_doj : "+rs.getDate(4)+"\n");
		    }    
		}
		catch(Exception e){e.printStackTrace();}
		
	}
	//2. Display list of all projects.
	public void displayproject()
	{
		try
		{
		    java.sql.Statement selectStmt = c().createStatement();
		    ResultSet rs = ((java.sql.Statement) selectStmt).executeQuery("SELECT * FROM Project");
		    while(rs.next()) { 
		    	System.out.print("prj_no : "+rs.getString(1)+"\t");
		    	System.out.print("prj_name : "+rs.getString(2)+"\t");
		    	System.out.print("prj_dur : "+rs.getInt(3)+"\t");
		    	System.out.print("prj_platform : "+rs.getString(4)+"\n");
		    }    
		}
		catch(Exception e){e.printStackTrace();}
		
	}
	//3. Display the number of students who are working on project “P01”.
	public void projectworkstud()
	{
		try
		{
			
			
			String sql =("SELECT st_no,st_name from Student join StudentProject on  Student. st_no = StudentProject.st_no join Project on Project. prj_no=StudentProject.prj_no where Project. prj_no=?");
			PreparedStatement st= c().prepareStatement(sql);
			st.setString(1, "P01");
			ResultSet rs=st.executeQuery();
			int count=0;
			while(rs.next()) { 
		    	System.out.print("st_no : "+rs.getString(1)+"\t");
		    	System.out.print("st_name : "+rs.getString(2)+"\n");
		    	count++;
			}
			System.out.println("number of students who are working on project P01 : "+count); 
		}
		catch(Exception k){k.printStackTrace();}
			
	
	}
	//4. Display number of students who participated in more than one project.
	public void groupby()
	{
		try
		{
		    java.sql.Statement selectStmt = c().createStatement();
		    ResultSet rs = ((java.sql.Statement) selectStmt).executeQuery("select st_no,count(st_no) from StudentProject group by st_no having count(prj_no)>1");
		    while(rs.next()) { 
		    	System.out.print("st_no : "+rs.getString(1)+"\t");
		    	System.out.print("count : "+rs.getInt(2)+"\n");
		  
		    }    
		}
		catch(Exception e){e.printStackTrace();}
	}
	//5. Find number of students who did not participate in any project.
	public void nullproject()
	{
		try
		{
			
			java.sql.Statement selectStmt = c().createStatement();
		    ResultSet rs = ((java.sql.Statement) selectStmt).executeQuery("SELECT * from Student as s left join StudentProject as sp on  s. st_no = sp.st_no where prj_no is null");
			
			while(rs.next()) { 
		    	System.out.print("st_no : "+rs.getString(1)+"\t");
		    	System.out.print("st_name : "+rs.getString(2)+"\n");
		    }   
		}
		catch(Exception k){k.printStackTrace();}
	}
	//6. Display the information (no,name,age) of student  who made the project in java.
	public void findage()
	{

		try
		{
			String sql =("SELECT st_no,st_name,YEAR(CURRENT_DATE)-YEAR(Student.st_dob) AS ageInYears from Student join StudentProject on  Student. st_no = StudentProject.st_no join Project on Project. prj_no=StudentProject.prj_no where Project.prj_platform=?");
			PreparedStatement st= c().prepareStatement(sql);
			st.setString(1, "JAVA");
			ResultSet rs=st.executeQuery();
		    while(rs.next()) { 
		    	System.out.print("st_no : "+rs.getString(1)+"\t");
		    	System.out.print("st_name : "+rs.getString(2)+"\t");
		    	System.out.print("Age : "+rs.getInt(3)+"\n");
		    }    
		}
		catch(Exception e){e.printStackTrace();}

	}
	//7. Display the student information who is a programmer.
	public void findprogramer()
	{
		try
		{
			String sql =("SELECT * from Student join StudentProject on  Student. st_no = StudentProject.st_no join Project on Project. prj_no=StudentProject.prj_no where StudentProject.designation=?");
			PreparedStatement st= c().prepareStatement(sql);
			st.setString(1, "PROGRAMMER");
			ResultSet rs=st.executeQuery();
		    while(rs.next()) { 
		    	System.out.print("st_no : "+rs.getString(1)+"\t");
		    	System.out.print("st_name : "+rs.getString(2)+"\t");
		    	System.out.print("designation : "+rs.getString(7)+"\t");
		    	System.out.print("prj_platform : "+rs.getString(11)+"\n");
		    }    
		}
		catch(Exception e){e.printStackTrace();}
	}
    //8.	Display the student who played the max designation(e.g. manager,programmer) in the same project.
	
	public void maxdesignation()
	{
		try
		{
		    java.sql.Statement selectStmt = c().createStatement();
		    ResultSet rs =  ((java.sql.Statement) selectStmt).executeQuery("SELECT st_no,prj_no,designation from StudentProject where designation=(select max(designation) from StudentProject)");
		    while(rs.next()) { 
		    	System.out.print("st_no : "+rs.getString(1)+"\t");
		    	System.out.print("st_name : "+rs.getString(2)+"\t");
		    	System.out.print("st_dob : "+rs.getDate(3)+"\t");
		    	System.out.print("st_doj : "+rs.getDate(4)+"\t");
		    	System.out.print(" prj_no : "+rs.getString(6)+"\t");
		    	System.out.print("designation : "+rs.getString(7)+"\t");
		    	System.out.print(" prj_name : "+rs.getString(9)+"\t");
		    	System.out.print(" prj_dur : "+rs.getInt(10)+"\t");
		    	System.out.print("prj_platform : "+rs.getString(11)+"\n");
		    }    
		}
		catch(Exception e){e.printStackTrace();}
	}
	
	//9. Display details of the youngest student.
	public void youngest()
	{
		try
		{
		    java.sql.Statement selectStmt = c().createStatement();
		    ResultSet rs =  ((java.sql.Statement) selectStmt).executeQuery("SELECT * from Student join StudentProject on  Student. st_no = StudentProject.st_no join Project on Project. prj_no=StudentProject.prj_no where Student.st_dob=(SELECT max(Student.st_dob) FROM Student)");
		    while(rs.next()) { 
		    	System.out.print("st_no : "+rs.getString(1)+"\t");
		    	System.out.print("st_name : "+rs.getString(2)+"\t");
		    	System.out.print("st_dob : "+rs.getDate(3)+"\t");
		    	System.out.print("st_doj : "+rs.getDate(4)+"\t");
		    	System.out.print(" prj_no : "+rs.getString(6)+"\t");
		    	System.out.print("designation : "+rs.getString(7)+"\t");
		    	System.out.print(" prj_name : "+rs.getString(9)+"\t");
		    	System.out.print(" prj_dur : "+rs.getInt(10)+"\t");
		    	System.out.print("prj_platform : "+rs.getString(11)+"\n");
		    }    
		}
		catch(Exception e){e.printStackTrace();}
	}
	//10. Display the info of the student who participated in the project where total no of the student should be exact three.
	public void studentwithproject()
	{
		//SELECT * from Student join StudentProject on  Student. st_no = StudentProject.st_no join Project on Project. prj_no=StudentProject.prj_no
		try
		{
		    java.sql.Statement selectStmt = c().createStatement();
		    ResultSet rs =  ((java.sql.Statement) selectStmt).executeQuery("SELECT * from Student join StudentProject on  Student. st_no = StudentProject.st_no join Project on Project. prj_no=StudentProject.prj_no");
		    while(rs.next()) { 
		    	System.out.print("st_no : "+rs.getString(1)+"\t");
		    	System.out.print("st_name : "+rs.getString(2)+"\t");
		    	System.out.print("st_dob : "+rs.getDate(3)+"\t");
		    	System.out.print("st_doj : "+rs.getDate(4)+"\t");
		    	System.out.print(" prj_no : "+rs.getString(6)+"\t");
		    	System.out.print("designation : "+rs.getString(7)+"\t");
		    	System.out.print(" prj_name : "+rs.getString(9)+"\t");
		    	System.out.print(" prj_dur : "+rs.getInt(10)+"\t");
		    	System.out.print("prj_platform : "+rs.getString(11)+"\n");
		    }    
		}
		catch(Exception e){e.printStackTrace();}
	}
	public static void main(String[] args) {
		test t=new test();
		t.displaystudent(); 
		t.displayproject();
		t.projectworkstud();
		t.nullproject();
		t.findage();
		t.groupby();
		t.maxdesignation();
		t.findprogramer();
		t.youngest();
		t.studentwithproject();
	}
}
