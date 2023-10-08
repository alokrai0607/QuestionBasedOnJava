package com.Java.SortCollectionByLembda;

public class Employee {

	private String EmpName;

	private Integer EmpId;

	public Employee(String empName, Integer empId) {
		super();
		EmpName = empName;
		EmpId = empId;
	}

	public String getEmpName() {
		return EmpName;
	}

	public void setEmpName(String empName) {
		EmpName = empName;
	}

	public Integer getEmpId() {
		return EmpId;
	}

	public void setEmpId(Integer empId) {
		EmpId = empId;
	}

	@Override
	public String toString() {
		return "Employee [EmpName=" + EmpName + ", EmpId=" + EmpId + "]";
	}

}
