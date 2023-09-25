package com.Java;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
		int x , y , bag;
		Scanner sc = new Scanner(System.in);
		System.out.println("Pass the vale of X :");
		x = sc.nextInt();
		System.out.println("Value of X :"+x);
		System.out.println("pass the value of Y :");
		y = sc.nextInt();
		System.out.println("Value of Y :"+y);
		
		System.out.println("Swap Started...........");
		bag = x;
		x = y ; 
		y = bag ;
		
		System.out.println("After Swapping value of x :"+x);
		System.out.println("After Swapping value of y :"+y);
	}

}
