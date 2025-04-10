package Inheritance;

class Employee
{
	private String ename;
	private long eid;
	private String eAddr;

	public void setEmp(String ename, long eid, String eAddr)
	{
		this.ename = ename;
		this.eid = eid;
		this.eAddr = eAddr;
	}
	
	void display()
	{
		System.out.println("Employee name :" + this.ename);
		System.out.println("Employee id :" + this.eid);
		System.out.println("Employee address :" + this.eAddr);
	}
}

class PermanentEmployee extends Employee
{
	private String depart;
	private double salary;
	
	public void setPermanentEmployee(String depart ,double salary) 
	{
		this.depart = depart;
		this.salary = salary;
		
	}
	
	void empDetails()
	{
		System.out.println("Employee depart :" +  this.depart);
		System.out.println("Employee salary :" +  this.salary);
	}
}
public class EmpDemo {

	public static void main(String[] args) {
		
		PermanentEmployee pe = 	new PermanentEmployee();
		pe.setEmp("Mehtab",703356053, "Hyderabad");
		pe.setPermanentEmployee("F&I", 50000);
		pe.display();
		pe.empDetails();
	}
}
