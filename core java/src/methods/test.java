package methods;

public class test {
	/*
	 * Exercise 1:Write a Java method to find the smallest number among three
	 * numbers.
	 * 
	 * Test Data: Input the first number: 25 Input the Second number: 37 Input the
	 * third number: 29 Expected Output:
	 * 
	 * The smallest value is 25.0
	 */
	public void greter(double a,double b,double c)
	{
		if(a<b&a<c)
			System.out.println("the smallest value = "+a);
		else if(b<a&b<c)
			System.out.println("the smallest value = "+b);
		else
			System.out.println("the smallest value = "+c);
	}

	/*
	 * Exercise 2: Write a Java method to display the middle character of a string.
	 * Input string "Rakhi". Output : Middle charatcer is k.
	 */
	public void middle(String s)
	{
		int a=s.length()/2;
		System.out.println(s.charAt(a));
	}

	/*
	 * Exercise 3: Write a Java method to count all words in a string. Input : I am
	 * very happy today Output : No of words in input string 'I am very happy today'
	 * is 5
	 */
	public void wordcount(String str)
	{
		int count = 1;
		 
        for (int i = 0; i < str.length() - 1; i++)
        {
            if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' '))
            {
                count++;
            }
        }
        System.out.println("Number of words in a string : " + count);
	}
	/*
	 * Exercise 5 : Write a Java method to check whether a string is a valid
	 * password.
	 * 
	 * Password rules: A password must have at least eight characters. A password
	 * consists of only letters and digits. A password must contain at least two
	 * digits.
	 */



	public void checkvaliation(String s)
	{
		int n=s.length();
		boolean let=false;
		int digit=0;
		for (int i = 0; i < n; i++) {
			if (Character.isDigit(s.charAt(i)))
				digit+=1;
			if (Character.isAlphabetic(s.charAt(i)))
				let=true;
			}
		if(n>=8)
		{
			if(let==true)
			{
				if(digit>=2)
				{
					System.out.println("your password is strong");
				}
				else
				{
					System.out.println("your password is not contain 2 number");
				}
			}
			else
			{
				System.out.println("your password is not contain Character");
			}
		}
		else
		{
			System.out.println("your password is less than 8 digit");
		}
	}
		
	public static void main(String[] args) {
		test t=new test();
		t.greter(25, 37, 29);
		t.middle("swapnil");
		t.wordcount("it is a computer world");
		t.checkvaliation("swapnill12");

	}
	

}
