package sortingNSearching;

public class QuickSort {
	public static void main(String[] args) {
		int num[] = new int[10];
		for (int i = 0; i < num.length; ++i) {
			num[i] = (int) (Math.random() * 100);
		}

		// before sort
		System.out.println("Before sort : ");
		for (int i = 0; i < num.length; ++i)
			System.out.print(num[i] + " ");

		System.out.println("\n after sort : ");

		int helper[] = new int[num.length];

		quickSort(num, 0, num.length - 1);

	
		
		for (int i = 0; i < num.length; ++i)
			System.out.print(num[i] + " ");

	}

	private static void quickSort(int[] num, int low, int high) {
		if (low < high) {
			int index = partition(num, low, high);
			if (low < index - 1)
				quickSort(num, low, index - 1);// sort left half
			if (index < high)
				quickSort(num, index, high);// sort right half
		}

	}

	private static int partition(int[] num, int low, int high) {
		int pivot = num[low + (high - low) / 2];
		while (low <= high) {
			// find first element from left which should be on right
			while (num[low] < pivot)
				++low;

			// find first element from right which should be on left
			while (num[high] > pivot)
				--high;

			// swap elements and move left and right indices
			if (low <= high) {
				int temp = num[high];
				num[high] = num[low];
				num[low] = temp;
				++low;
				--high;

			}

		}
		return low;
	}

}
