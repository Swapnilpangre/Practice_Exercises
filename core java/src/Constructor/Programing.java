/*Exercise 4 : Create a class named 'Programming'. While creating an
 *  object of the class, if nothing is passed to it, then the message 
 *  "I love programming languages" should be printed. If some String 
 *  is passed to it, then in place of "programming languages" the name 
 *  of that String variable should be printed.
For example, while creating object if we pass "Java", then 
"I love Java" should be printed.*/
package Constructor;



public class Programing {
	private String s1;
	Programing()
	{
		s1="i love Programming";
		System.out.println(s1);
	}
	Programing(String s)
	{
		s1="i love "+s;
		System.out.println(s1);
	}

	public static void main(String[] args) {
		Programing p1=new Programing();
		Programing p2=new Programing("java");
	}
}
