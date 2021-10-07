package com.basic.program;

/*
 * Compute the Prime Factorization of Numbers
 */

import java.util.Scanner;

public class PrimeFactors {
	public static void main(String[] args) {
		System.out.println("Enter the Number: ");
		// User Input
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		for (int i = 2; i < number; i++) {
			// To check Condition Number Divides By Prime Number Reminder Will Get Zero
			while (number % i == 0) {
				// Print Prime Factor
				System.out.println(" " + i);
				// To Get New Number After Dividing 'i'
				number = number / i;
			}
		}
		// To Print Last Prime Factor
		System.out.println(" " + number);

	}

}
