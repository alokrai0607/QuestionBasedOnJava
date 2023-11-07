package zquestions.Interview.Sort;

public class InsertionSort {

	public static void main(String[] args) {

		int[] con = { 25, 85, 95, 36, 45, 75, 15, 9, 6, 9, 8, 74, 7, 57, 12, 7, 3, 7, 32 };

		for (int i = 1; i < con.length; i++) {
			int current = con[i];
			int nvar = i - 1;
			while (nvar >= 0 && con[nvar] > current) {
				con[nvar + 1] = con[nvar];
				nvar--;
			}
			con[nvar + 1] = current;
		}
		for (int j : con) {
			System.out.println(j + " ");
		}

	}
}
