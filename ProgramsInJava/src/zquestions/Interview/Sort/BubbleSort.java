package zquestions.Interview.Sort;

public class BubbleSort {
	public static void main(String args[]) {
		int[] arr = { 1, 8, 7, 6, 25, 85, 0, 25 };

		for (int a = 0; a < arr.length; a++) {
			boolean f = false;
			for (int b = 0; b < arr.length - 1 - a; b++) {

				if (arr[b] > arr[b + 1]) {
					int t = arr[b];
					arr[b] = arr[b + 1];
					arr[b + 1] = t;
					f = true;
				}

			}
			if (!f) {
				break;
			}

		}
		for (int i : arr) {
			System.out.println(i + " ");
		}

	}
}
