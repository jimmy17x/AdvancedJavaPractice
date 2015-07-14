package sequentialCollection;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.PriorityQueue;

public class SquareDancePriorityQueue {
	public static void main(String[] args) {
		PriorityQueue<String> men = new PriorityQueue<String>();
		PriorityQueue<String> women = new PriorityQueue<String>();

		String line = null;
		String file = "E:\\workspace\\java_workspace\\AdvancedJavaPractice\\src\\sequentialCollection\\dance.txt";
		String sex = "";
		BufferedReader in;

		try {
			in = new BufferedReader(new FileReader(file));
			while ((line = in.readLine()) != null) {
				sex = line.substring(0, 1);
				if (sex.equals("M"))
					men.add(line.substring(2));
				else
					women.add(line.substring(2));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		while (!men.isEmpty() && !women.isEmpty()) {
			System.out.println("The dance partners will be :");
			System.out.println(men.poll() + " and " + women.poll());
		}

		if (men.isEmpty()) {
			System.out.println("There are " + women.size()
					+ " women waiting to dance");
			System.out.println(women.peek() + " is the next women dancer");
		} else if (women.isEmpty()) {
			System.out.println("There are " + men.size()
					+ " men waiting to dance");
			System.out.println(men.peek() + " is the next men dancer");

		}
	}
}
