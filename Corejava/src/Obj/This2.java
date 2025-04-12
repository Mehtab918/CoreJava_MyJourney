package Obj;

public class This2 {

	public int x;
	
	void m1()
	{
		this.x = 25; // initializing 25 to x
		System.out.println("this:" + this.x); // access current instance ref var
		System.out.println("this ref value:" + this);
	}
	void m2()
	{
	this.m1();
	}
	public static void main(String[] args) {
		This2 obj = new This2();
		obj.m2();
		System.out.println("object ref value:" + obj);
	}
}

/*

this proves - This is holding current ref object. */