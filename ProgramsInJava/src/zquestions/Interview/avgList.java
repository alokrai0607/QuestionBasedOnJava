package zquestions.Interview;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class avgList {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Integer> list = new ArrayList<>();

		System.out.println("please pass Here how many no youare going to pass i your array :");
		int n = sc.nextInt();

		System.out.println("Your No will be :");

		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}

		int sum = 0;
		for (int i : list) {
			sum += i;
		}
		int ans = (sum / list.size());
		System.out.println("OutPut :" + ans);
	}

}
