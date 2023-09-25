package com.Java;

import java.math.BigInteger;
import java.util.Scanner;

public class AddingLargeNumbers {

	public static void main(String[] args) {
		String n1 , n2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your first largest number :");
		n1 = sc.nextLine();
		
		System.out.println("Enter Your Second largest number :");
		n2 = sc.nextLine();
		
		BigInteger fNumber = new BigInteger(n1);
		BigInteger sNumber = new BigInteger(n2);
		
		BigInteger sum ;
		sum = fNumber.add(sNumber);
        System.out.println("Result is "+sum);
	}

}
