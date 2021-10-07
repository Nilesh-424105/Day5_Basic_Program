package com.basic.program;

/*
 *  Compute Quotient and Remainder
 */

import java.util.Scanner;

public class QuotientAndRemainder {
	public static void main(String[] args) {
		// User Inputs
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Dividend: ");
		int dividend = sc.nextInt();
		System.out.println("Enter Divisor: ");
		int divisor = sc.nextInt();

		// To Calculate Quotient by using / sign
		int quotient = dividend / divisor;
		// Print Quotient
		System.out.println("Quotient = " + quotient);

		// To Calculate Remainder by using % sign
		int remainder = dividend % divisor;
		// Print Remainder
		System.out.println("Remainder = " + remainder);

	}
}
