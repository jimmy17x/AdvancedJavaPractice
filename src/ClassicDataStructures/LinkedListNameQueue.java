package ClassicDataStructures;

import java.util.LinkedList;

public class LinkedListNameQueue {
	public static void main(String[] args) {
		LinkedList<String> names = new LinkedList<String>();
		names.addLast("Jimmy");
		names.addLast("Jolly");
		names.addLast("ozzy");
		
		for(String s : names)
			System.out.println(s);
		
		System.out.println();
		
		names.removeFirst();
		for(String s : names)
			System.out.println(s);
		
		System.out.println();
		names.addLast("aroma");
		for(String s : names)
			System.out.println(s);
		
		System.out.println("Size of queue :" + names.size());
		
		if(!names.isEmpty())
			names.removeFirst();
		
		System.out.println("Size of queue :" + names.size());
		for(String s : names)
			System.out.println(s);
		
	}

}
