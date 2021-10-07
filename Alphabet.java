package com.basic.program;

/*
 *  Whether a Alphabet is Vowel or Consonant
 */

import java.util.Scanner;

public class Alphabet {
	public static void main(String[] args) {
		// User Input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Alphabet");
		char ch = sc.next().charAt(0);

		// If alphabet is a,e,i,o,u then vowel otherwise consonant
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			System.out.println("Alphabet is Vowel");
		} else {
			System.out.println("Alphabet is Consonant");
		}
	}

}
