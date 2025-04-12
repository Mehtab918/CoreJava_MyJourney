package Obj;

public class JavaConstructor {
	
	int x;
	
	public JavaConstructor()
	{
		// this is syntax of java constructor 
		// constructor must have an exact name matching with className
		// it is used to initialize and object
		// we can also overload the constructor but we cannot override it.
		x = 10;
		System.out.println("zero parameter constructor : " + x);
	}
	public JavaConstructor(int x)
	{// this keyword must be in the first line of the constructor.
		this();
		x = 20;
		System.out.println("single parameterized constructor : " + x);
	}
	public JavaConstructor(int x , int y)
	{
		this(20);
		System.out.println("two parameterized constructor  : " + x);
	}

	public static void main(String[] args) {
		
		JavaConstructor obj1 = new JavaConstructor(); // this will invoke zero para constructor
		JavaConstructor obj2 = new JavaConstructor(20); // this will invoke parameterized constructor.
		JavaConstructor obj3 = new JavaConstructor(20,25);  
	}
}
//  zero > zero> single > zero >single> two