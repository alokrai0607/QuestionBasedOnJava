package com.Java;

public class reverseNumWithoutArray {

	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		int a = 12345;
		int st = 0; // corrected variable name from St to st
		int remainder;
		while (a > 0) {
			remainder = a % 10;
			st = (st * 10) + remainder; // corrected from st*100 to st*10
			a /= 10;
		}
		System.out.println("Reversed number: " + st);
	}
}
