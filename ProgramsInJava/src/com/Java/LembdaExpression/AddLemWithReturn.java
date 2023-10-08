package com.Java.LembdaExpression;

@FunctionalInterface
interface An {

	int print(int a, int b);
}

public class AddLemWithReturn {

//	public static void main(String[] args) {
//
//		An an = (a, b) -> {
//			return (a + b);
//		};
//		System.out.println(an.print(25, 50));
//
//	}

	public static void main(String[] args) {

		An an = (a, b) -> (a + b);

		System.out.println(an.print(25, 50));

	}

}
