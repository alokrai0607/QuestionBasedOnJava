package com.Java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class sumOfAllOdd {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the length of the list:");
        int n = sc.nextInt();

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        int sum = 0;
        for (int i : list) {
            if (i % 2 == 1) { 
                sum += i; 
            }
        }
        System.out.println("Output will be: " + sum);
    }
}
