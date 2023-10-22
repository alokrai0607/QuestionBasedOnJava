package zquestions.Interview;

import java.util.Scanner;

public class printAvg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("you can pass your number Here :");
		
		int x = sc.nextInt();
		
		int y = sc.nextInt();
		
		int z = sc.nextInt();
		
		int ans = (x+y+z)/3;
		
		System.out.println("Your avg will be :"+ans);
		
		

	}

}
