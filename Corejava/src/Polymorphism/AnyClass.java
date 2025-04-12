package Polymorphism;

class AnyClass
{
    int i;
    String s;
     
    //Constructor Overloading
     
    public AnyClass()
    {
        this.i = 1;
        this.s = "mahi";
    }
     
    public AnyClass(int i, String s)
    {
        this.i = i;
        this.s = s;
        
        System.out.println(this.i);
        System.out.println(this.s);
    }
     
    //Method Overloading
     
    void anyMethod(int i)
    {
        System.out.println(i+this.i);   //Here, '+' is used to add two numbers
    }
     
    void anyMethod(String s)
    {
        System.out.println(this.s + " " +s);   //Here, '+' is used to concatenate two strings
    }
    
    public static void main(String[] args) {
		
    	AnyClass obj = new AnyClass();
    	
    	obj.anyMethod(10);  //11
    	obj.anyMethod("khan"); // mahi khan
    	
    	AnyClass obj1 = new AnyClass(12,"aditya");
    	
	}
}