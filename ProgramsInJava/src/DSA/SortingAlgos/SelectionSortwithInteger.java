package DSA.SortingAlgos;

public class SelectionSortwithInteger {

	public static void main(String[] args) {

		int[] list = { 38, 52, 9, 18, 6, 12, 3 };

		int min = 1;
		int temp = 0;

		for (int i = 0; i < list.length; i++) {

			min = i;
			for (int j = i + 1; j < list.length; j++) {

				if (list[j] < list[min]) {
					min = j;
				}
			}
			temp = list[i];
			list[i] = list[min];
			list[min] = temp;

		}
		for (int a : list) {
			System.out.println(a + " ");
		}
	}

}
