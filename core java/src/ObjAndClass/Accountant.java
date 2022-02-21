package ObjAndClass;

import java.util.Scanner;

/*Practice Exercise 4 : Write a program to create a Accountant class
 *  with parameters name , emailId and contactNo. Write a method to 
 *  view all the accountants information.

eg. Accountant Ravi has mail id ravi@gmail.com and 
contact No 9867785694 . Accountant Rutuja has mail id 
rutuja@gmail.com and contact No 9987565634.*/
public class Accountant {
	private String Name,Email;
	private int Contact;
	Scanner sc=new Scanner(System.in);
	public void setdata()
	{
		System.out.println("enter name");
		Name=sc.nextLine();
		System.out.println("enter email");
		Email=sc.next();
		System.out.println("enter contact no");
		Contact=sc.nextInt();
	}
	public void display()
	{
		System.out.println("Name = "+this.Name);
		System.out.println("Email = "+this.Email);
		System.out.println("Contact = "+this.Contact);
	}

	public static void main(String[] args) {
		Accountant ac=new Accountant();
		ac.setdata();
		ac.display();

	}

}
