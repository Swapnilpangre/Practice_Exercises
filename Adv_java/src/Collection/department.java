package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//Exercise 2: Modify above program to add a new class Department with departmentId and departmentName.  
//Every employee will be part of the department. Print the list of all employees in ascending order for a 
//particular department.
public class department implements Comparable<department>{
	private int departmentId;
	@Override
	public String toString() {
		return "department [departmentId=" + departmentId + ", departmentName=" + departmentName + ", employees="
				+ employees + "]";
	}
	private String departmentName;
	private List<employee> employees;
	department(int departmentId,String departmentName, List<employee> employees){
		this.departmentId=departmentId;
		this.departmentName=departmentName;
		this.employees=employees;
		
	}
	@Override
	public int compareTo(department de) {
		if(departmentId>de.departmentId)
			return 1;
		else
			return -1;
	}
	public static void main(String[] args) {
		ArrayList<employee> arraylist = new ArrayList<employee>();
		   arraylist.add(new employee(5, "Sudarshan"));
		   arraylist.add(new employee(3, "omkar"));
		   arraylist.add(new employee(1, "sumit"));
		   Collections.sort(arraylist);
		   ArrayList<department> arraylist2 = new ArrayList<department>();
		   arraylist2.add(new department(5,"com",arraylist));
		   arraylist2.add(new department(1,"it",arraylist));
		   arraylist2.add(new department(17,"mca",arraylist));
		   Collections.sort(arraylist2);
		   for(department d : arraylist2)
		   {
			   System.out.println(d);
		   }
	}
	
}
