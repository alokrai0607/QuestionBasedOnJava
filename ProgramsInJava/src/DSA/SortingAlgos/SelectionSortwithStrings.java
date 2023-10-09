package DSA.SortingAlgos;

public class SelectionSortwithStrings {

	public static void main(String[] args) {

		String[] list = { "Kalyani", "Radhikesh", "Murli", "Rohit", "Karishma", "Mrunali", "Alok" };

		int min = 1;
		String temp = "";

		for (int i = 0; i < list.length; i++) {

			min = i;
			for (int j = i + 1; j < list.length; j++) {

				if (list[j].compareTo(list[min]) < 0) {
					min = j;
				}
			}
			temp = list[i];
			list[i] = list[min];
			list[min] = temp;

		}
		for (String a : list) {
			System.out.println(a + " ");
		}
	}

}
