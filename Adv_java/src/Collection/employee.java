package Collection;

import java.util.ArrayList;
import java.util.Collections;
//Exercise 1 : Create a employee class with name and employeeId . Print the sorted list of employees by name 
public class employee implements Comparable<employee>{
	@Override
	public String toString() {
		return "employee [employeeName=" + employeeName + ", employeeId=" + employeeId + "]";
	}

	private String employeeName;
	private int employeeId;
	
	employee(int id,String Name)
	{
		this.employeeId=id;
		this.employeeName=Name;
		
	}

	@Override
	public int compareTo(employee emp) {
		if(employeeId>emp.employeeId)
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

		   for(employee str: arraylist){
				System.out.println(str);
		   }
	}
}
