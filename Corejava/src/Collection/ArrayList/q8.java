package Collection.ArrayList;

import java.util.ArrayList;
import java.util.List;

//Write a Java program to copy one array list into another.
public class q8 {

	public static void main(String[] args) {
		
		List<String> al = new ArrayList<String>();
		al.add("red");
		al.add("black");
		al.add("orange");
		
		List<String> al1 = new ArrayList<String>(al);
		
		System.out.println(al1);
	}
}
