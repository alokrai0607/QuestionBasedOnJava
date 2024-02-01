package zquestions.Interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 3, 4, 5, 5, 6 };
		int[] result = removeDuplicates(arr);
		System.out.println(Arrays.toString(result)); // Output: [1, 2, 3, 4, 5, 6]
	}

	public static int[] removeDuplicates(int[] nums) {
		Set<Integer> set = new HashSet<>();
		List<Integer> resultList = new ArrayList<>();

		for (int num : nums) {
			if (!set.contains(num)) {
				set.add(num);
				resultList.add(num);
			}
		}

		int[] result = new int[resultList.size()];
		for (int i = 0; i < result.length; i++) {
			result[i] = resultList.get(i);
		}

		return result;
	}
}
