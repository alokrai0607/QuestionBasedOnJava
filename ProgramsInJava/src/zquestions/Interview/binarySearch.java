package zquestions.Interview;

public class binarySearch {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int target = 15;

		for (int i = 0; i <= arr.length - 1; i++) {
		
			if (arr[i] == target) {
				System.out.println(i);
			}
		}
		System.out.println("-1");

	}

}
