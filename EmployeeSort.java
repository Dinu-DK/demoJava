import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class EmployeeSort {
	public static void main(String[] args) {
		Employee e1 = new Employee("Aswin" , 1, 34);
		Employee e2 = new Employee("Dinesh" , 2, 30);
		Employee e3 = new Employee("Gopi", 3, 31);
		Employee e4 = new Employee("Ajay" , 4, 25);

		List<Employee> employees = new ArrayList<Employee>();
		employees.add(e2);
		employees.add(e3);
		employees.add(e1);
		employees.add(e4);

		Collections.sort(employees, new FirstNameSorter());

		 System.out.println(employees);
	}
}