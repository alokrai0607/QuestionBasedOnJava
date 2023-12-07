package Interview.Range5_6.DSA;

public class SecondLargestInArray {
	public static int findSecondLargest(int[] arr) {
		if (arr.length < 2) {
			System.out.println("Array should have at least two elements.");
			return -1;
		}

		int firstLargest = arr[0];
		int secondLargest = arr[1];

		if (secondLargest > firstLargest) {
			int temp = firstLargest;
			
			firstLargest = secondLargest;
			
			secondLargest = temp;
		}

		for (int i = 2; i < arr.length; i++) {
			if (arr[i] > firstLargest) {
				secondLargest = firstLargest;
				firstLargest = arr[i];
			} else if (arr[i] > secondLargest && arr[i] != firstLargest) {
				secondLargest = arr[i];
			}
		}

		return secondLargest;
	}

	public static void main(String[] args) {
		int[] arr = { 10, 5, 7, 18, 12, 8 };
		int secondLargest = findSecondLargest(arr);
		System.out.println("The second largest element in the array is: " + secondLargest);
	}
}
