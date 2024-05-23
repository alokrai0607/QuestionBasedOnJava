package CollectionsFremwork.List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {
	public static void main(String[] args) {
		List<String> arrayList = new ArrayList<>();
		arrayList.add("Apple");
		arrayList.add("Banana");
		arrayList.add("Cherry");

		System.out.println("ArrayList:");
		for (String fruit : arrayList) {
			System.out.println(fruit);
		}

		List<String> linkedList = new LinkedList<>();
		linkedList.add("Dog");
		linkedList.add("Elephant");
		linkedList.add("Frog");

		System.out.println("LinkedList:");
		for (String animal : linkedList) {
			System.out.println(animal);
		}
	}
}
