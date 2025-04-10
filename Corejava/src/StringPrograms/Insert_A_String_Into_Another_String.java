package StringPrograms;

public class Insert_A_String_Into_Another_String {

	static String originalString ="HelloWorld";
	static String insertedString = "Java";
	static int position = 5;
	public static String insertString(String originalString,String insertedString,int position)
	{
	 if(position<0 || position>originalString.length())
	 {
		 throw new IllegalArgumentException("Invalid position");
	 }
	 return originalString.substring(0, position)+insertedString+originalString.substring(position);
	}
	
	public static void main(String[] args) {
		
//		String str = "Md Mehtab";
//		
//		StringBuilder sbr = new StringBuilder(str);
//		sbr.insert(9, " khan");
//		
//		System.out.println(sbr);
//		
		System.out.println("--------");
		
		String result = insertString(originalString,insertedString,position );
		System.out.println(result);
		
		
		
	}
}
