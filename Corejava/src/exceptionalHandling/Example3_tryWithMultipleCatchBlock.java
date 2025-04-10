package exceptionalHandling;

public class Example3_tryWithMultipleCatchBlock {

	public static void main(String[] args) {
		
		int[] numerators = { 10,200,30,40};
		int[] denominators = {1,4,0,5};
		
		for(int i=0; i<numerators.length;i++)
		{
			System.out.println(divide(numerators[i],denominators[i]));
		}
		
		System.out.println("Great job, program executes successfully");
	}
	
	public static int divide(int a, int b)
	{
//		try
//		{
//			String c = null;
//			System.out.println(c);
//			return a /b;
//		}
//		catch(Exception e)
//		{
//			System.out.println(e);
//			return -3;
//		}
//		catch(ArithmeticException e)
//		{
//			System.out.println(e);
//			return -1;
//		}
//		catch(NullPointerException e)
//		{
//			System.out.println(e);
//			return -2;
//		}
		
		try
		{
			Student std = null;
			std.setId("123");
			System.out.println(std);
			
			return a /b;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			return -1;
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
			return -2;
		}
		catch(Exception e)
		{
			System.out.println(e);
			return -3;
		}
	}
}
