package com.Java;

import java.util.Scanner;

public class AddTwoNumbers {
	public static void main(String[] args) {
		int x , y;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Pass the value of x :");
		 x = sc.nextInt();
		 
	    System.out.println("Pass the value of y :");
	     y = sc.nextInt();
	     
	     int resut = x+y;
	     System.out.println("Value after adding element :"+resut);
	
	}

}
