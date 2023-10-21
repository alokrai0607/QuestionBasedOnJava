package SB201.Day1.NineCoreFunctionalInterfaces;

import java.util.function.Supplier;

public class sUpplier {

	public static void main(String[] args) {

		Supplier<String> k = () -> "Hello Java";
		
		System.out.println(k.get());

	}

}
