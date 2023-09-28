package com.Java;

import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Pass any value which you want "+
		"it will give result is number is prime or not ");
		
		int  n = sc.nextInt();
		
		int count = 0;
		
		for(int i=1 ; i<= n ; i++ ) {
			
			if(n%i == 0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("Yes, " +n+ " is Prime Number");
		}else {
			System.out.println("No ,"+ n +" is not prime Number");
		}
		

	}

}
