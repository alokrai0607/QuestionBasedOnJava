package SB201.Day1.NineCoreFunctionalInterfaces;

import java.util.function.BiConsumer;

public class biConsumer {

	public static void main(String[] args) {
		BiConsumer<String,String> res = (a,b)->System.out.println(a+" + "+b);
		res.accept("Alok","Rai");
	}
}
