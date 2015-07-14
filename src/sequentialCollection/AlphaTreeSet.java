package sequentialCollection;

import java.util.TreeSet;

public class AlphaTreeSet {
	public static void main(String args[]) {
		TreeSet<String> names = new TreeSet<String>();
		names.add("ozzy");
		names.add("marshal");
		names.add("jolly");
		names.add("jimmy");

		System.out.println("Number of names: " + names.size());

		// all names will print out in sequential manner
		for (String s : names) {
			System.out.println(s);
		}
		System.out.println("Name before marshal : " + names.lower("marshal"));
		System.out.println("Name after marshal : " + names.higher("marshal"));
		System.out.println("Name at first position : " + names.first());
		System.out.println("Name at last position : " + names.last());
		

	}

}
