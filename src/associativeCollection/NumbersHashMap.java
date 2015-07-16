package associativeCollection;

import java.util.HashMap;
import java.util.Map.Entry;

//order of elements is unpredictable in HashMaps
public class NumbersHashMap {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap();
		map.put("marshal", "7876");
		map.put("Jimmy", "7876");
		map.put("jolly", "7876");

		map.put("ozzy", "7876");
		map.put("scarfield", "7876");

		System.out.println("Jimmy's number is " + map.get("Jimmy"));
		System.out.println("Size is " + map.size());

		if (map.containsKey("Jimmy")) {
			map.remove("Jimmy");
			System.out.println("Do map contains number for jimmy ? " + "yes");
			System.out.println("Successfully removed");

		}
		for (Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

		System.out.println("Size is " + map.size());

	}

}
