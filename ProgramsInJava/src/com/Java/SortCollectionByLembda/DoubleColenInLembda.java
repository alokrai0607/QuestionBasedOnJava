package com.Java.SortCollectionByLembda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.Java.SortCollectionByLembda.ArrayListLembda.Employee;

public class DoubleColenInLembda {

	public static void main(String[] args) {
		
		List<Employee> emp = new ArrayList<Employee>();
		emp.addAll(Arrays.asList(
				new Employee(1, "alok"), 
				new Employee(10, "aryan"), 
				new Employee(3, "shiva"), 
				new Employee(7, "Ravi"),
				new Employee(12, "Ashaish"),
				new Employee(15, "Rishabh"), 
				new Employee(5, "Pari"))
				
				);
		System.out.println(emp);
		
		
		//***************************************************************//
		
		// Lambda Expression using Double colon . 
		Collections.sort(emp, Comparator.comparing(Employee :: getEmpName));
		System.out.println(emp);
		

	}

}
