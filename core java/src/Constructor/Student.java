/*Exercise 1. Write a program to print the names of students by creating 
 * a Student class. If no name is passed while creating an object of 
 * Student class, then the name should be "Unknown", otherwise the name 
 * should be equal to the String value passed while creating object of 
 * Student class.*/
package Constructor;

public class Student {
	private String Name;
	Student()
	{
		Name="Gopal";
		System.out.println(Name);
	}

	public static void main(String[] args) {
		Student s=new Student();
		
	}

}
