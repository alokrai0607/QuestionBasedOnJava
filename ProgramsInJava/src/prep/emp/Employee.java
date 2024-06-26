package prep.emp;

public class Employee {

	private Integer empId;
	private String empName;
	private String empDep;

	public Employee() {
		super();

	}

	public Employee(Integer empId, String empName, String empDep) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDep = empDep;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpDep() {
		return empDep;
	}

	public void setEmpDep(String empDep) {
		this.empDep = empDep;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empDep=" + empDep + "]";
	}

}


