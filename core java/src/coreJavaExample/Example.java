package coreJavaExample;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Scanner;
import java.util.TimeZone;

public class Example extends Exception {
	Scanner sc = new Scanner(System.in);
	//Exercise 1: Write a program to check the input
	//character is a vowel or consonant using switch case
	public void vowel()
	{
		System.out.println("enter char ");
		System.out.println("Vowel");
		String c=sc.next();
		switch(c)
	    {
	        case "a": 
	            System.out.println("Vowel");
	            break;
	        case "e": 
	            System.out.println("Vowel");
	            break;
	        case "i": 
	            System.out.println("Vowel");
	            break;
	        case "o": 
	            System.out.println("Vowel");
	            break;
	        case "u": 
	            System.out.println("Vowel");
	            break;
	        case "A": 
	            System.out.println("Vowel");
	            break;
	        case "E": 
	            System.out.println("Vowel");
	            break;
	        case "I": 
	            System.out.println("Vowel");
	            break;
	        case "O": 
	            System.out.println("Vowel");
	            break;
	        case "U": 
	            System.out.println("Vowel");
	            break;
	        default: 
	        	System.out.println("Consonant");
	    }
	}
	//Exercise 2: Write a program to reverse a string entered by user using recursion
	public void reverse()
	{
		String s2="";
		System.out.println("enter string");
		String s=sc.next();
		for(int a=s.length();a>=0;a--)
		{
			s2+=s.charAt(a);
		}
		System.out.println(s2);
	}
	//Exercise 3: Write a program to reverse a 6 digit number using while or for loop.
	public void revnum()
	{
		System.out.println("enter number");
		long l=sc.nextLong();
		long reverse = 0;  
		while(l != 0)   
		{  
		long remainder = l % 10;  
		reverse = reverse * 10 + remainder;  
		l = l/10;  
		}  
		System.out.println(reverse);
	}
//	Exercise 4: Write a program to calculate your age as of today by giving your 
//	date of birth as input. Example you are born on 11 april 1989 and today is 22 
//	april 2019 then output will be
//
//	I am 30 years, 0 months and 11 days old.
	public void age()
	{
		System.out.print("Enter date of birth in YYYY-MM-DD format: "); String i=sc.next();
		LocalDate dob = LocalDate.parse(i);
		LocalDate curDate = LocalDate.now();  
		System.out.println("I am"+Period.between(dob, curDate).getYears());
	}
	//Exercise 5: Write a Java program to get the current time in New York.
	public void newyork()
	{
		Calendar calNewYork = Calendar.getInstance();
	     calNewYork.setTimeZone(TimeZone.getTimeZone("America/New_York"));
	      System.out.println("Time in New York: " + calNewYork.get(Calendar.HOUR_OF_DAY) + ":"+ calNewYork.get(Calendar.MINUTE)+":"+calNewYork.get(Calendar.SECOND));
	}
	//Exercise 6:  Write a Java method to count all vowels in a string
	public void countvowels()
	{
		System.out.println("enter a string");
		String str=sc.nextLine();
		int count = 0;
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o' || str.charAt(i) == 'u')
            {
                count++;
            }
        }
        System.out.println("vowels : "+count);
	}
	//Exercise 7: Write a Java method to display the current date and time.
	public void currDate()
	{
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now();  
		System.out.println(dtf.format(now)); 
	}
	//Exercise 8: Write a Java program to append text to an existing file.
	public void appendtext()
	{
		try {
	         String data = "my name is swapnil";
	         File f1 = new File("/home/swapnil/Desktop/New Folder/b.txt");
	         if(!f1.exists()) {
	            f1.createNewFile();
	         }

	         FileWriter fileWritter = new FileWriter(f1.getName(),true);
	         BufferedWriter bw = new BufferedWriter(fileWritter);
	         bw.write(data);
	         bw.close();
	         System.out.println("Done");
	      } catch(IOException e){
	         e.printStackTrace();
	      }
	}
	//Exercise 9: Write a Java program to find the longest word in a text file.
	public void logestword()
	{
		String longest_word = "";
	       String current;
	       Scanner sc;
		try {
			sc = new Scanner(new File("/home/swapnil/Desktop/New Folder/b.txt"));
			 while (sc.hasNext()) {
		          current = sc.next();
		           if (current.length() > longest_word.length()) {
		             longest_word = current;
		           }
		       }

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      	         System.out.println("longest_word : "+longest_word);
	}
	//Exercise 10: Write a Java program that accepts two double variables and test if 
	//both strictly between 0 and 1 and false otherwise. 
	//If input is not a double but a integer user is prompted to input double variable only.
	public void doubletest()
	{ 
		boolean b=true;
		double a = 0,c = 0;
		while(b)
		{
			try
			{
				System.out.println("enter two double variable  between 0 and 1 input double variable only");
				a=sc.nextDouble();
				c=sc.nextDouble();
				if(a>=0.0&a<=1.0)
					if(c>=0.0&c<=1.0)
						b=false;
			}
			catch(Exception e)
			{
				e.printStackTrace();
				System.out.println("input double variable only");
			}
			
		}
		System.out.println(a);
		System.out.println(c);
	
	}
	//Exercise 11: Write a program to find the GCD - greatest common divisor of two number using for loop.
	public void gcd()
	{
		System.out.println("enter 1st number");
		int a=sc.nextInt();
		System.out.println("enter 2nd number");
		int b=sc.nextInt();
		int  gcd = 1;  
		for(int i = 1; i <= a && i <= b; i++)  
		{   
			if(a%i==0 && a%i==0)  
				gcd = i; 
		}  
		System.out.println(gcd);
	}
	//Exercise 12 : Write a program to print the Fibonacci series based on user input. 
	//Fibonacci series of first 6 numbers is  0,1,1,2,3,5
	public void series()
	{
		System.out.println("enter series limit");
		int l=sc.nextInt();
		int num1=0,num2=1,temp=0;
		System.out.println(num1);
		System.out.println(num2);
		for(int i=1;i<=l;i++)
		{
			temp=num1+num2;
			num1=num2;
			num2=temp;
			System.out.println(temp);
		}
	}
		//Exercise 13: Write a program to swap two integers without using a temporary variable.
		public void swaping()
		{
			System.out.println("enter 1st number");
			int a=sc.nextInt();
			System.out.println("enter 2nd number");
			int b=sc.nextInt();
			
			a=a+b;
			b=a-b;
			a=a-b;
			System.out.println(a);
			System.out.println(b);
	}
		//Exercise 14 : Write a program to find the ASCII value of a given character.
		public void asc()
		{
			System.out.println("enter a character");
			char c=sc.next().charAt(0);
			System.out.println((int)c);
			
		}
//		Exercise 16:Given an array of ints, we'll say that a triple is a value 
		//appearing 3 times in a row in the array. Return true if the array does not contain any triples.
//		Sample input/output
//		noTriples([1, 1, 2, 2, 1]) → true
//		noTriples([1, 1, 2, 2, 2, 1]) → false
//		noTriples([1, 1, 1, 2, 2, 2, 1]) → false
		public boolean triples(int[] nums)
		{
			int count = 0;
				  for (int i = 0 ; i < nums.length - 1;i++) {
				    if (i+2 <= nums.length -1) {
				      if (nums[i] == nums[i+1] && nums[i] == nums[i+2])
				        return false;  
				    }
				  } return true;
		}
//		Exercise 17: Given 3 int values, a b c, return their sum. However, if one 
//				of the values is 13 then it does not count towards the sum and values to its 
//				right do not count. So for example, if b is 13, then both b and c do not count.
//				Sample input/output
//				luckySum(1, 2, 3) → 6
//				luckySum(1, 2, 13) → 3
//				luckySum(1, 13, 3) → 1
		public void lucky()
		{
			System.out.println("enter 1st number");
			int a=sc.nextInt();
			System.out.println("enter 2nd number");
			int b=sc.nextInt();
			System.out.println("enter 3rd number");
			int c=sc.nextInt();
			if (a == 13)
				System.out.println(0);
			else if (b == 13)
				System.out.println(a);
			else if (c == 13)
				System.out.println(a + b);	
			else
				System.out.println(a+b+c);
		}
//		Exercise 18:Given an array of scores, return true if each score is equal 
//				or greater than the one before. The array will be length 2 or more.
//				Sample input/output
//				scoresIncreasing([1, 3, 4]) → true
//				scoresIncreasing([1, 3, 2]) → false
//				scoresIncreasing([1, 1, 4]) → true
		public void greaterthan()
		{
			int a[]= {1,3,4};
			if((a[0]+a[1])>=a[2])
				System.out.println("true");
			else
				System.out.println("false");
		}
		//Return true if the given non-negative number is a multiple of 3 or 5, 
		//but not both. Use the % "mod" operator 
//		old35(3) → true
//		old35(10) → true
//		old35(15) → false
		public void multiple()
		{
			System.out.println("enter number");
			int a=sc.nextInt();
			if((a%3==0)^(a%5==0))
				System.out.println("true");
			else
				System.out.println("false");
		}
//		Exercise 20 : You have a red lottery ticket showing ints a, b, and c, each of which is 0, 1, or 2.
//		If they are all the value 2, the result is 10. Otherwise if they are all the same, the result is 5. 
//		Otherwise so long as both b and c are different from a, the result is 1. Otherwise the result is 0.
//		Sample input/output
//		redTicket(2, 2, 2) → 10
//		redTicket(2, 2, 1) → 0
//		redTicket(0, 0, 0) → 5 
		public void ticket()
		{
			System.out.println("enter 1st number");
			int a=sc.nextInt();
			System.out.println("enter 2nd number");
			int b=sc.nextInt();
			System.out.println("enter 3rd number");
			int c=sc.nextInt();
			if (a == 2 && b == 2 && c == 2)
				System.out.println(10);
			else if ( a == b && b == c)
				System.out.println(5);
			else if ( a != b && a != c)
				System.out.println(1);
			else
				System.out.println(0);
		}
//		Exercise 21 : Java Program to Calculate the Power of a Number using while loop only with using ready 
//		made Math.pow() method. Eg base=3 exponent = 4 then result will be 3x3x3x3=81
		public void mathpow()
		{
			int base=3,exponent1=4,exponent=4;
			String s = "";
			while(exponent>0)
			{
				if(exponent>1)
					s+=base+"*";
				else
					s+=base;
				exponent--;
			}
			System.out.println(s+" = "+Math.pow(base,exponent1));
		}
//		Exercise 22 : Write a Java method to check whether a string is a valid password. Go to the editor
//
//		Password rules:
//
//		1.A password must have at least ten characters.
//
//		2.A password consists of only letters and digits.
//
//		3.A password must contain at least two digits.
		
		public void password()
		{
			boolean b=true;
			int l=0,d=0,k=0;
			while(b)
			{
				System.out.println("enter a password");
				String s=sc.next();
				
				for (int i = 0; i < s.length(); i++) {

		            char ch = s.charAt(i);
		            boolean Letter=(Character.toUpperCase(ch) >= 'A' && Character.toUpperCase(ch) <= 'Z');
		            boolean Numeric=(ch >= '0' && ch <= '9');
		            if (Numeric) d++;
		            else if (Letter) l++;
		            else k++;
		        }
				if(s.length()>=10)
				{
					if(k==0)
					{
						if(d>=2)
							b=false;
						else
							System.out.println("A password must contain at least two digits.");
					}
					else
						System.out.println("A password consists of only letters and digits.");
				}
				else
					System.out.println("A password must have at least ten characters.");	
			}
			System.out.println("password is ok");
		}
//		Exercise 23  :  Given an int n, return true if difference between n and 100 or 200 is single 
//				digit number . Note: Math.abs(num) computes the absolute value of a number.
//
//				Sample input/Output
//				nearHundred(93) → true
//				nearHundred(90) → true
//				nearHundred(89) → false"
		public void mathabs()
		{
			System.out.println("enter a number");
			int a=sc.nextInt();
			a=Math.abs(a);
			if(a-100<=9&a-200<=9)
				System.out.println("true");
			else
				System.out.println("false");
		}
//		Exercise 24 : Write a Java Program to Count Vowels and Consonants in a String
		public void countV()
		{
			System.out.println("enter a string");
			String s=sc.nextLine();
			int v=0,c=0;
			for (int i = 0; i < s.length(); i++)
	        {
	            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i'
	                    || s.charAt(i) == 'o' || s.charAt(i) == 'u')
	            	v++;
	            else
	            	c++;
	        }
			System.out.println("Vowels = "+v);
			System.out.println("Consonants = "+c);
		}
		boolean checkPrime(int num) {
		    boolean isPrime = true;

		    for (int i = 2; i <= num / 2; ++i) {
		      if (num % i == 0) {
		        isPrime = false;
		        break;
		      }
		    }

		    return isPrime;
		  }
