package com.Java.LembdaExpression;

@FunctionalInterface
interface Annonymous {

	void printNum(int x);

}

public class Main1 {

	public static void main(String[] args) {

		Annonymous lem = (l) -> System.out.println(l);

		lem.printNum(55);
	}

}
