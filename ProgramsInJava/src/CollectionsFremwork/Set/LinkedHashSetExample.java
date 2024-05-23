package CollectionsFremwork.Set;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
	public static void main(String[] args) {
		LinkedHashSet<String> set = new LinkedHashSet<>();
		set.add("Apple");
		set.add("Banana");
		set.add("Cherry");
		set.add("Banana");
		set.add("Gauava");
		set.add("Cherry");
		set.add("Banana");
		set.add("Orange");
		set.remove("Orange");
		for (String fruit : set) {
			System.out.println(fruit);
		}

	}
}
