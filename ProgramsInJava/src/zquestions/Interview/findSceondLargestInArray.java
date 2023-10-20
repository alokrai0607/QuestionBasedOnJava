package zquestions.Interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class findSceondLargestInArray {

	public static void main(String[] args) {

		List<Integer> l = new ArrayList<>(Arrays.asList(10, 50, 80, 20, 30, 77));
		Set<Integer> s = new TreeSet<Integer>(l);
		l.clear();
		for (int num : s) {
			l.add(num);
		}
		int n = l.size();
		System.out.println(l.get(n - 2));
	}

}
