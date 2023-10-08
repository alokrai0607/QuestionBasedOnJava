package com.Java.LembdaExpression;

interface Dc {
	void show();
}

class ABC {
	public static void display() {
		System.out.println("Hello Java");
	}
}

public class DoubleColon {

	public static void main(String[] args) {
		Dc dc = ABC::display;
		dc.show();
	}
	
}
