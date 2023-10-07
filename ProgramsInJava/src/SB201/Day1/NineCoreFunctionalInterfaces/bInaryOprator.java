package SB201.Day1.NineCoreFunctionalInterfaces;

import java.util.function.BinaryOperator;

public class bInaryOprator {

	public static void main(String[] args) {

		BinaryOperator<String> he = (x, y) -> (x + " " + y);
		System.out.println(he.apply("Hello", "Boy"));

	}

}
