package com.Java;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a value to calculate its factorial: ");

		int n = sc.nextInt();

		long value = 1; 

		for (int i = 1; i <= n; i++) {
			value = value * i;
		}
		
		System.out.println("Factorial value of " + n + " is " + value);

	}
}
