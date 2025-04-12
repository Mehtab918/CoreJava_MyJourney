package TypeCasting;
//converting smaller datatypes to larger 
public class Widening {

	public static void main(String[] args) {
		
		byte b = 124; // byte is 8bits or 1 byte
		
		int c = b; // b is going inside c . which is possible 
		
		System.out.println(c);
		
		
		int v = 1234;
		 //byte  b1 = v; // impossible lossy conversion , // need to do manually type casting
		 byte b1 = (byte)v;
		 System.out.println(b1);
		 
	}
}
