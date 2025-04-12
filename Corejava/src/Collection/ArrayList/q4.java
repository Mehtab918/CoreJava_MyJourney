package Collection.ArrayList;

import java.util.Arrays;
import java.util.List;

//Write a Java program to retrieve an element (at a specified index) from a given array list.
public class q4 {

	public static void main(String[] args) {
		
	List<String> al = Arrays.asList("apple","banana","chikoo");
	
	System.out.println(al);
	
	System.out.println("first element:"+ al.get(0));
	System.out.println("second element:"+ al.get(1));
	
	}
}
