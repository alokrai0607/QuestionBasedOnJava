package SB201.Day1.NineCoreFunctionalInterfaces;

import java.util.function.BiFunction;

public class biFunction {
	public static void main(String[] args) {
		
		BiFunction<Integer, Integer, String> h = (a, b) -> a + "" + b;
		System.out.println(h.apply(9, 8));
	}

}
