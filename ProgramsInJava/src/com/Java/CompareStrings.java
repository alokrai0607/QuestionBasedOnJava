package com.Java;

import java.util.Scanner;

public class CompareStrings {

	public static void main(String[] args) {

		String s1, s2;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your first String :");
		s1 = sc.nextLine();

		System.out.println("Enter your second string :");
		s2 = sc.nextLine();

		if (s1.compareTo(s2) > 0) {
			System.out.println(s1 + " is greater than " + s2);
		} else if (s1.compareTo(s2) < 0) {
			System.out.println(s2 + " is greater than " + s1);
		} else {
			System.out.println("Both String are equals");
		}
		
	}

}
