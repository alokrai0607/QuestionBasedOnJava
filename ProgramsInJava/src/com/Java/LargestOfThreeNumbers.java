package com.Java;

import java.util.Scanner;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {
		int x ,y ,z;
		
		Scanner sc = new Scanner(System.in);
		 System.out.println("Pass the value of X :");
		 x = sc.nextInt();
		 System.out.println("Pass the value of Y :");
		 y = sc.nextInt();
		 System.out.println("Pass the value of Z :");
		 z = sc.nextInt();
		 
		 if((x>y)&&(x>z)) {
			 System.out.println("X is large Number in all three");
		 }else if ((y>z)&&(y>x)){
			 System.out.println("Y is large Number in all three"); 
		 }else if ((z>y)&&(z>x)) {
			 System.out.println("Z is large Number in all three");
		 }else if(x==y&&x==z&&y==z) {
			 System.out.println("All are equals");
		 }else {
			 System.out.println("Please check Entered Number is not Distinct");
		 }
		 System.out.println("Thank You");
	}

}
