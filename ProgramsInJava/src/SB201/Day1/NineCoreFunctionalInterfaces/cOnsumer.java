package SB201.Day1.NineCoreFunctionalInterfaces;

import java.util.function.Consumer;

public class cOnsumer {

	public static void main(String[] args) {
		
		Consumer<String> str = x -> System.out.println((x.length()));
		
		str.accept("Alok Rai Shivam");
	}

}
