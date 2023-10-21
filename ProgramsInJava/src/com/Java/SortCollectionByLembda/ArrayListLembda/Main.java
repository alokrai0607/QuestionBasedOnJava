package com.Java.SortCollectionByLembda.ArrayListLembda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Employee> emp = new ArrayList<Employee>();
		emp.addAll(Arrays.asList(

				new Employee(1, "alok"), new Employee(10, "aryan"), new Employee(3, "shiva"), new Employee(7, "Ravi"),
				new Employee(12, "Ashaish"), new Employee(15, "Rishabh"), new Employee(5, "Pari")));

		
		System.out.println(emp);

//		Comparator<Employee> comp = new Comparator<Employee>() {
//
//			public int compare(Employee e1, Employee e2) {
//				return e1.getEmpName().compareTo(e2.getEmpName());
//			}
//
//		};
//		Collections.sort(emp, comp);
//		System.out.println(emp);

		// Same thing with Lambda Expression .

		Collections.sort(emp, (Employee e1, Employee e2) -> e1.getEmpName().compareTo(e2.getEmpName()));

		System.out.println(emp);

	}

}
