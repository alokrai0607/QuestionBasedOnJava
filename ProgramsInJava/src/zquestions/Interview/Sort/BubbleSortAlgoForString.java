package zquestions.Interview.Sort;

public class BubbleSortAlgoForString {

	public static void main(String[] args) {
		String[] pot = { "roshni", "ravina", "alok", "shivam", "vivek" };
		for (int i = 0; i < pot.length; i++) {
			Boolean ans = false;
			for (int j = 0; j < pot.length - 1 - i; j++) {
				if (pot[j].compareToIgnoreCase(pot[j + 1]) < 0) {
					String t = pot[j];
					pot[j] = pot[j + 1];
					pot[j + 1] = t;
					ans = true;
				}
			}
			if (!ans) {
				break;
			}
		}
		for (String s : pot) {
			System.out.println(s + " ");
		}
	}
}
