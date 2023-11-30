package lambdaexpression;

import java.util.ArrayList;
import java.util.List;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee e1 = new Employee("gayathri", 56000, "pune");
		Employee e2 = new Employee("sreeja", 70000, "banglore");
		Employee e3 = new Employee("mohana", 66000, "mumbai");

		ArrayList<Employee> emplist = new ArrayList<Employee>();
		emplist.add(e1);
		emplist.add(e2);
		emplist.add(e3);
//		for (Employee e : emplist) {
//			System.out.println(e);
//		}
//		
//		System.out.println("---max salary---");
//		maxSalary(emplist);
		
		long count = emplist.stream().filter(str->str.getSalary()>60000).count();
		 System.out.println(count);
	}

	public static void maxSalary(List<Employee> e) {
		for (Employee emplist : e) {
			if (emplist.getSalary() > 60000) {
				System.out.println(emplist.geteName());
			}
		}
	}
}
