package com.Java.LembdaExpression;

@FunctionalInterface
interface Anno {

	void printNum(int x, int y);

}

public class Main2 {

	public static void main(String[] args) {

		//System.out.println("Hello Lambda");

		Anno lem = (l, m) -> System.out.println(l * m);

		lem.printNum(10, 5);
	}

}