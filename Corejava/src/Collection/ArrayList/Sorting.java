package Collection.ArrayList;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Sorting {

 public static void main(String[] args) {
	
	 List<Integer> list = new LinkedList<Integer>();
	 
	 list.add(12);
	 list.add(2);
	 list.add(10);
	 list.add(8);
	 list.add(5);
	 
	Collections.sort(list);
	System.out.println(list);
}
}
