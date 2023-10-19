package zquestions.Interview;

import java.util.Scanner;

public class swapNumberwithout3rdVar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Please pass the value of a :");
		int a = sc.nextInt();

		System.out.println("Please pass the value of b :");
		int b = sc.nextInt();

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("value of a will be :" + a);
		System.out.println("value of b will be :" + b);

	}

}