//		Exercise 25 : Write a program  to check whether a number can be Expressed as Sum of Two 
//		Prime Numbers  .Sample input/output
//
//		Enter number : 34   
//		34 = 3 + 31
//		34 = 5 + 29
//		34 = 11 + 23
//		34 = 17 + 17
		public void checkprime()
		{
			int number = 34;
		    boolean flag = false;
		    for (int i = 2; i <= number / 2; ++i) {

		      // condition for i to be a prime number
		      if (checkPrime(i)) {

		        // condition for n-i to be a prime number
		        if (checkPrime(number - i)) {

		          // n = primeNumber1 + primeNumber2
		          System.out.printf("%d = %d + %d\n", number, i, number - i);
		          flag = true;
		        }

		      }
		    }
		    if (!flag)
		        System.out.println(number + " cannot be expressed as the sum of two prime numbers.");
		}
		
	public static void main(String[] args) {
		Example e=new Example();
//		e.vowel();
//		e.reverse();
//		e.revnum();
//		e.age();
//		e.countvowels();
//		e.newyork();
//		e.currDate();
//		e.appendtext();
//		e.logestword();
//		e.doubletest();
//		e.gcd();
//		e.series();
//		e.swaping();
//		e.asc();
//		e.excep();
//		int[] n= {1, 1, 2, 2, 1};
//		System.out.println(e.triples(n));
//		e.lucky();
//		e.greaterthan();
//		e.multiple();
//		e.ticket();
//		e.mathpow();
//		e.password();
//		e.mathabs();
//		e.countV();
		e.checkprime();
	}
	
}
