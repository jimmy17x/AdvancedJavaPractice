package sequentialCollection;

import java.util.PriorityQueue;

public class LinePriorityQueue {

	public static void main(String[] args) {
		PriorityQueue<String> line = new PriorityQueue();
		line.add("Jimmy");
		line.add("ozzy");
		line.add("jolly");
		line.add("marshal");

		System.out.println("The line ");
		for (String s : line) {
			System.out.println(s);
		}
		
		line.poll();
		
		System.out.println("The line ");
		for(String s  : line)
			System.out.println(s);
		
		line.remove("marshal");
		
		for(String s : line )
			System.out.println(s);
		
		System.out.println("Head of line is : " + line.peek());
	}

}
