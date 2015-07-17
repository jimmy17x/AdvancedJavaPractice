package ClassicDataStructures;

import java.util.LinkedList;

public class RadixSort {
	public static void main(String[] args) {
		final int size = 50;
		final int numQueues = 10;
		LinkedList<Integer>[] digits = new LinkedList[numQueues];
		for (int i = 0; i < numQueues; ++i) {
			digits[i] = new LinkedList();
		}
		int numbers[] = new int[50];
		for (int i = 0; i < size; ++i) {
			numbers[i] = (int) (Math.random() * 100);
		}

		display(numbers);
		Distribute(numbers, digits, "ones");
		Collect(digits, numbers);
		display(numbers);

		Distribute(numbers, digits, "tens");
		Collect(digits, numbers);
		display(numbers);

	}

	private static void Collect(LinkedList<Integer>[] digits, int[] numbers) {
		int m = 0;
		for (int i = 0; i < 10; ++i) {
			while (!digits[i].isEmpty())
				numbers[m++] = (Integer) digits[i].removeFirst();
		}

	}

	private static void Distribute(int[] numbers, LinkedList<Integer>[] digits,
			String digitType) {
		for (int i = 0; i < numbers.length; ++i) {
			if (digitType.equals("ones"))
				digits[numbers[i] % 10].addLast(numbers[i]);
			else
				digits[numbers[i] / 10].addLast(numbers[i]);
		}
	}

	private static void display(int[] numbers) {
		int i = 0;
		while (i < numbers.length) {
			System.out.print(numbers[i] + "  ");
			if (++i % 10 == 0)
				System.out.println();
		}
		System.out.println();

	}

}
