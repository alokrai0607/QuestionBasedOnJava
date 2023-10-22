package com.Java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class sumOfAllEven {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Integer> l = new ArrayList<>();

		System.out.println("How many No you want to pass please tell me :");
		int n = sc.nextInt();
		
		System.out.println("here you are going to pass your Numbers :");
		for (int i = 0; i < n; i++) {
			l.add(sc.nextInt());
		}
       
		int sum = 0;
		for (int i = 0; i < l.size(); i++) {
			if (l.get(i) % 2 == 0) {
				sum += l.get(i);
			}else if(l.get(i)%2==1){
				System.out.println("No any evenNumber is Here please check");
			}
		}
		System.out.println("Output will be :"+sum);

	}

}
