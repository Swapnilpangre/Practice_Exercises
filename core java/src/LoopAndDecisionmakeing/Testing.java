package LoopAndDecisionmakeing;

import java.util.Scanner;

public class Testing {
	Scanner sc=new Scanner(System.in);

	/*Excercise 1: Write a program to check that 29 is a prime number or not using for loop. 
	 * Print the output as
      29 is a prime number
	*/
	public void prime(int i)
	{
		int temp=i,j=1,z=0;
		while(j<=temp)
		{
			if(i%j==0)
			{
				z++;
			}
			j++;
		}
		if(z==2)
		{
			System.out.println("number is prime = "+temp);
		}
		else
		{
			System.out.println("number is not prime = "+temp);
		}
	}

	/*Excercise 2 :Write a program to calculate the sum of first 10 natural number.
	*/
	public void sumofnumber()
	{
		int z=0;
		for(int i=1;i<=10;i++)
		{
			z=z+i;
		}
		System.out.println("sum = "+z);
	}

	/*Excercise 3 :Write a program that  outputs the number with the digits 
	 * reversed. For example, if the input is 12345, the output should be 54321.*/
	public void reverse(int num)
	{
		int reverse=0;
		while(num!=0)
		{
			int remainder = num % 10;  
			reverse = reverse * 10 + remainder;  
			num = num/10;  
		}
		System.out.println(reverse);
	}

	/*Exercise 4 :Write a program to print out all Armstrong numbers between 
	 * 1 and 500. If sum of cubes of each digit of the number is equal to the 
	 * number itself, then the number is called an Armstrong number.
For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 )*/
	public void amstrong()
	{
        int n, b, sum = 0;
        for(int i = 1; i <= 500; i++)
        {
            n = i;
            while(n > 0)
            {
                b = n % 10;
                sum = sum + (b * b * b);
                n = n / 10;
            }
            if(sum == i)
            {
                System.out.print(i+" ");
            }
            sum = 0;
        }
        System.out.println();
	}

	/*Exercise 5: Write a program to print Fibonacci series of n terms where n is input by user :
0 1 1 2 3 5 8 13 24 ..... */
	public void fibonacci()
	{
		System.out.println("enter number you have print the series");
		int num=sc.nextInt();
		int n1=0,n2=1,n3,i,count=num;    
		 System.out.print(n1+" "+n2);    
		 for(i=2;i<count;++i)  
		 {    
		  n3=n1+n2;    
		  System.out.print(" "+n3);    
		  n1=n2;    
		  n2=n3;    
		 }    
		 
	}

	/*Exercise 6: Write a program to print numbers from 1 to 10.*/
	public void num1to10()
	 {
		 for(int k=1;k<=10;k++)
		 {
			 System.out.print(k+" ");
		 }
		 
	 }

		/*Exercise 7: Write a program that print the multiplication table of number 7.*/
	public void num7table()
	 {
		 for(int k=1;k<=10;k++)
		 {
			 System.out.print(7*k+" ");
		 }
		 
	 }

		/*Exercise 9 : Write a program to calculate the sum of following series where n = 9
1 + 1/2 + 1/3 + 1/4 + 1/5 +…………1/n  */
	public void series()
	 {
		double sum=0;
		 for(int k=1;k<=9;k++)
		 {
			sum=sum+(1/k);
		 }
		 System.out.println(sum);
		 
	 }

