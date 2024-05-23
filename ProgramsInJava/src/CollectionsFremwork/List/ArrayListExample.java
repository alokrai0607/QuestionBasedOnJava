package CollectionsFremwork.List;

import java.util.ArrayList;

public class ArrayListExample {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		System.out.println("After Using add () ");
		list.add("Cherry");
		list.add("Mango");
		list.add("Apple");
		list.add("Banana");
		

		for (String fruit : list) {
			System.out.println(fruit);
		}
		
		System.out.println("After Using Remove () ");
		
		list.remove(2);
		
		for (String fruit : list) {
			System.out.println(fruit);
		}
		
		
		
	}
}
