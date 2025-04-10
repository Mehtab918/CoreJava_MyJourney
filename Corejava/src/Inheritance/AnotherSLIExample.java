package Inheritance;

class A
{
	public int x= 100;
}
class B extends A
{
	public int y = 200;
}
public class AnotherSLIExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B();
	//child can access his property and parent property also,	
		System.out.println(b.x);
		System.out.println(b.y);
	}

}
