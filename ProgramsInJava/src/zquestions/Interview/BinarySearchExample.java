package zquestions.Interview;

public class BinarySearchExample {

	public static int binarySearch(int target) {
		int[] sortedArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int left = 0;
		int right = sortedArray.length - 1;

		while (left <= right) {
			int mid = left + (right - left) / 2;

			if (sortedArray[mid] == target) {
				return mid; 
			} else if (sortedArray[mid] < target) {
				left = mid + 1; 
			} else {
				right = mid - 1; 
			}
		}

		return -1; // Element not found
	}

	public static void main(String[] args) {
		int target = 9;

		int result = binarySearch(target);

		if (result != -1) {
			System.out.println("Element " + target + " found at index " + result);
		} else {
			System.out.println("Element " + target + " not found in the array.");
		}
	}
}
