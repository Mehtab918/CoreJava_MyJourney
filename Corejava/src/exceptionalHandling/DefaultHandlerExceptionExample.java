package exceptionalHandling;

public class DefaultHandlerExceptionExample {

	public static void main(String[] args) {
		
		level3();
	}
	
	
	public static void level1()
	{
		int a=100;
		int b= 0;
		try
		{
		System.out.print(a/b);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void level2()
	{
		level1();
	}
	
	public static void level3()
	{
		level2();
	}
}
