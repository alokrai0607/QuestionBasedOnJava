package SB201.Day1.NineCoreFunctionalInterfaces;

import java.util.function.BiPredicate;

public class biPredicate {

	public static void main(String[] args) {

		BiPredicate<Integer, Integer> res = (x, y) -> (x < y);

		System.out.println(res.test(25, 90));

	}

}
