package sequentialCollection;

import java.util.TreeSet;

public class TreeSetExercise {
	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet();

		String text = "I'll tell you what went wrong,"
				+ "I spent my days planning a future when I couldn't see in front of me"
				+ "I'll tell you what went wrong,"
				+ "I had a great imagination but I couldn't grasp reality"
				+ "I'll tell you what went wrong,"
				+ "I couldn't stop myself from reaching for a better life for you and me"
				+ "I'll tell you what went wrong,"
				+ "I couldn't give myself completely cos who I'm losing wouldn't let me be";
		String words[] = text.split(" ");
		for(String s : words )
		{
			System.out.println(s);
			set.add(s);
		}
		System.out.println("Total words : " + words.length);
		
		System.out.println("Total unique words : " + set.size());
		for(String s : set)
			System.out.println(s);
		
		
	}
}
