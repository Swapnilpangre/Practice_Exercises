package String;

public class AllEx {
	public void repit(int num)
	{
		String s="swapnil";
		for(int i=s.length();i<=num;i--)
		{
			System.out.println("dfs");
			System.out.print(s.charAt(i));
		}
	}

	public static void main(String[] args) {
		String s="    SWAPNIL",s2="it is my computer word",S3="swapnil";
		/*Exercise 1 :Write a Java program to get the character at the given index within the String. 
       Sample Output:
        Original String = Java Exercises! The character at position 0 is J*/
		System.out.println(s.indexOf('P'));
		/*Exercise 2: Write a Java program to test if a given string contains the 
		 * specified sequence of char values.
Sample Output: 
Original String: PHP Exercises and Python Exercises 
Specified sequence of char values:
Python 
Output : The string "PHP Exercises and Python Exercises" contains string "Python"*/
		System.out.println(s2.contains("computer"));
		/*Exercise 3: Write a Java program to check whether a given string ends with 
		 * the contents of another string.
Sample Output: 
"Python Exercises" ends with "se"? false                                                                      
"Python Exercise" ends with "se"? true

*/
		System.out.println(s.endsWith("L"));
		/*Exercise 4: Write a Java program to compare a given string to another string, 
		 * ignoring case considerations.
Sample Output: 
"Stephen Edwin King" equals "Walter Winchell"? false 
"Stephen Edwin King" equals "stephen edwin king"? true.

*/
		System.out.println(s.equalsIgnoreCase(S3));
		/*Exercise 5 : Write a java program to get the length of a given string.*/
		System.out.println(s.length());
		/*Exercise 6: Write a Java program to get a sub string of a given string between two 
		 * specified positions.
Sample Output: 
old = The quick brown fox jumps over the lazy dog.                                                    
new = brown fox jumps

*/
		System.out.println(s2.substring(6));
		/*Exercise 7: Write a Java program to trim any leading or trailing 
		 * whitespace from a given string. 
Sample Output: 
Original String:  Java Exercises                                                                              
New String: Java Exercises

*/
		System.out.println(s.trim());
	AllEx a=new AllEx();
	a.repit(3);
	}
	
	

}
