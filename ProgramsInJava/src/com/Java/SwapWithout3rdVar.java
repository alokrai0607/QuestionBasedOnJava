package com.Java;

import java.util.Scanner;

public class SwapWithout3rdVar {

	public static void main(String[] args) {
		int x , y ; 
		Scanner sc = new Scanner(System.in);
		System.out.println("Please pass the value of X :");
		 x = sc.nextInt();
		System.out.println("Please pass again the value of Y :");
		 y = sc.nextInt() ;
		 
		 System.out.println("Swapping Started using two variables :");
		 x = x+y;
		 y = x-y;
		 x = x-y;
		 
		 System.out.println("Value of X is after swapping :"+x);
		 System.out.println("Value of Y is after swapping :"+y);
	}

}
