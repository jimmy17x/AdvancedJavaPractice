package sequentialCollection;

import java.util.HashSet;

public class NamesHashSet {
	public static void main (String args[])
	{
		HashSet<String> names = new HashSet<String>();
		names.add("jimmy");
		names.add("jolly");
		
		System.out.println("The number of names is " + names.size());
		for(String s : names)
			System.out.println(s);
		names.remove("jimmy");
		names.add("marshal");
		String name = "marshal";
		if(names.contains(name))
			System.out.println(name + " is in hash set collection");
		else
			System.out.println(name +  " is not in hash set collection");
		
		for(String n  : names )
			System.out.println(n);
		names.clear();
		System.out.println("total names  : "  + names.size());
		
	}
}
