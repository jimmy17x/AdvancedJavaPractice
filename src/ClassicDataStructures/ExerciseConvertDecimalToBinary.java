package ClassicDataStructures;

import java.util.Stack;

public class ExerciseConvertDecimalToBinary {

	static String binary(int number) {
		final int base = 2;
		Stack digits = new Stack();
		do {
			digits.push(number % 2);
			number /= 2;
		} while (number != 0);

		String bits = "";

		while (!digits.isEmpty()) {
			bits += digits.pop();
		}
		return bits;

	}

	public static void main(String[] args) {
		int num = 5 ; //101
		System.out.println(num + " binary  is " + binary(num));

	}

}
