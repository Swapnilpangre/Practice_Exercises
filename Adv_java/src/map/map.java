package map;

import java.util.HashMap;
import java.util.TreeMap;

public class map {
	/*Exercise 1. Write a Java program to associate the specified value with the specified key in a HashMap.
Sample output (hint use Map(<int><String>))

1 Red                                                                  
2 Green                                                                
3 Black                                                                
4 White                                                                
5 Blue*/
	public void maptest()
	{
		HashMap<Integer,String> h=new HashMap<Integer,String>();
		h.put(1,"Red");
		h.put(2,"Green");
		h.put(3,"Black");
		h.put(4,"Black");
		h.put(5,"Blue");
		System.out.println(h);
		/*Exercise 2:Write a Java program to get the value of a specified key in a map.
		 *  Get value of 
		 * key 3 in above map in exercise 1.*/
		System.out.println(h.get(3));
		/*Exercise 3. Write a Java program to remove all of the mappings from a map in exercise 1.*/
		h.clear();
		System.out.println(h);
	}
	/*Exercise 4: Write a Java program to get the first (lowest) key and the 
	 * last (highest) key currently in a tree map. Create a tree map with 
	 * TreeMap<String><String>
// Put elements to the map
 tree_map1.put("C2", "Red");
 tree_map1.put("C1", "Green");
 tree_map1.put("C4", "Black");
 tree_map1.put("C3", "White");

Output will be

Orginal TreeMap content: {C1=Green, C2=Red, C3=White, C4=Black}        
Greatest key: C1                                                       
Least key: C4*/
	public void check()
	{
		TreeMap<String,String> tm=new TreeMap<String,String>();
		tm.put("C2", "Red");
		tm.put("C1", "Green");
		tm.put("C4", "Black");
		tm.put("C3", "White");
		System.out.println("Greatest key : "+tm.firstKey());
		System.out.println("Least key : "+tm.lastKey());
		
	}

	public static void main(String[] args) {
		map m=new map();
		m.maptest();
		m.check();

	}

}
