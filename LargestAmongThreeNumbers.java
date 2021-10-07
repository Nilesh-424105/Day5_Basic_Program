package com.basic.program;

/*
 *  Find Largest Number Among Three Numbers
 */

import java.util.Scanner;

public class LargestAmongThreeNumbers {
	public static void main(String[] args) {
		// User Inputs
		Scanner sc = new Scanner(System.in);
		System.out.println("To Check Largest Amoung Three: ");
		System.out.println("Enter Number1: ");
		int num1 = sc.nextInt();
		System.out.println("Enter Number2: ");
		int num2 = sc.nextInt();
		System.out.println("Enter Number3: ");
		int num3 = sc.nextInt();

		// To Check Largest Number By using if_elseif_else Condition
		if (num1 >= num2 && num1 >= num3) {
			System.out.println("Largest Number is: " + num1);
		} else if (num2 >= num1 && num2 >= num3) {
			System.out.println("Largest Number is: " + num2);
		} else {
			System.out.println("Largest Number is: " + num3);
		}

	}

}
