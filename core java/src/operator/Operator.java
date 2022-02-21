package operator;

public class Operator {
	/*Exercise 1 : Write a program to print the value of variable int i=10 using 
	 * prefix and post fix ++ operator.*/
	
	private int i=10;
	public void preandpost()
	{
		System.out.println("prifix = "+(++i));
		System.out.println("postfix = "+(i++));
	}

	/*Exercise 2 : Write a program to print the 
	 * result if result is combination of 

  a.true and true  . 

  b.true and false

  c.false and true

 Use && operator 



	*/
	public void andoperator()
	{
		int a=1,b=2;
		if(a==1&b==2)
		{
		System.out.println("check condition = true and true");
		}
		if(a==1&b==3)
		{
			System.out.println("as");
		}
		else
		{
			System.out.println("check condition = true and false");	
		}
		if(a==3&b==2)
		{
			System.out.println("as");
		}
		else
		{
			System.out.println("check condition = false and true");	
		}
			
		
	}

	/*Exercise 3 : Write a program using Relational operators to print whether 
	 * variable i is between 10 to 20.
	*/
	public void ibetwin1020(int j)
	{
		if(j<=10&j>=20)
		{
			System.out.println("i is betwin 10 and 20"+j);
		}
	}

	/*Exercise 4 : Write a program using ternary operator to print 
	 * value of x if x is less than 10 else it should print yalue 
	 * of y.(Input x=5,y=13)
	*/
	public void ternary(int x,int y)
	{
		int z=(x<10?x:y);
		System.out.println(z);
	}

	/*Exercise 5 : Write a program using instanceof operator to tests 
	 * whether a String name = "ATDEV" is an instance of class Object.*/
	public void instance()
	{
		String n="ATDEV";
		boolean result = n instanceof String;
	    System.out.println( result );
	}

	public static void main(String[] args) {
		Operator o1=new Operator();
		o1.preandpost();
		o1.andoperator();
		o1.ibetwin1020(13);
		o1.ternary(5, 11);
		o1.instance();


	}

}
