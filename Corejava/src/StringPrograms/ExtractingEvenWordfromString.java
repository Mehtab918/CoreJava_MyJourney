package StringPrograms;

public class ExtractingEvenWordfromString {

	public static void main(String[] args) {
		
		String str= "My name is Ankit Kumar";
		
	   for( String newString : str.split(" "))
	   {
		   if(newString.length()%2==0)
		   {
		   System.out.println(newString+" ");
	   }
		
	   }

	}

}
