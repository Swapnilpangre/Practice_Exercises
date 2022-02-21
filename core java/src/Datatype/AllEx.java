package Datatype;

public class AllEx {
	/*Exercise 1 : Write a Java program to declare 
	 * a Boolean variable with initial value of “true” and 
	 * later change it to “false” before printing it.*/
	private boolean b;
	public boolean bool() {
		b=true;
		if(b==true)
			b=false;
		return b;
	}

	/*
	 * Exercise 3 : Write a program to assign a value of 100.235 to a
	 *  double
	 * variable and then convert it to int.
	 */
	public int converttoint()
	{
		char c='h';
		int i=c;
		return i;
	}

	/*Exercise 4 : Write a program to add 3 to the ASCII value of the 
	 * character 'd' and print the equivalent character.*/
	public char converttochar()
	{
		char c='d';
		int i=c+3;
		char d=(char)i;
		return d;
	}

	/*Exercise 5 : Write a program to assign a value of 100.235
	 *  to a double variable and then convert it to int.*/
	public int doubletoint()
	{
		double d=100.235;
		return (int)d;
	}

	public static void main(String[] args) {
		AllEx a=new AllEx();
		boolean a1=a.bool();
		int a2=a.converttoint();
		char a3=a.converttochar();
		int a4=a.doubletoint();
		System.out.println(a1);
		/*Exercise 2 : Print the ASCII value of the character 'h'.*/
		char c='h'; 
		int i=c;
		System.out.println(i);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
	}

}
