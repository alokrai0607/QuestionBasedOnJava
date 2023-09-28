package com.Java;

import java.util.Scanner;

public class TableinRange {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("please give range from one to another which you want to genrate :");
		int a = sc.nextInt();
		int b = sc.nextInt();

		for (int i = a; i <= b; i++) {
			System.out.println("Table of " + i);
			for (int j = 1; j <= 10; j++) {

				System.out.println(i + "*" + j + " =" + i * j);
			}
		}
	}
}
