package Collection.ArrayList;


import java.util.Collections;
import java.util.LinkedList;

public class SwappingArraylistElement {

	public static void main(String[] args) {
		LinkedList<String> al = new LinkedList<String>();
		al.add("red");
		al.add("green");
		al.add("blue");
		al.add("purple");
		al.add("pink");
		
		System.out.println("before swapping:");
		for(String c1 : al)
		{
			System.out.println(c1);
		}
		
		//Swapping 1st(index 0) element with the 3rd(index 2) element
		
		Collections.swap(al, 0 , 2);
		
		System.out.println(al);
		
	}
}
