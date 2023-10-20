package zquestions.Interview;

import java.util.TreeSet;

public class findSceondLargestInArray {

	public static void main(String[] args) {

		int[] array = { 10, 5, 20, 25, 30, 15 };

		// Create a TreeSet from the array
		TreeSet<Integer> treeSet = new TreeSet<>();
		for (int num : array) {
			treeSet.add(num);
		}

		// Remove the largest element
		treeSet.remove(treeSet.last());

		// The last element in the set will be the second largest
		int secondLargest = treeSet.last();
		System.out.println("The second largest element in the array is:" + secondLargest);

	}

}
