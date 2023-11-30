package filee;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EmployeeMain {

	public static void main(String[] args) throws IOException {
		Employee e1=new Employee("gayathri",56000,"pune");
        Employee e2=new Employee("sreeja",70000,"banglore");
        Employee e3=new Employee("mohana",66000,"mumbai");

        FileOutputStream fout=new FileOutputStream("input.txt");
        ObjectOutputStream out=new ObjectOutputStream(fout);
        out.writeObject(e1);
        out.writeObject(e2);
        out.writeObject(e3);
        out.close();
        System.out.println("write sucess");
	}

}
