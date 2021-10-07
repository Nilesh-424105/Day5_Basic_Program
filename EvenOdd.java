package com.basic.program;
/*
 * Whether A Number is Even Or Odd
 */

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		// User Input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();

		// By Using if_else Condition to Check Number is Even or Odd
		if (number % 2 == 0) {
			System.out.println("Number is Even");
		} else {
			System.out.println("Number is Odd");
		}

	}
}
