package Encapsulation;

public class student {
	
	private int eid; // make the instance variable private // initially it is zero
	
	public void setEid(int eid)
	{
		this.eid = eid;
	}
	
	public int getEid()
	{
		return eid;
	}
	
	void display()
	{
		System.out.println(eid);
		
	}
	public static void main(String[] args) {
		
	student obj = new student();
	obj.setEid(122);
	System.out.println(obj.getEid());
		
		
		
	}
}