		/*Exercise 10 : Write a program to print following :



	

*
**
***
****
******/
	public void pattern()
	{
		for(int j=1;j<=5;j++)
		{
			for(int k=1;k<=j;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

	/*
Exercise 11: Write program  to print Odd numbers between 1 and 50.*/
	public void oddseries()
	{
		for(int i=1;i<=50;i++)
		{
			if(i%2==0)
				System.out.print(i);
			System.out.println();
		}
	}

	/*Exercise 12 : Write program to print Prime Numbers between 1 to 100 using for loop.*/
	public void primenum()
	{
		
		for (int i=1;i<=50;i++)
		{
			int temp=i,j=1,z=0;
			while(j<=temp)
			{
				if(i%j==0)
				{
					z++;
				}
				j++;
			}
			if(z==2)
			{
				System.out.print(" "+temp);
			}
		}
		System.out.println();
	}

	/*Exercise 13 : Write a Java program to calculate the revenue from a sale based on the 
	 * unit price and quantity of a product input by the user.The discount rate is 10% for the 
	 * \quantity purchased between 100 and 120 units, and 15% for the quantity purchased greater 
	 * than 120 units. If the quantity purchased is less than 100 units, the discount rate is 0%. 
	 * See the example output as shown below:

Enter unit price: 25

Enter quantity: 110

The revenue from sale: 2475.0$

After discount: 275.0$(10.0%)*/
	public void unit()
	{
		System.out.println("enter unit prise");
		double prise=sc.nextDouble();
		System.out.println("enter unit quantity");
		int qu=sc.nextInt();
		if(qu<100)
		{
			System.out.println("The revenue from sale:"+(qu*prise));
			System.out.println("After discount : "+(qu*prise)+"(0.0%)");
		}
		else if(qu<120)
		{
			System.out.println("The revenue from sale:"+(qu*prise));
			System.out.println("After discount : "+((qu*prise)-((qu*prise)*10/100))+"(10.0%)");
		}
		else
		{
			System.out.println("The revenue from sale:"+(qu*prise));
			System.out.println("After discount : "+((qu*prise)-((qu*prise)*15/100))+"(15.0%)");
		}
		
		
	}

	/*Exercise 14: Write a Java program to detect key presses. If the user pressed 
	 * number keys( from 0 to 9), the program will tell the number that is pressed,  
	 * otherwise, program will show "Not allowed".(Hint: Use switch case)*/
	public void switchcse()
	{
		System.out.println("enter the num 0 to 9");
		int num=sc.nextInt();
		switch(num)
		{
		case 0:
			System.out.println("zero");
			break;
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;	
		case 3:
			System.out.println("three");
			break;	
		case 4:
			System.out.println("four");
			break;
		case 5:
			System.out.println("five");
			break;
		case 6:
			System.out.println("six");
			break;
		case 7:
			System.out.println("seven");
			break;
		case 8:
			System.out.println("eight");
			break;
		case 9:
			System.out.println("nine");
			break;
		default:
			System.out.println("enter number not between 0 to 9");
		}
	}

	/*Exercise 15: Write Java program to allow the user to input his/her age.
	 *  Then the program will show if the person is eligible to vote. A person 
	 *  who is eligible to vote must be older than or equal to 18 years old.
*/
	public void vote()
	{
		System.out.println("enter your age");
		int a=sc.nextInt();
		if(a<18)
			System.out.println("not eligible");
		else
			System.out.println("eligible");
	}

	/*Exercise 16 : We have a loud talking parrot. The "hour" parameter is 
	 * the current hour time in the range 0..23. We are in trouble if the parrot 
	 * is talking and the hour is before 7 or after 20. Return true if we are in trouble.

parrotTrouble(true, 6) → true
parrotTrouble(true, 7) → false
parrotTrouble(false, 6) → false

Write a program to check if we are in trouble . Print the output for method  
parrotTrouble(boolean talking, int hour) using above sample input.*/
	public void trouble(int b)
	{
		int a=7;
		boolean bo; 
		if(a>b)
			bo=true;
		else
			bo=false;
		System.out.println(bo);
			
	}

	/*Exercise 17 : Given an int n, return the absolute difference between n 
	 * and 21, except return double the absolute difference if n is over 21.
Sample input and expected output.
diff21(19) → 2
diff21(10) → 11
diff21(21) → 0*/
	public void diff(int n)
	{
		System.out.println("difference = "+(21-n));
	}

	/*Exercise 18 : Given two int values, return their sum. Unless the two values 
	 * are the same, then return double their sum.
Sample input and expected output.
sumDouble(1, 2) → 3
sumDouble(3, 2) → 5
sumDouble(2, 2) → 8*/
	public void sumdouble()
	{
		System.out.println("enter 1st num");
		int a=sc.nextInt();
		System.out.println("enter 2nd num");
		int b=sc.nextInt();
		if(a==b)
			System.out.println((a+b)*2);
		else
			System.out.println(a+b);
	}

	public static void main(String[] args) {
		Testing t=new Testing();
		t.prime(29);
		t.sumofnumber();
		t.reverse(12345);
		t.amstrong();
		t.fibonacci();
		t.num1to10();
		t.num7table();
		t.series();
		t.pattern();
		t.oddseries();
		t.primenum();
		t.unit();
		t.switchcse();
		t.vote();
		t.trouble(6);
		t.diff(6);
		t.sumdouble();
		
	}

}
