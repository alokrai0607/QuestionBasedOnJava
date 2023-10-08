package com.Java.LembdaExpression;

interface AddTwoNumbers {

	void add(Integer x, Integer y);
}

public class LebdaAdd {

	public static void main(String[] args) {

		AddTwoNumbers addTwoNumbers = (x, y) -> {
			System.out.println(x + y);
		};
		addTwoNumbers.add(5, 5);
	}

}
