package zquestions.Interview.Sort;

public class BubbleSortAlgoForString {

    public static void main(String[] args) {

        String[] a = {"ziya", "roshni", "alok", "Tanay", "ashish"};

        for (int i = 0; i < a.length; i++) {
            boolean flag = false;
            for (int j = 0; j < a.length - 1 - i; j++) {

                if (a[j].compareToIgnoreCase(a[j + 1]) > 0) { // Use compareToIgnoreCase
                    String temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }
        for (String i : a) {
            System.out.println(i + " ");
        }
    }
}
