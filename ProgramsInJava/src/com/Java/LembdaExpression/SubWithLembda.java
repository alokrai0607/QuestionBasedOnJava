package com.Java.LembdaExpression;

interface SubTwo {

	void sub(Integer a, Integer b);

}

public class SubWithLembda {

	public static void main(String[] args) {

		SubTwo subTwo = (x, y) -> {
			System.out.println(Math.abs(x - y));
		};

		subTwo.sub(2, 20);
	}

}
