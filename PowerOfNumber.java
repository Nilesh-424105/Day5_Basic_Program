package com.basic.program;

/**
 * To Calculate Table of Power of Number Upto 31
 */

import java.util.Scanner;

public class PowerOfNumber {
	public static void main(String[] args) {
		// Input Given By User
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value : ");
		int number = sc.nextInt();

		// Calculate Table of Power of Number Which will ne input by user
		for (double i = 0; i <= 31; i++) {
			int N = (int) Math.pow(number, i);
			System.out.println("table of Number: " + N);
		}
	}

}
