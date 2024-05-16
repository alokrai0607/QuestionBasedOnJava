package prep.emp;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import Dice.empproblem.Employee;

public class Main {

	  public static void main(String[] args) {
		     
	        List<Employee> emp = new ArrayList<>();
	        emp.add(new Employee(1, "Alok", "Finance"));
	        emp.add(new Employee(2, "Smita", "HR"));
	        emp.add(new Employee(3, "Charan", "IT"));
	        emp.add(new Employee(4, "Dhruva", "sales"));

	        // Convert theArrayList to a Map 
	        Map<Integer, Employee> empMap = emp.stream()
	        									.collect
	        									(Collectors.toMap
    											(Employee::getEmpId, x -> x));

	        // Print the Map
	        empMap.forEach((key, value) -> {
	            System.out.println("Key: " + key + ", Value: " + value);
	        });
	    }

}
