package SB201.Day1.NineCoreFunctionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class cOnsumer {

//	public static void main(String[] args) {
//		
//		Consumer<String> str = x -> System.out.println((x.length()));
//		
//		str.accept("Alok Rai Shivam");
//	}

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);

		Consumer<Integer> a = x -> System.out.println(x);

		list.stream().forEach(a);
	}

}
