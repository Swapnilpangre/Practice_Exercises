package Collection;

//Exercise 3: Modify employee class to have address to each employee. Address is another class that has following 
//parameters. 
//1.CountryName,2 State name 3. City . Print the list of all employees form Maharashtra , Pune and Nasik cities.
import java.util.ArrayList;
import java.util.List;

public class department2 implements Comparable<department2>{
	private int departmentId;
	private String departmentName;
	private List<address> employees;
	department2(int departmentId,String departmentName, ArrayList<address> arraylist){
		this.departmentId=departmentId;
		this.departmentName=departmentName;
		this.employees=arraylist;
		
	}
	
	

	@Override
	public String toString() {
		return "department2 [departmentId=" + departmentId + ", departmentName=" + departmentName + ", employees="
				+ employees + "]";
	}

	@Override
	public int compareTo(department2 de) {
		if(departmentId>de.departmentId)
			return 1;
		else
			return -1;
	}
	
}
	

