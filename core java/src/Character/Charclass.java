package Character;

public class Charclass 
{
	/*

Exercise 1: Write to program to print true if input charatcer 'a' is a Uppercase charater.*/	
	public void uppercase()
	{

		System.out.println(Character.isUpperCase('a'));
		
	}

	/*Exercise 2: Write a program to determine if the input character is a digit or a 
	 * alphabet.Use Character.isDigit() method.*/
	public void digit()
	{
		System.out.println("1 is a digit = "+Character.isDigit('2'));
	}

	/*Exercise 3: Write a program to print all input characters to upper case. 
	 * Use method Character.toUpperCase(). 

eg input 'b' output B

input 'h' output H*/
	public void printupper()
	{
		System.out.println(Character.toUpperCase('h'));
		
	}

	/*Exercise 4:What is the output of below statement

		System.out.println(Character.isWhitespace('A'));  

        System.out.println(Character.isWhitespace(' '));  

        System.out.println(Character.isWhitespace('\n'));  

        System.out.println(Character.isWhitespace('\t'));  

		*/
	public void outputcheck()
	{
		System.out.println(Character.isWhitespace('A'));  

        System.out.println(Character.isWhitespace(' '));  

        System.out.println(Character.isWhitespace('\n'));  

        System.out.println(Character.isWhitespace('\t'));  
	}

	/*Exercise 5: What is output of below statement

	System.out.println(Character.toLowerCase('A'));  

     System.out.println(Character.toLowerCase(65));  

     System.out.println(Character.toLowerCase(48));  */
	public void outputcheck2()
	{
		System.out.println(Character.toLowerCase('A'));  

	     System.out.println(Character.toLowerCase(65));  

	     System.out.println(Character.toLowerCase(48));  
	}
	public static void main(String arg[])
	{
		Charclass c=new Charclass();
		c.uppercase();
		c.digit();
		c.printupper();
		c.outputcheck();
		c.outputcheck2();
	}
}
