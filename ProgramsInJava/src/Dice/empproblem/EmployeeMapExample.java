package Dice.empproblem;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeMapExample {
    public static void main(String[] args) {
     
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Alok", "Finance"));
        employees.add(new Employee(2, "Smita", "HR"));
        employees.add(new Employee(3, "Charan", "IT"));
        employees.add(new Employee(4, "Dhruva", "sales"));

        // Convert theArrayList to a Map 
        Map<Integer, Employee> employeeMap = employees.stream()
                .collect(Collectors.toMap(Employee::getEmpId, emp -> emp));

        // Print the Map
        employeeMap.forEach((key, value) -> {
            System.out.println("Key: " + key + ", Value: " + value);
        });
    }
}
