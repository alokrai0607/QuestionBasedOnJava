package com.Java.LembdaExpression.asArgument;


interface Calculator{
	public int opt(int x ,  int y);
}

public class Main {

	public static void main(String[] args) {
		
		Calculator plusOp = (a,b)-> a+b;
		Calculator minusOp = (a,b)->a-b;
		Calculator multiOp = (a,b)->a*b;
		Calculator divOp = (a,b)->a/b;
		
		System.out.println(plusOp.opt(10, 20));
		System.out.println(minusOp.opt(10, 20));
		System.out.println(multiOp.opt(10, 20));
		System.out.println(divOp.opt(20, 10));
		
		
	}

}

