package coreJavaExample;
//Exercise 29: Create a class to print an integer and a character with two methods having the same name
//but different sequence of the integer and the character parameters.
//For example, if the parameters of the first method are of the form (int n, char c), then that 
//of the second method will be of the form (char c, int n).
public class Print {

void Printn(int a , char c){  
    System.out.println("Integer is: "+a+ "\t Char is: "+c);
}    

 void Printn(char c,int a ){
    System.out.println("Char is: "+c+ "\tInteger is: "+a );
}   
 public static void main(String[] args) {
	    Print obj = new Print();
	    obj.Printn(10, 'A');
	    obj.Printn('B', 5);

	}
}