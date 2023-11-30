package collectionSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee e1 = new Employee("gayathri", 56000, "pune");
		Employee e2 = new Employee("sreeja", 70000, "banglore");
		Employee e3 = new Employee("mohana", 66000, "mumbai");

		ArrayList<Employee> emplist = new ArrayList<Employee>();
		emplist.add(e1);
		emplist.add(e2);
		emplist.add(e3);
		
		for (Employee e : emplist) {
			System.out.println(e);
		}
		System.out.println("=================Sorting==================");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the choice");
		int choice=sc.nextInt();
		if(choice==1) {
		NameSort n = new NameSort();
		Collections.sort(emplist, n);
		for (Employee e : emplist) {
			System.out.println(e);
		}
		}else {
			SalarySort n = new SalarySort();
			Collections.sort(emplist, n);
			for (Employee e : emplist) {
				System.out.println(e);
			}
		}
	}

}
