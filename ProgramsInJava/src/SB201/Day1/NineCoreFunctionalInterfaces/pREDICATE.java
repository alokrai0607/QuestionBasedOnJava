package SB201.Day1.NineCoreFunctionalInterfaces;

import java.util.function.Predicate;

public class pREDICATE {

	public static void main(String[] args) {
		Predicate<Integer> result = x -> (x > 20);
		
		System.out.println(result.test(1));   //false
		
		System.out.println(result.test(21));   // true
	}

}
