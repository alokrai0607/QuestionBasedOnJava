package com.Java;

import java.util.Scanner;

public class checkOddandEven {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Pass any value for check No is Even or Odd :");
        
		int number = sc.nextInt();
		
	    if (number%2 == 0) {
	    	System.out.println(number + " is Even ");
	    }else {
	    	System.out.println(number + " is Odd ");
	    }
	}

}
