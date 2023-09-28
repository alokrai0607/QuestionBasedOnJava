package com.Java;

import java.util.Scanner;

public class Tables {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter range of numbers to print "
				           +"their multiplication table");

		int a = sc.nextInt();
		int b = sc.nextInt();

		for (int i = a; i <= b; i++) {
			System.out.println("Multiplication table of " + i);

			for (int j = 1; j <= 10; j++) {
				System.out.println(i + "*" + j + " = " + (i * j));
			}

		}
	}
}
