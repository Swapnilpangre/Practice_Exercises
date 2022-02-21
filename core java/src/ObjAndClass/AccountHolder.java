package ObjAndClass;

/*Modify above program so the the minimum age and minimum account
 balance can be changed at run time. ie: Instead of 25 and 20000 we 
 need 22 and 25000*/


/*Create a class AccountHolder and create three account-holder object Tom,
Henry and Sarah. Output of the program is to test the eligibility 
for the account holder for credit card. Create method 
testEligibilityForCC() that will return true or false depending on
below condition
*/
import java.util.Scanner;

public class AccountHolder 
{
	private String Name;
	private int Age,minimumAge=25;
	private double Bal,minimumBal=20000;
	Scanner sc=new Scanner(System.in);
	public void getData(String name,int age,double bal) 
	{
		Name=name;
		Age=age;
		Bal=bal;
	}
	public Boolean testEligibility() 
	{
		if(this.Age>=minimumAge&this.Bal>=minimumBal)
			return true;
		else
			return false;
	}

	public void setminimumagandbal()
	{
		System.out.println("enter minimum age");
		minimumAge=sc.nextInt();
		System.out.println("enter minimum balance");
		minimumBal=sc.nextDouble();
	}
	
	public static void main(String[] args) 
	{
		
		AccountHolder tom=new AccountHolder();
		AccountHolder henry=new AccountHolder();
		AccountHolder sarah=new AccountHolder();
		tom.getData("tom", 27, 50000);
		henry.getData("henry", 21, 30000);
		sarah.getData("sarah", 24, 20000);
		System.out.println(tom.testEligibility()+"   "+tom.Name);
		System.out.println(henry.testEligibility()+"   "+tom.Name);
		System.out.println(sarah.testEligibility()+"   "+sarah.Name);
		tom.setminimumagandbal();
		System.out.println(tom.testEligibility()+"   "+tom.Name);
		System.out.println(henry.testEligibility()+"   "+henry.Name);
		System.out.println(sarah.testEligibility()+"   "+sarah.Name);
		
		
		

	}

}
