package PrototypeDesignPattern;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee e1=new Employee(1001,"gayathri","kknagar",45000);
		Employee e2=(Employee) e1.getClone();
	     e1.display();
	     e2.display();
	}

}
