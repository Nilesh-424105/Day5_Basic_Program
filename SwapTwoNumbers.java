package com.basic.program;

/*
 * Swap Two Numbers
 */

import java.util.Scanner;

public class SwapTwoNumbers {
	public static void main(String[] args) {
		// User Inputs
		Scanner sc = new Scanner(System.in);
		System.out.println("Before Swaping: ");
		System.out.println("Enter Number1: ");
		int number1 = sc.nextInt();
		System.out.println("Enter Number2: ");
		int number2 = sc.nextInt();
		sc.close();
		number1 = number1 + number2;
		number2 = number1 - number2;
		number1 = number1 - number2;
		// Print Numbers After the Swapping
		System.out.println("After Swaping: ");
		System.out.println("Number1: " + number1);
		System.out.println("Number2: " + number2);
	}

}
