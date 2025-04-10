package AccModifier.Package2;

import AccModifier.Package1.A;

public class B extends A {

	
	public B()
	{
		super(10);
	}
	public static void main(String[] args) {
		
	// A a = new A(17);		// we cannot access Class A of package 1 
	
		B b = new B();
		
		
	}
}
