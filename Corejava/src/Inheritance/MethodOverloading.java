
package Inheritance;

public class MethodOverloading {
	
	int height;
	int length;
	int radius;
	double side;
	
	void print(int height, int length)
	{
		System.out.println("draw rectangle =" + height * length);
	}
	
	void print(int radius)
	{
		System.out.println("draw circle =" + 3.14 * radius * radius* height);
	}
	void print(double side)
	{
		System.out.println("draw circle =" +  side * side);
	}
	public static void main(String[] args) {
		
		MethodOverloading obj1 = new MethodOverloading();
		
		
		obj1.print(40,50);
		obj1.print(4.3);
		obj1.print(12);
		
		
	}
}
