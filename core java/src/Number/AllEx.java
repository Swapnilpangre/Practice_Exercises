package Number;

import java.util.Scanner;

public class AllEx {
	Scanner sc= new Scanner(System.in);

	/*Exercise 1 : Write a Java program to check whether a given 
	 * number is an ugly number.
In number system, ugly numbers are positive numbers whose only prime 
factors are 2, 3 or 5. First 10 ugly numbers are 1, 2, 3, 4, 5, 6, 8, 9, 10, 12. 
By convention, 1 is included.
Test Date:Input an integer number: 235
Expected Output :
It is not an ugly number.*/
	public void ugly()
	{
		System.out.print("Input an integer number: ");
        int n = sc.nextInt();  		
        if (n <= 0) {
            System.out.print("Input a correct number.");
        }
		int x = 0;
        while (n != 1) {
            if (n % 5 == 0) {
                n /= 5;
            } else if (n % 3 == 0) {
                n /= 3;
            } else if (n % 2 == 0) {
                n /= 2;
            } else {
                System.out.print("It is not an ugly number.");
				x = 1;
				break;
            }
        }
        if (x==0)
		System.out.print("It is an ugly number.");
		System.out.print("\n");
	    }

		/*Exercise 2 : Write a Java program to generate random integers in a specific range.*/
	public void randum()
	{
		
		System.out.println(Math.random());
	}

	/*Exercise 3: Write a Java program to check a number is a cube or not.
	 * (eg: 8 is input then output is " Number 8 is a cube")*/
	public void cube()
	{
		 Scanner sc = new Scanner( System.in ); 
	        System.out.print("Input a number: "); 
	        int num = sc.nextInt(); 
	       int n = (int) Math.round(Math.pow(num, 1.0/3.0));
	        if((num == n * n * n))
				{
				   System.out.print("Number is a cube.");
	            }
			   else
				{
					System.out.print("Number is not a cube.");
				}
					System.out.println("\n");
	        }
	     
			/*Exercise 4 :Write a Java program to find and print the first 10 happy numbers.
			 * Happy number: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1, or it loops endlessly in a cycle which does not include 1. 
Example: 19 is a happy number
12 + 92=82 (1st iteration)
82 + 22=68 (2nd iteration)
62 + 82=100(3rd iteration)
12 + 02 + 02=1(4th iteration)*/
	public void happy()
	{
		int n, r = 1, num, sum = 0;
        System.out.print("Enter number=");
        n = sc.nextInt();
        num = n;
        while (num > 9)
        {
            while (num > 0)
            {
                r = num % 10;
                sum = sum + (r * r);
                num = num / 10;
            }
            num = sum;
            sum = 0;
        }
        if (num == 1)
        {
            System.out.println("Happy Number");
        }
        else
        {
            System.out.println("Not Happy Number");
        }
	}
	


	

	public static void main(String[] args) {
		AllEx a=new AllEx();
		a.ugly();
		a.randum();
		a.cube();
		a.happy();

	}

}
