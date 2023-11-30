package oops;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee e1=new Employee(101,40000,"Preeti","Jaipur");
		
		System.out.println(e1);
		
	System.out.println("----------------------------------------------");
		
		Employee e2=new Employee(102,50000,"Khushi","Banglore");
		System.out.println(e2);
		
		
//		System.out.println("Employee name=" +e1.name);
//		System.out.println("Employee id="+e1.id);
//		System.out.println("Employee monthly salary= " + e1.salary);
//		System.out.println("Employee address="+e1.address);
//		System.out.println("Employee pf=" +e1.pf());
//		System.out.println("Employee annual salary=" +e1.annualSalary());
		
		
	//without constructor we assign value like this
//		e2.name="Khushi";
//		e2.id=101;
//		e2.salary=50000;
//		e2.address="Kota";
		
		
//		without toString we print value like this
		
//		System.out.println("Employee name=" +e2.name);
//		System.out.println("Employee id="+e2.id);
//		System.out.println("Employee monthly salary= " + e2.salary);
//		System.out.println("Employee address="+e2.address);
//		System.out.println("Employee pf=" +e2.pf());
//		System.out.println("Employee annual salary=" +e2.annualSalary());

	}

}
