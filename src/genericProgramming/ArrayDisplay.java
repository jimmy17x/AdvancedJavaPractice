package genericProgramming;

public class ArrayDisplay {

	public static <T> void display(T[] list) {
		for (int i = 0; i < list.length; ++i) {
			if (list[i] != null) {
				System.out.print(list[i] + " ");
			} else
				break;
		}

	}

	public static void main(String args[]) {
		String names[] = new String[]{"Jimmy" , "Jolly"};
		

		display(names);
		
		Integer[] numbers = new Integer[]{01,17,1994};

		System.out.println();
		display(numbers);
		
	}

}
