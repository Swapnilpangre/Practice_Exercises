package Arrays;

import java.util.*;

public class test {
	private int[] num= {9,8,7,6,5,4,6,7,3,1};
	//Exercise 1 : Write a Java program to sort a numeric array and a string array.
	public void sort()
	{
		Arrays.sort(num);
		System.out.println(Arrays.toString(num));
	}
	//Exercise 2 : Write a Java program to test if an array contains a specific value.
	public void findelement()
	{
		for (int n : num) {
	         if (5 ==n) {
	            System.out.println("true");
	            }
	         }
	}
	//Exercise 3 : Write a Java program to remove a specific element from an array.
	public void deleteelement(int fn)
	{
		for(int i = 0; i < num.length; i++)
	    {
	      if(num[i] == fn)   
	      {
	        
	        for(int j = i; j < num.length - 1; j++)
	        {
	            num[j] = num[j+1];
	        }
	        break;
	      }
	    }
		
	}
	//Exercise 4 : Write a Java program to find the maximum and minimum value of a
	public void minmax()
	{
		Arrays.sort(num);
		System.out.println("min = "+num[0]);

		System.out.println("max = "+num[(num.length)-1]);
		
	}
	//Exercise 5 : Write a Java program to reverse an array of integer values.
	public void reverce()
	{
		for(int j=num.length-1; j >= 0; j--)
        {
            System.out.print(" "+num[j]);
        }
		System.out.println();
	}
	//Exercise 6 : Write a Java program to find the duplicate values of an array of string values.
	public void duplicate()
	{
		 for (int i = 0; i < num.length; i++) {
		     for (int j = i + 1 ; j < num.length; j++) {
		          if (num[i]==num[j]) {
		                   System.out.println(" "+num[i]);
		          }
		     }
		 }
		 System.out.println();

	}
	//Exercise 7 : Write a Java program to remove duplicate elements from an array.
	public void duplicateremove()
	{
		for (int i = 0; i < num.length; i++) {
		     for (int j = i + 1 ; j < num.length; j++) {
		          if (num[i]==num[j]) 
		          {
		        	  deleteelement(num[i]);
		                   }
		          }
		     }
		for (int n : num)
		{
			System.out.print(" "+num[n]);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		
		
		test t=new test();
		t.sort();
		t.findelement();
		t.deleteelement(5);
		for (int n : t.num)
		{
			System.out.print(" "+t.num[n]);
		}
		System.out.println();
		t.minmax();
		t.reverce();
		t.duplicate();
		t.duplicateremove();
		

	}
}
