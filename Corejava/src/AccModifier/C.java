package AccModifier;

public class C{

	private class B
	{
		void m1()
		{
			System.out.println("private constructor B can be accessed within class A");	
		}
		
	}
}
class Main extends C
{
	public static void main(String [] args)
	{
		// B b = new B();  // class B cannot be instantiated outside the class C.
		
	}
}
