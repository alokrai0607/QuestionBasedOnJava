package SB201.Day1.NineCoreFunctionalInterfaces;

import java.util.HashMap;
import java.util.Map;

public class biConsumer {

//	public static void main(String[] args) {
//		BiConsumer<String,String> res = (a,b)->System.out.println(a+" + "+b);
//		res.accept("Alok","Rai");
//	}
	
	
	public static void main(String[] args) {
		Map<Integer,String> element = new HashMap<>() ;
		element.put(95, "Alok");
		element.put(85, "Rohit");
		element.put(66, "Ashish");
		element.put(90, "Shivs");
		element.put(17, "Roshni");
		
		element.forEach((a,b)->System.out.println(a+" is obtain by "+b));
	}
}
