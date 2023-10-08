package com.Java.SortCollectionByLembda.ArrayListLembda;

public class Employee {

	private Integer EmpId;

	private String EmpName;

	public Employee() {
		super();
	}

	public Employee(Integer empId, String empName) {
		super();
		EmpId = empId;
		EmpName = empName;
	}

	public Integer getEmpId() {
		return EmpId;
	}

	public void setEmpId(Integer empId) {
		EmpId = empId;
	}

	public String getEmpName() {
		return EmpName;
	}

	public void setEmpName(String empName) {
		EmpName = empName;
	}

	@Override
	public String toString() {
		return "Employee [EmpId=" + EmpId + ", EmpName=" + EmpName + "]";
	}

}
