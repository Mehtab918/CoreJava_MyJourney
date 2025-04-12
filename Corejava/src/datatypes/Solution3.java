package datatypes;

public class Solution3 {

	public static void main(String[] args) {
		
		byte b = 1;
		// byte b1 = +b; // impossible lossy conversion - cannot typcast from int to byte
//		byte b2 = -b; // impossible lossy conversion
	
		byte b3 = 127;
		b3++;  //-128
		b3++; // -127
		b3++; // -126
		--b;  // 0 
		--b; // -1 
		
		System.out.println(b3); // -126
		System.out.println(b); //-1  
		
		
	}
}
