package ObjAndClass;

/*Write a program to create a Student class with properties name ,
 *  courseEnrolled . Write method getCourseEnrolled() that gives the 
 *  result of the course enrolled by the student. eg Ram has enrolled
 *   for Java course , Vicky has enrolled for HTML course and Reena has
 *    enrolled for Spring course.*/
import java.util.Scanner;

public class Student {
	private String Name,Course;

	Scanner sc=new Scanner(System.in);
	public void getdata()
	{
		System.out.println("enter a name");
		Name=sc.nextLine();
		System.out.println("enter a course");
		Course=sc.nextLine();
	}
	public void CourseEnrolled()
	{
		System.out.println(this.Name+" has Enrolled for "+this.Course);
	}
	public static void main(String[] args) {
		Student s1=new Student();
		s1.getdata();
		s1.CourseEnrolled();

	}

}
