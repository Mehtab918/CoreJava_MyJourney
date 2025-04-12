package Collection.ArrayList;

import java.util.ArrayList;
import java.util.List;

//Write a Java program to insert an element into the array list at the first position.
public class q3 {

	public static void main(String[] args) {
		
	List<String> list = new ArrayList<String>();
	
	list.add("grapes");
	list.add("mango");
	
	System.out.println("list before:" +list);
	
	list.add(0, "apple");
	System.out.println("list after :" +list);
	
	}
}

//ArrayList method