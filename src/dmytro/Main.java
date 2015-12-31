package dmytro;

import java.math.BigInteger;

public class Main {

	public static void main(String[] args) {

		if (args.length != 1) {
			System.out.println("Please provide a number to calculate a factorial.");
			return;
		}

		long number = Long.MIN_VALUE;
		try {
			number = Long.parseLong(args[0]);
		} catch (NumberFormatException e) {
			System.out.println("Number is not in right format. Please provide a positive integer number like 42.");
			return;
		}

		if (number < 0) {
			System.out.println("Please provide a positive integer (a number must be greater or equals to zero).");
			return;
		}

		System.out.print("Factorial of " + number);
		System.out.println(" equals to " + factorial(number));
	}

	private static String factorial(long number) {
		BigInteger one = BigInteger.valueOf(1);
		BigInteger factorial = BigInteger.valueOf(1);
		BigInteger bigIntegerNumber = BigInteger.valueOf(number);
		while (bigIntegerNumber.compareTo(one) == 1) {
			factorial = factorial.multiply(bigIntegerNumber);
			bigIntegerNumber = bigIntegerNumber.subtract(one);
		}

		return factorial.toString();
	}
}
