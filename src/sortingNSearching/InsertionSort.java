package sortingNSearching;

public class InsertionSort {

	public static void main(String[] args) {
		int numbers[] = { 1, 5, 8, 4, 3, 13, 99, 3, 67, 33 };

		for (int i = 1; i < numbers.length; ++i) {
			int key = numbers[i];
			int j = i - 1;
			while( j >= 0 && numbers[j] > key)
			{
				numbers[j+1] = numbers[j];
				--j;
			}
			numbers[j+1] = key;
			
		}

		for (Integer i : numbers)
			System.out.println(i);

	}

}
