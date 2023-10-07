package SB201.Day1.NineCoreFunctionalInterfaces;

import java.util.function.UnaryOperator;

public class UneryOprator {

//	public static void main(String[] args) {
//		UnaryOperator<Integer> u = x -> x+5;
//		System.out.println(u.apply(10));
//
//	}
	
	public static void main(String[] args) {
		UnaryOperator<String> str = x -> "Hello Java";
		System.out.println(str.apply("Namaste"));
		
	}

}
