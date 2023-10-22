package com.Java;

import java.util.Scanner;

public class returnGreater {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println(
				"Please pass any 3 Numbrs in your console " + 
		        "you will find your Grater and Smaller both value ");

		System.out.println("Please pass the value of a :");
		int a = scn.nextInt();

		System.out.println("Please pass the value of b :");
		int b = scn.nextInt();

		System.out.println("Please pass the value of c :");
		int c = scn.nextInt();

		if (a > b && a > c) {
			System.out.println(a + " is grater than " + b + " and " + c);
		} else if (b > a && b > c) {
			System.out.println(b + " is grater than " + a + " and " + c);
		} else if (c > a && c > b) {
			System.out.println(c + " is grater than " + a + " and " + b);
		} else if (a == b && a == c && b == c) {
			System.out.println("all are eqal ");
		}
	}
}
