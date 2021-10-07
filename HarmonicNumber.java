package com.basic.program;

/**
 * Print N'th Harmonic Numbers
 */

import java.util.Scanner;

public class HarmonicNumber {
	public static void main(String[] args) {
		System.out.println("Enter the Number: ");

		// User Input
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		double harmonicNumber = 0;

		// to calculate N'th Harmonic Numbers
		for (double i = 1; i <= number; i++) {
			harmonicNumber = harmonicNumber + (1 / i);
		}
		// print N'th Harmonic Numbers
		System.out.println("n'th Harmonic Number of " + number + "" + harmonicNumber);
	}
}
