package Obj;

public class This1 {

//	public String address = "hyderabad";
//	protected int ohrId = 4578;
//	private long salary= 50000L;
		public String address;
		protected int ohrId;
		private long salary;
	
	public This1()
		{
		 System.out.println("calling you...");
		 this.address = "hyderabad";
		 this.ohrId = 4578;
		 this.salary= 50000L;
		System.out.println(this.address);
		System.out.println(this.ohrId);
		System.out.println(this.salary);
		}
	This1(String address, int ohrId, long salary)
	{
	 this.address = address;  
	 this.ohrId = ohrId;
	 this.salary = salary; // left side instance ref and right side salary is local ref
	 	System.out.println(this.address);
		System.out.println(this.ohrId);
		System.out.println(this.salary);
	}
	
	void details()
	{
		System.out.println(this.address);
		System.out.println(this.ohrId);
		System.out.println(this.salary);
	}
	

	public static void main(String[] args) {
		
	This1 obj = new This1("hyderabad",4578,50000L);
//		System.out.println(obj);
		System.out.println(obj.address);
		System.out.println(obj.ohrId);
		System.out.println(obj.salary);
		
	This1 obj2 = new This1();
	 obj2.details();
	}
}
