package coreJavaExample;
//Exercise 26: Create a class to print the area of a square and a rectangle. 
//The class has two methods with the same name but different number of parameters. 
//The method for printing area of rectangle has two parameters which are length and 
//breadth respectively while the other method for printing area of square has one parameter 
//which is side of square.
public class area {

	int Area(int l,int b)
	{
		return l*b;
	}
	int Area(int l)
	{
		return l*l;
	}
	public static void main(String[] args) {
		area a=new area();
		System.out.println("area of a square = "+a.Area(5));
		System.out.println("area of a rectangle = "+a.Area(5,6));
	}
}
