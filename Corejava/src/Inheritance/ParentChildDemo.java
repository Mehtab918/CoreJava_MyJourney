package Inheritance;

class Parent
{
	public long money = 5000000;
	public int land = 5;
	public void home()
	{
		System.out.println("Parent has bunglow....");
	}
	public void gold()
	{
		System.out.println("parent has gold..");
	}
	
	public void vehicle()
	{
		System.out.println("parent has vehicles too...");
	}
}

class Child extends Parent
{
	public void ChildNewMercedy()
	{
		System.out.println("child has new mercedy Benz car....");
	}
	
}
public class ParentChildDemo {

	public static void main(String[] args) {
		
		//child object 
		Child c = new Child();
		//child property
		c.ChildNewMercedy();
		System.out.println("-----------------");
		//paren object
		Parent p = new Parent();
		//parent property
		System.out.println(p.money);
		System.out.println(p.land);
		p.home();
		p.gold();
		p.vehicle();
		System.out.println("-----------------");
		//can child able to access parent property or not ?
		
		Parent c1 = new Child();   // Widening - Automatic conversion
		System.out.println("child accessing parent assets");
		System.out.println(c1.money);
		System.out.println(c1.land);
		c1.home();
		c1.gold();
		c1.vehicle();
		
		//but can parent can access child property? => direclty Big NO . but through type casting Yes.
		
		Child p1 = (Child)new Parent();  // this is called Typecasting =>Explicitly 
		
		p1.ChildNewMercedy();
	}
}
