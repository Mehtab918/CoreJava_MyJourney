package Collection.ArrayList;

import java.util.ArrayList;
public class q1 {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("red");
		al.add("orange");
		al.add("blue");
		
		for(String colors :al)
		{
			System.out.println(colors);
		}
	}
}
