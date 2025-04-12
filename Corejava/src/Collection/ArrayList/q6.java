package Collection.ArrayList;

import java.util.LinkedList;

// Write a Java program to remove the third element from an array list.
public class q6 {

	public static void main(String[] args) {
		
		LinkedList<String> al = new LinkedList<String>();
		al.add("red");
		al.add("green");
		al.add("blue");
		al.add("purple");
		
		System.out.println("original array:" +al);
		
		al.get(2); // blue
		al.remove(2);
		System.out.println("effected array:" +al);
		
		
	}
}
