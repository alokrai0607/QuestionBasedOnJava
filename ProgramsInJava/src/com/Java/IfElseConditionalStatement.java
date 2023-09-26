package com.Java;

import java.util.Scanner;

public class IfElseConditionalStatement {

	public static void main(String[] args) {
		
		int PassingMarks = 33;
		
		int obtainMarks;
		System.out.println("Pass Marks Obtain by Student :");
		Scanner sc = new Scanner (System.in);
		 obtainMarks = sc.nextInt()	;
		
		
		
		if(PassingMarks<=obtainMarks) {
			System.out.println("Student Passed in his Exam");
		}else if (PassingMarks>obtainMarks) {
			System.out.println("Student is fail need hard work ");
		}else {
			System.out.println("Please pass right marks of student");
		}
	
	}

}
