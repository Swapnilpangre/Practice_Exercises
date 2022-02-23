package List;

import java.util.ArrayList;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class test {
	//Exercise 1. Write a Java program to remove the third element from a array list.
	public void remove3ele()
	{
		List<String> name=new ArrayList<String>();
		name.add("swapnil");
		name.add("vishal");
		name.add("ram");
		name.add("sagar");
		name.add("sumit");
		System.out.println(name);
		name.remove(2);
		System.out.println(name+"\n");
	}
	//Exercise 2.Write a Java program to copy one array list into another.
	public void copy()
	{
		List<String> name=new ArrayList<String>();
		name.add("swapnil");
		name.add("vishal");
		name.add("ram");
		name.add("sagar");
		name.add("sumit");
		System.out.println(name);
		List<String> name2=new ArrayList<String>();
		System.out.println(name2);
		name2.addAll(name);
		System.out.println(name);
		System.out.println(name2+"\n");
	}
	//Exercise 3.Write a Java program to print all the elements of
	// a ArrayList using the position of the element
	public void print()
	{
		List<String> name=new ArrayList<String>();
		name.add("swapnil");
		name.add("vishal");
		name.add("ram");
		name.add("sagar");
		name.add("sumit");
		int size=name.size();
		for (int ind=0;ind<size;ind++)
		{
			System.out.println(name.get(ind));
		}
		
	}

	/*
	 * Exercsie 4. Write a Java program to iterate through all elements in a linked
	 * list starting at the specified position.Position no 1. sample list is of
	 * colors with element "Red","Green","White","Black","Yellow".
	 * 
	 * Output will be "Green","White","Black","Yellow".
	 */
	public void print2()
	{
		List<String> l=new ArrayList<String>();
		l.add("Green");
		l.add("White");
		l.add("Black");
		l.add("Yellow");
		System.out.println(l);
		System.out.println();
		Iterator<String> i=l.listIterator(1);
		while(i.hasNext())
		{
			System.out.print(i.next()+",");
		}
	}
	public static void main(String[] args) {
		test t=new test();
		t.remove3ele();
		t.copy();
		t.print();
		t.print2();
		t.deque();
	}

	/*Exercise 5. Write a Java program to insert elements into the linked
	 *  list at the first and last position. Insert color "Pink" at first 
	 *  and "Blue" at last position in linked list in exercise 4.


*/
	public void deque()
	{
		Deque<String> l=(Deque<String>) new LinkedList<String>();
		l.add("Green");
		l.add("White");
		l.add("Black");
		l.add("Yellow");
		l.addFirst("Pink");
		l.addLast("Blue");
		System.out.println("\n\n"+l);
	}

}
