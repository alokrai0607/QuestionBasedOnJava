package zquestions.Interview.Sort;

public class InsertionSortforString {
	public static void main(String[] args) {
		String[] a = { "banana", "apple", "orange", "cherry", "kiwi" };
		String temp;
		int var;
		for (int i = 1; i < a.length; i++) {
			temp = a[i];
			var = i;
			while (i > 0 && a[i - 1].compareTo(temp) < 0) {
				a[i] = a[i - 1];
				i = i - 1;
			}
			a[i] = temp;
		}
		for (String k : a) {
			System.out.println(k + " ");
		}
	}
}
