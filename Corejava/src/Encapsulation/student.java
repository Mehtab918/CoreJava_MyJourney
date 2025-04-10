package Encapsulation;

public class student {
	int eid;
	
	void display()
	{
		System.out.println(eid);
		
	}
	public static void main(String[] args) {
		
		student obj1 = new student();
		obj1.eid= 10;
		obj1.display();
		
		student2 obj2 = new student2();
		obj2.displayMarks();
		
	}
}
