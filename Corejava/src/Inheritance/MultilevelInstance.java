package Inheritance;

class Student
{
	int sno;
	String name;
	String addr;
}

class Science extends Student
{
	int chem,physics;
}

class PCM extends Science
{
	int math;
	
	PCM(int sno, String sname, String saddr, int phy ,int chem, int math)
	{
	    this.sno = sno;
		this.name = sname;
		this.addr = saddr;
		this.physics = phy;
		this.chem = chem;
		this.math = math;
	}
	
	void result()
	{
		int total = physics + chem + math;
		System.out.println("total marks:"+ total);
	}
	
	void show()
	{
		System.out.println("student Number :" + sno);
		System.out.println("Student Name :" + name);
		System.out.println("Student Address:" +  addr);
		System.out.println("Mark of physics :" + physics);
		System.out.println("Mark of chemistry :" + chem);
		System.out.println("Mark of math :" + math);
	}
}
public class MultilevelInstance {

	public static void main(String[] args) {
		
		PCM p1 = new PCM(101,"Raj","Sakchi",89,90,95);
		p1.show();
		p1.result();

	}

}
