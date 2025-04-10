package Collection;

import java.util.LinkedList;
import java.util.List;

public class LinkedListProgram {

	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(12);
		list.add(24);
		
		System.out.println(list);
		
		 list.addFirst(10);
		 list.addLast(34);
		 
		 System.out.println(list.getFirst());
		 System.out.println(list.getLast());
		 
		 LinkedList<Integer> list1 = new LinkedList<Integer>();
		 list1.add(10);
		 list1.add(20);
		 list1.add(20);
		 list1.add(20);
		 list1.add(30);
		 list1.add(40);
		 
		list1.removeFirstOccurrence(Integer.valueOf(20));
		list1.removeLastOccurrence(Integer.valueOf(20));
		System.out.println(list1);
	}
	
}
