package sequentialCollection;

import java.util.ArrayList;

public class AList {
	public static void main(String args[]) {
		ArrayList<Integer> grades = new ArrayList<Integer>();
		grades.add(100);
		grades.add(200);
		grades.add(300);
		grades.add(400);

		float total = 0f;
		// for(int i = 0 ; i < grades.size() ; ++i)
		// total+= grades.get(i);

		// Collection interface provides us iterator
		for (Integer i : grades)
			total += i;

		System.out.println("Size of grades  is " + grades.size());
		System.out.println("Average grades  is " + total / grades.size());
		grades.remove(2);
		System.out.println("New size after removing is " + grades.size());
		grades.add(60);
		grades.add(70);
		System.out.println("New size after inserting is " + grades.size());


	}

}
