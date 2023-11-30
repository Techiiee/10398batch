package filee;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserialiseExample {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fin=new FileInputStream("input.txt");
		ObjectInputStream oin=new ObjectInputStream(fin);
		Employee e=(Employee) oin.readObject();
		System.out.println(e.geteId());
		System.out.println(e.geteName());
		System.out.println(e.getSalary());
		Employee e1=(Employee) oin.readObject();
		System.out.println(e1.geteId());
		System.out.println(e1.geteName());
		System.out.println(e1.getSalary());
		Employee e2=(Employee) oin.readObject();
		System.out.println(e2.geteId());
		System.out.println(e2.geteName());
		System.out.println(e2.getSalary());
	}

}
