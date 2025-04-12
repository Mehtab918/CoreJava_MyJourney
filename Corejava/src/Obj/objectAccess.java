package Obj;

public class objectAccess {

	int x = 10; //variables
	public void m1()
	{
		System.out.println("method");		
	}
	
	public static void main(String[] args) {
		
		objectAccess obj = new objectAccess();
		
		System.out.println(obj.x);
	    obj.m1();
	    
	    obj.x = 30;
	    System.out.println(obj.x);
	}
	
}
