package trycatchCheck;

class InvalidStrigException extends Exception
{
    public InvalidStrigException(String s)
    {
        // Call constructor of parent Exception
        super(s);
    }
}
 
//Exercise 15: Write a program to throw a user defined exception. 
//eg Create a exception which is thrown when the input string is less than 100.
public class StringTest
{
   void productCheck(String s) throws InvalidStrigException{
	if(s.length()<100){
		throw new InvalidStrigException("String Invalid");
	}
   }
   
    public static void main(String args[])
    {
    	 StringTest obj = new  StringTest();
        try
        {
            obj.productCheck("asd");
        }
        catch (InvalidStrigException ex)
        {
            System.out.println("Caught the exception");
            System.out.println(ex.getMessage());
        }
    }
}