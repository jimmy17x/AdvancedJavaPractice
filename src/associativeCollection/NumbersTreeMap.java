package associativeCollection;


//treemap will keep items in order
import java.util.Map.Entry;
import java.util.TreeMap;

public class NumbersTreeMap {

	public static void main(String[] args) {
		TreeMap <String , String> map = new TreeMap();
		map.put("marshal", "7876");
		map.put("Jimmy", "7876");
		map.put("jolly", "7876");
		
		map.put("ozzy", "7876");
		map.put("scarfield", "7876");
		
		System.out.println("Jimmy's number is " + map.get("Jimmy"));
		System.out.println("Size is " + map.size());
		for(Entry<String, String> entry : map.entrySet())
		{
			System.out.println(entry.getKey() + " : " +entry.getValue());
		}
		map.remove("Jimmy");
		
		
		System.out.println("Size is " + map.size());

		
	}

}
