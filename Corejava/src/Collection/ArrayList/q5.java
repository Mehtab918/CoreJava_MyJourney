package Collection.ArrayList;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

// Write a Java program to update an array element by the given element.
public class q5 {

	public static void main(String[] args) {
		
		LinkedList<String> al = new LinkedList<String>();
		al.add("red");
		al.add("green");
		al.add("blue");
		al.add("purple");
		
		System.out.println("original array:" +al);
		
		al.get(2); // blue
		
		al.set(2, "yellow");
		
		
	}
}
