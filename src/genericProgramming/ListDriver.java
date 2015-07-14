package genericProgramming;

public class ListDriver {
	public static void main(String[] args) {
		List<String> gList = new List<>(10);
		gList.add("milk");
		gList.add("eggs");

		System.out.println("Groccery List : " + gList.toString());

		List<Integer> numList = new List<>(10);

		numList.add(01);
		numList.add(17);
		numList.add(1994);
		
		System.out.println("Numbers List :" + numList.toString());

	}

}
