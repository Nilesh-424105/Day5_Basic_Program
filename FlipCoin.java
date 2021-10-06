package com.basic.program;

/**
 * Flip Coin and print percentage of Heads and Tails
 */

import java.util.Scanner;

public class FlipCoin {
	public static void main(String[] args) {
		System.out.println("Enter the Number of Coin Toss: ");
		Scanner sc = new Scanner(System.in);

		// Enter the number of flips from the User by using scanner
		int numberOfFlips = sc.nextInt();
		int numberOfFlipsCounter = numberOfFlips;

		// Checking for Negative Value
		if (numberOfFlips <= 0) {
			System.out.println("Number of Flips Should Be Greater Than Zero");
			return;
		}

		// Declaring the Counter for Head and Tail
		int headCounter = 0;
		int tailCounter = 0;

		// Logic to Flip the Coin and to Calculate Number of Heads and Tails
		while (numberOfFlipsCounter > 0) {
			double flipValue = Math.random();
			if (flipValue < 0.5) {
				tailCounter++;
			} else {
				headCounter++;
			}
			numberOfFlipsCounter--;
		}
		// Calculate percentage of head and tail
		double tailPercent = ((double) tailCounter / numberOfFlips) * 100;
		double headPercent = ((double) headCounter / numberOfFlips) * 100;

		System.out.println("Head Percent is: " + headPercent);
		System.out.println("Tail Percent is: " + tailPercent);
	}

}
