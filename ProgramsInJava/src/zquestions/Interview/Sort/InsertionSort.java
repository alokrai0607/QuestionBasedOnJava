package zquestions.Interview.Sort;

public class InsertionSort {

	public static void main(String[] args) {

		int[] arr = { 25, 85, 95, 36, 45, 75, 15, 9, 6, 9, 8, 74, 7, 57, 12, 7, 3, 7, 32 };

		for (int i = 1; i < arr.length; i++) {
			int current = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > current) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = current;
		}

		for (int a = 0; a < arr.length; a++) {
			System.out.println(arr[a]);
		}
	}
}
