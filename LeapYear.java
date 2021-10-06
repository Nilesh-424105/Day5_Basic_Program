package com.basic.program;

/**
 *  To Check Year Is Leap Year or Not
 */

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year: ");

		// Enter the Year From User Input
		int year = sc.nextInt();

		// To Check Given Year is Leap Year or not by using if_else Statements
		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
			System.out.println("leap year");
		} else {
			System.out.println("not leap year");
		}
	}

}
