package Obj;

class Employee
{
	public String name;
	public int id;
	public long salary;
	
	public Employee()
	{
		System.out.println("default argument constructor");
	}
	public Employee(String name , int id)
	{
		this();
		this.name = name;
		this.id = id;
		System.out.println("Name of the employee:"+ this.name);
		System.out.println("Id of the employee:"+ this.id);
	}
	public Employee(String name , int id, long salary)
	{
		this(name,id);
		this.salary = salary;
		System.out.println("Salary also set");
		System.out.println("Salary of the employee:"+ this.salary);
	}


}
public class This3 {

	public static void main(String[] args) {
		
		Employee emp = new Employee("Mehtab",101,60000);
		System.out.println("------------");
		Employee emp1 = new Employee("Ankit",102,50000);
	}
}
