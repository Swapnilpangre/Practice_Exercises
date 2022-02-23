package Set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;


public class Set {
	/*Exercise 1 : Write a program to remove elements from a 
	 * SET of integers that are the perfect square.    
	 * Sample input /Output :                                                                                                                                    
	 * numbers : [2, 3, 4, 5, 6, 7, 8, 9, 10]
After removeAll(perfectSquares) => [2, 3, 5, 6, 7, 8]*/
	
	public void perfect_square() {
		 HashSet<Integer> a = new HashSet<Integer>();
	        a.addAll(Arrays.asList(
	            new Integer[] { 2, 3, 4, 5, 6, 7, 8, 9, 10 }));
	        System.out.println(a);
	        //Exercise 2 :  Write a Java program to convert a hash set to a List/ArrayList.
	        List<Integer> l=new ArrayList<Integer>();
	        for (Integer s:a)
	        {
	        	double d=Math.sqrt(s);
	        	boolean b=(d - Math.floor(d)) == 0;
	        	if(b==false)
	        		l.add(s);
	        }
	        a.clear();
	        a.addAll(l);
	        System.out.println(a);      
			
	}
	/*Exercise 3  : Write a Java program to get the first and 
	 * last elements in a tree set.
Sample Input/Output

Tree set:                                                              
//[Black, Green, Orange, Red, White]                                     
First Element is: Black                                                
Last Element is: White */ 
	public void tree()
	{
		TreeSet<String> t=new TreeSet<String>();
		t.add("Black");
		t.add("Green");
		t.add("Orange");
		t.add("Red");
		t.add("White");
		System.out.println("First Element is : "+t.first());
		System.out.println("Last Element is : "+t.last());
	}
	/*Exercise 4 : Write a Java program to get an element in a tree set 
	 * which is strictly greater than the given element. 
Sample Input/output
TreeSet : {10,22,36,25,16,70,82,89,14}

Strictly greater than 76 : 82                                          
Strictly greater than 31 : 36*/
	public void greter()
	{
		TreeSet<Integer> t=new TreeSet<Integer>();
		t.addAll(Arrays.asList(new Integer[] {10,22,36,25,16,70,82,89,14}));
		System.out.println("Strictly greater than 76 : "+t.ceiling(76));
		System.out.println("Strictly greater than 31 : "+t.ceiling(31));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set s=new Set();
		s.perfect_square();
		s.tree();
		s.greter();

	}

}
