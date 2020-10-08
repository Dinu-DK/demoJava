import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class EmployeeList {
	String empName;
	int empNo;
	int empSalary;

	EmployeeList(String e_name, int e_no, int e_salary) {
		empName = e_name;
		empNo = e_no;
		empSalary = e_salary;
	}

	public void display() {
		System.out.print(" Employee Name : "+empName+ " his no :" + empNo + " and salary : " + empSalary);
		System.out.println();
	}
}

public class ListOfEmpl {
	public static void main(String args[]) {
		EmployeeList s1 = new EmployeeList("Gopi", 1, 10000);
		EmployeeList s2 = new EmployeeList("Dinesh", 2, 15000);
		EmployeeList s3 = new EmployeeList("Aswin", 3, 20000);
		LinkedList empllist = new LinkedList();
		empllist.add(s1);
		empllist.add(s2);
		empllist.add(s3);
		System.out.println(empllist);
		Iterator it = empllist.iterator();

	}
}