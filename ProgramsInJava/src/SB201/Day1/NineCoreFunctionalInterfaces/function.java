package SB201.Day1.NineCoreFunctionalInterfaces;

import java.util.function.Function;

public class function {

	public static void main(String[] args) {

		Function<Integer, Boolean> res = x -> x > 50;
		System.out.println(res.apply(20));
		System.out.println(res.apply(90));

	}

}
