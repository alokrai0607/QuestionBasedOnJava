package zquestions.Interview.Sort;

public class BubbleSortAlgoForString {

	public static void main(String[] args) {
		String[] pot = { "roshni", "ravina", "alok", "shivam", "vivek" };

		for (int i = 0; i < pot.length; i++) {
			boolean data = false;
			for (int j = 0; j < pot.length - 1 - i; j++) {
				if (pot[j].compareToIgnoreCase(pot[j + 1]) < 0) {
					String tem = pot[j];
					pot[j] = pot[j + 1];
					pot[j + 1] = tem;
					data = true;
				}
			}
			if (!data) {
				break;
			}
		}
		for (String dada : pot) {
			System.out.println(dada + " ");
		}

	}
}
