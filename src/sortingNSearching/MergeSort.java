package sortingNSearching;

public class MergeSort {

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

		mergeSort(num, helper, 0, num.length - 1);

		// before sort
		System.out.println("Before sort : ");
		for (int i = 0; i < num.length; ++i)
			System.out.print(num[i] + " ");

	}

	private static void mergeSort(int[] num, int[] helper, int low, int high) {
		if (low < high) {
			int mid =  (high + low) / 2;
			mergeSort(num, helper, low, mid);
			mergeSort(num, helper, mid + 1, high);
			merge(num, helper, low, mid, high);
		}

	}

	private static void merge(int[] num, int[] helper, int low, int mid,
			int high) {

		// copy both halves in helper array
		for (int i = low; i <= high; ++i)
			helper[i] = num[i];
		int helperLeft = low;
		int helperRight = mid + 1;
		int current = low;

		while (helperLeft <= mid && helperRight <= high) {
			if (helper[helperLeft] <= helper[helperRight]) {
				num[current++] = helper[helperLeft++];

			} else {
				num[current++] = helper[helperRight++];
			}
		}

		int remaining = mid - helperLeft;

		for (int i = 0; i <= remaining; ++i) {
			num[current + i] = helper[helperLeft + i];
		}
	}
}
