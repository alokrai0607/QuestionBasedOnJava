package DSA.SortingAlgos;

public class BubbleSortAlgoForString {

	public static void main(String[] args) {

		String[] a = { "Alok", "Ravi" , "Shiva", "Shashank" , "Mahima" };

		String temp;

		for (int i = 0; i < a.length; i++) {   // for number of rounds .

			int flag = 0;

			for (int j = 0; j < a.length - 1 - i; j++) { // for compare the elements .

				if (a[j].compareTo (a[j+1])>0) {

					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;

					flag = 1;
				}
			}

			if (flag == 0) {
				break;
			}
		}
		for (String i : a) {
			System.out.print(i + " ");
		}

	}

}
