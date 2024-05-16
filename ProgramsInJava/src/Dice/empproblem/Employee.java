package Dice.empproblem;

public class Employee {
    private int empId;
    private String name;
    private String department;

    public Employee(int empId, String name, String department) {
        this.empId = empId;
        this.name = name;
        this.department = department;
    }

    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
