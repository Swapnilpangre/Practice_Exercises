/*Exercise 2 : Create a class named 'Rectangle' with two data members- 
 * length and breadth and a method to claculate the area which is 
 * 'length*breadth'. The class has three constructors which are :
1 - having no parameter - values of both length and breadth are assigned
 zero.
2 - having two numbers as parameters - the two numbers are assigned as 
length and breadth respectively.
3 - having one number as parameter - both length and breadth are
 assigned that number.
Now, create objects of the 'Rectangle' class having none, one and 
two parameters and print their areas.*/
package Constructor;

public class Area {
	private int L,B;
	Area()
	{
		L=0;
		B=0;
	}
	Area(int l,int b)
	{
		L=l;
		B=b;
		System.out.println("Area = "+L*B);
	}

	public static void main(String[] args) {
		Area a1=new Area();
		Area a2=new Area(12,5);

	}

}
