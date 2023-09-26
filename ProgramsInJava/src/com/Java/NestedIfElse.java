package com.Java;

import java.util.Scanner;

public class NestedIfElse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int passingMarks = 33 ;
		int obtainMarks ;
		System.out.println("Pass the Obtain marks of Sudent :");
		
		obtainMarks = sc.nextInt();
		
		if(passingMarks<=obtainMarks) {
			
			if(obtainMarks>=90) {
				System.out.println("Gread A");
			}else if (obtainMarks<=80) {
				System.out.println("Gread B");
			}else if (obtainMarks<=60) {
				System.out.println("Gread C");
			}else {
				System.out.println("Gread F");
			}
		}else if(obtainMarks<33){
			System.out.println("Gread F");
		}
		
	}
}
