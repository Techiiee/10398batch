package ConditionalStatement;

import java.util.Scanner;

public class SwitchCaseExample {

	public static void main(String[] args) {
		// WAP to get a alphabet based on data display using switch?
		 //input: A, o/p:Apple
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter any alphabet in lowercase:");
			char alpha=sc.next().charAt(0);
            sc.close();
            
            switch(alpha) {
                  case 'a':System.out.println("Apple");
                  break;
                  case 'b':System.out.println("Ball");
                  break;
                  case 'c':System.out.println("Cat");
                  break;
                  case 'd':System.out.println("Dog");
                  break;
                  case 'e':System.out.println("Egg");
                  break;
                  case 'f':System.out.println("Fish");
                  break;
                  case 'g':System.out.println("Gun");
                  break;
                  case 'h':System.out.println("Hat");
                  break;
                  case 'i':System.out.println("Ice-cream");
                  break;
                  case 'j':System.out.println("Jar");
                  break;
                  default:System.out.println("Wrong input");
            }
	}

}
