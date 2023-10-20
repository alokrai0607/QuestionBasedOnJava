package zquestions.Interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class findSceondLargestInArray {

	public static void main(String[] args) {

		List<Integer> v = new ArrayList<>(Arrays.asList(12, 35, 1, 10, 34, 1));

		Set<Integer> s = new TreeSet<>(v);

		v.clear();

		for (int value : s) {
			v.add(value);
		}

		int n = v.size();

		System.out.print("The Second Largest Element in ArrayList is: ");
		System.out.println(v.get(n - 2));

	}

}
