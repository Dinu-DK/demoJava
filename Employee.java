class Employee {
	String empName;
	int empNo;
	int empSalary;
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public int getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}
	public Employee(String empName, int empNo, int empSalary) {
		super();
		this.empName = empName;
		this.empNo = empNo;
		this.empSalary = empSalary;
	}
	@Override
	public String toString() {
		return "Employee name" + empName + ", empNo=" + empNo + ", empSalary=" + empSalary;
	}


}