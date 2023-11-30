package strings;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		//1.WAP To get a firstname and LastName and display the full name?
			
		Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
		System.out.print("Enter first name: ");  
		String fName= sc.nextLine();  
		
		System.out.print("Enter last name: ");  
		String lName= sc.nextLine(); 
		
		System.out.println(fName + " " + lName);
		
//		String fullname=fName.concat(lName);
//		System.out.println("The FullName=:"+fullname);
		
		
	}

}
