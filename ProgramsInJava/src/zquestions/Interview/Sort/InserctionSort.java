package zquestions.Interview.Sort;

public class InserctionSort {

	public static void main(String[] args) {
		int[] a = { 21, 25, 85, 75, 35, 2, 4, 48, 86, 62, 24, 15, 95, 55 };
		int temp;
		int var;
		for (int i = 0; i < a.length; i++) {
			temp = a[i];
			var = i;
			while (i > 0 && a[i - 1] < temp) {
				a[i] = a[i - 1];
				i = i - 1;
			}
			a[i] = temp;
		}
		for (int k : a) {
			System.out.println(k + " ");
		}
	}
}
