package Collection.ArrayList;
//Write a Java program to search for an element in an array list.
import java.util.LinkedList;

public class q7 {

	public static void main(String[] args) {
		
		LinkedList<String> al = new LinkedList<String>();
		al.add("red");
		al.add("green");
		al.add("blue");
		al.add("purple");
		
		System.out.println(al);
		
		if(al.contains("blue"))
		{
			System.out.println("blue is presented");
		}
		else
		{
			System.out.println("it is not presented");
		}
	}
}
