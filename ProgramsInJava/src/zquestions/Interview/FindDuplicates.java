package zquestions.Interview;

import java.util.ArrayList;
import java.util.HashSet;

public class FindDuplicates {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 2, 5, 6, 3, 7, 8, 1 };
		//int[] arr = {};
		ArrayList<Integer> duplicates = new ArrayList<>();
		HashSet<Integer> set = new HashSet<>();

		for (int num : arr) {
			if (!set.add(num) && !duplicates.contains(num)) {
	
					duplicates.add(num);
			}
		}

		if (duplicates.isEmpty()) {
			System.out.println(-1);
		} else {
			System.out.println("Duplicates present in the array are: ");
			for (int num : duplicates) {
				System.out.print(num + " ");
			}
		}
	}
}
