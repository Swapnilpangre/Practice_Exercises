package coreJavaExample;
//Exercise 28 : A boy has his money deposited $1000, $1500 and $2000 in banks-Bank A, Bank B 
//and Bank C respectively. We have to print the money deposited by him in a particular bank. 
//Create a class 'Bank' with a method 'getBalance' which returns 0. Make its three subclasses 
//named 'BankA', 'BankB' and 'BankC' with a method with the same name 'getBalance' which returns 
//the amount deposited in that particular bank. Call the method 'getBalance' by the object of each of the three banks.

abstract class Bank

{
   abstract void getBalance();
}
class BankA extends Bank
{
   void getBalance()
   {
       System.out.println("Money deposited in Bank A is $1000");
   }
}
class BankB extends Bank
{
   void getBalance()
   {
       System.out.println("Money deposited in Bank B is $1500");
   }
}
class BankC extends Bank
{
   void getBalance()
   {
       System.out.println("Money deposited in Bank C is $2000");
   }
}
public class Main
{
public static void main(String[] args)
{
    Bank A = new BankA();
    A.getBalance();
    Bank B= new BankB();
    B.getBalance();
    Bank C = new BankC();
    C.getBalance();
}

}


