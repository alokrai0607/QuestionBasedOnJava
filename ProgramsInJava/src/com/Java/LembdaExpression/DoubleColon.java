package com.Java.LembdaExpression;

interface Dc {
	void show();
}

public class DoubleColon {
	
	public static void display() {
		System.out.println("Hello Java");
	}

	public static void main(String[] args) {
	
		Dc dc = DoubleColon :: display;
	
		dc.show();

	}

}
