package Collection.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class q2 {

	public static void main(String[] args) {
		
		List<String> al = new ArrayList<String>();
		al.add("red");
		al.add("orange");
		al.add("blue");
		//iteration
		for(String colors :al)
		{
			System.out.println(colors);
		}
	}
}
