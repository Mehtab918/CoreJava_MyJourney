package exceptionalHandling;
// ArithmeticException - unchecked Exception
public class ex1 {
	
	public static void main(String[] args) {
		
		int x = 10;
		
		int   y = 0;
		
		int z  = x/y;  
	// No compile time error . No check about arithmetic exception at compile time
	   System.out.println("z:" + z); 
	   // the above ArithmeticException caught at runtime only. It is unchecked Exception.
	}
	
	/*
	 * Exception in thread "main" java.lang.ArithmeticException: / by zero
        at ex1.main(ex1.java:10)
	 */
	

}
