package onlineBookStore;

import java.util.Scanner;

public class BookMain {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		BookList book=new BookList();
		String ch;
		do
		{
		System.out.println("====================================================================");
		System.out.println("\t\t 1)Purchase books\r\n"
				+ "\t\t 2)Receipt\r\n"
				+ "\t\t 3)Payment.\r\n"
				+ "\t\t 4)View purchase\r\n"
				+ "\t\t 5)delete Books\r\n"
				+ "\t\t 6)Exit");
		System.out.println("====================================================================");
		System.out.println("Enter your choice:");
		int choice=sc.nextInt();
		
		switch(choice)
		{
		
		case 1:	book.purchase();
				break;
		case 2:	book.receipt();
		break;
		case 3:	book.payment();
		break;
		case 4:	book.displayBooks();
		break;
		case 5:	book.removeBook();
		break;
	    default:System.out.println("Wrong choice!!"); 		   
		 
		}
		
		System.out.println("Do you want to continue? (Y-Yes / N-No)");
		 ch=sc.next();
		 System.out.println("===========================");
		}
		while(ch.equals("Yes")||ch.equals("yes"));
	}

}
