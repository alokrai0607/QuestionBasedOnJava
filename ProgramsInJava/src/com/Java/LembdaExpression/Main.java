package com.Java.LembdaExpression;

interface Lem {

	void show();
}

public class Main {

//	public static void main(String[] args) {
//
//		Lem x = () -> {
//			System.out.println("Hello Lembda");
//		};
//		x.show();
//
//	}

	public static void main(String[] args) {

		Lem x = () -> System.out.println("Hello Lembda without Param");

		x.show();

	}

}
