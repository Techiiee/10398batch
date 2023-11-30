package loops;

import java.util.Scanner;

public class DoWhileExample2 {

	public static void main(String[] args) {
//      WAP to get input:
//		1                          
//		large                   
//		do u want to continue
//		yes or Y
//
//		2
//		medium
//		do u want to continue
//		yes or Y
//
//		3
//		small
//		do u want to continue
//		yes or Y
		
		String input;
		Scanner sc=new Scanner(System.in);
//		sc.close();
		
		do{
			System.out.println("Enter any number from 1 to 3");
			int choice=sc.nextInt();
			
			switch(choice) {
			     case 1:System.out.println("Large");
			     break;
			     case 2:System.out.println("Medium");
			     break;
			     case 3:System.out.println("Small");
			     break;
			     default:System.out.println("Not available");
			     break;
			}
			
		    System.out.println("Do you want to continue: yes or no");	
		    input=sc.next();
		}while(input.equals("yes"));
		sc.close();
	}

}
