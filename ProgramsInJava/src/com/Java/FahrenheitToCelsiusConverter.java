package com.Java;

import java.util.Scanner;

public class FahrenheitToCelsiusConverter {
	public static void main(String[] args) {
		float tem;
		Scanner sc = new Scanner(System.in);
		System.out.println("Pass you body temprature in Fahrenheit :");
		
		tem = sc.nextInt();
		tem = (((tem-32)*5)/9);
		System.out.println("Temprature in Celsius :"+tem);
	}

}
