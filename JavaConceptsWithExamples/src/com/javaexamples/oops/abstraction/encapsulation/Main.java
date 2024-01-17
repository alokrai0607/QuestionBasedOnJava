package com.javaexamples.oops.abstraction.encapsulation;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Encapsulation> list = new ArrayList<>();

		list.add(new Encapsulation(1, "Alok", "Varanasi"));
		list.add(new Encapsulation(2, "Shivam", "Ghazipur"));
		list.add(new Encapsulation(3, "Ravina", "Lucknow")); // Corrected the ID to 3

		for (Encapsulation i : list) {
			System.out.println(i);
		}

	}

}
