package Collection;

public class ArrayProgram {

	public static void main(String [] rgs)
	{
		System.out.println("Welcome to learn Array");
		
		// how to initialize a variable ;
		 int var = 10;
		 int var1 = 20;
		 int var2 = 30;
		 
		 System.out.println(var);
		 System.out.println(var1);
		 System.out.println(var2);
		 
		// if i want to add 100 items i want to declare 100 variables . this is not a good apporach
		 // to add data .
		
	 //  how to put data in a single variable.
		 
		// int var3 = 10,30,40;   // it is not possible to declare a single variable and put multiple elements 
		 
		// For that , We will use Array concept.
		// An array is a concept which holds homegenous types of elements .
		 //An array has a fixed number of elements.
		// below code has fixed for var4. it size is 4 . 
		 int var4[] = new int[4];
		 // 2.Array is based on zero index .
		  var4[0] = 1;
		  var4[1]= 2;
		  var4[2] = 3;
		  var4[3] = 4;
		
		  System.out.println("-**********-------");
		//  System.out.println(var4[4]);  // ArrayIndexOutOfBoundException
		 
		 // homogenous data type
		  /* 
		   * int will contain int 
		   * String will contain string value
		   * Student type will contain student type only
		   */
		  // create an array
		 int var5[] = {10,20,30};
		 // accessing elements separately
		 System.out.println(var5[0]);
		 System.out.println(var5[1]);
		 System.out.println(var5[2]);
		 System.out.println("-----------");
		 //Using for loop
		  for(int i =0 ; i<var5.length ; i++)
		  {
			  System.out.println(var5[i]);
		  }
		  
		  //  We cannot use  group of elements as a single object.
		  
		 
		
		  
	}
}
