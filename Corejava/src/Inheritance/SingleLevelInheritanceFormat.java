package Inheritance;

class Inheritance
{
	public String Parentstatus  = "Rich";
	public String Parentbehavior = "Eat";
}

public class SingleLevelInheritanceFormat extends Inheritance{

	
	public static void main(String[] args) {
		SingleLevelInheritanceFormat si = new SingleLevelInheritanceFormat();
		
		System.out.println(si.Parentstatus);
		System.out.println(si.Parentbehavior);
	}
}
