package Collection;

import java.util.ArrayList;
import java.util.Collections;

//Exercise 3: Modify employee class to have address to each employee. 
//Address is another class that has following parameters. 1.CountryName,2 State name 3. City . 
//Print the list of all employees form Maharashtra , Pune and Nasik cities.
public class address {
	private String countryName,stateName,city;
	address(String countryName,String stateName,String city,employee emp)
	{
		this.countryName=countryName;
		this.stateName=stateName;
		this.city=city;
	}
	@Override
	public String toString() {
		return "address [countryName=" + countryName + ", stateName=" + stateName + ", city=" + city + "]";
	}
	public static void main(String[] args) {
		ArrayList<address> arraylist = new ArrayList<address>();
		arraylist.add(new address("india", "mh", "aurangabad", new employee(5, "Sudarshan")));
		arraylist.add(new address("india", "mh", "ambad", new employee(3, "Sulbha")));
		arraylist.add(new address("india", "mh", "jalna", new employee(1, "krushna")));
		ArrayList<department2> arraylist2 = new ArrayList<department2>();
		   arraylist2.add(new department2(5,"com",arraylist));
		   arraylist2.add(new department2(1,"it",arraylist));
		   arraylist2.add(new department2(17,"mca",arraylist));
		   Collections.sort(arraylist2);
		   for(department2 d : arraylist2)
		   {
			   System.out.println(d);
		   }
	}
}
