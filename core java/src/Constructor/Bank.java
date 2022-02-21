/*Exercise 3 : Suppose you have a Piggie Bank with an initial amount 
 * of $50 and you have to add some more amount to it. Create a class 
 * 'AddAmount' with a data member named 'amount' with an initial value 
 * of $50. Now make two constructors of this class as follows:
1 - without any parameter - no amount will be added to the Piggie Bank
2 - having a parameter which is the amount that will be added to Piggie
 Bank
Create object of the 'AddAmount' class and display the final amount 
in Piggie Bank.
*/
package Constructor;

public class Bank {
	private static int Bal;
	Bank()
	{
		Bal=50;
		System.out.println("Balance = "+Bal);
	}
	Bank(int bal)
	{
		Bal=Bal+bal;
		System.out.println("Balance = "+Bal);
	}

	public static void main(String[] args) {
		Bank b1=new Bank();
		Bank b2=new Bank(25);
		

	}

}
