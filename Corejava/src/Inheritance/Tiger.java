package Inheritance;


class Animal {
	
	public void hunting()
	{
		System.out.println("animals are doing hunting when feel hunger..");
	}
	
	public void roaring()
	{
		System.out.println("They are roaring also");
	}
	
}

public class Tiger extends Animal
{
	public void weight()
	{
		System.out.println("Tiger weight is 300 kg");
	}
	
	public void eat()
	{
		System.out.println("tiger is a carnivore animal...");
	}
	
	public static void main(String[] args) {
		
		Tiger t = new Tiger();
		//acessing itas own property...
		t.eat();
		t.weight();
		
		// can he acess his parent property too.....
		t.roaring();
		t.hunting();
		
	// so it means that - Child can access it Parent  property.
		 
	}
}