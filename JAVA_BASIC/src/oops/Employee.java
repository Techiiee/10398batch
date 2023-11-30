package oops;

public class Employee {
	
	int id,salary;
	String name,address;
	
	public Employee(int eid, int sal, String n, String a) {
		id = eid;
		salary = sal;
		name = n;
		address = a;
	}

	double pf() {
		double pf= (salary*18)/100;
		return pf;
	}
	
	double annualSalary() {
		int annualSal=salary*12;
		return annualSal;
	}


	public String toString() {
		return "id=" + id + ", \nsalary=" + salary + ", \nname=" + name + ", \naddress=" + address + ", \npf()="
				+ pf() + ",\nannualSalary()=" + annualSalary() ;
	}
	
	

}
