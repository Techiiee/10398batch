package collections;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee e1=new Employee("gayathri",56000,"pune");
		Employee e2=new Employee("sreeja",70000,"banglore");
		Employee e3=new Employee("preeti",66000,"mumbai");

		ArrayList<Employee>emplist=new ArrayList<Employee>();
		emplist.add(e1);
		emplist.add(e2);
		emplist.add(e3);
		System.out.println(emplist);
		System.out.println("=================Sorting==================");
		Collections.sort(emplist);
	       for(Employee e:emplist)
	       {
	    	   System.out.println(e);
	       }
	}

}
