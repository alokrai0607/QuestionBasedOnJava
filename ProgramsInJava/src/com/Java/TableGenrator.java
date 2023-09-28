package com.Java;

import java.util.Scanner;

public class TableGenrator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Pass any value in simple Integer you want , "
				          +"you will found table from 1 to 10 of your Number :");
		
		int n = sc.nextInt();
		
		for(int i=1 ; i <=10 ; i++) {
			
			System.out.println(n*i);
		}

	}

}
