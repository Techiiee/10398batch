package usermanagementsystem;

import java.sql.SQLException;
import java.util.Scanner;

public class UserMain {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("====================================================================");
		System.out.println("============= User Management System =============================");
		System.out.println("====================================================================");
		String ch;
		UserService app = new UserService();
		do {

			System.out.println("\t\t 1)View user Information\r\n" + "\t\t 2)Insert user info by student id.\r\n"
					+ "\t\t 3)view all user information By Id.\r\n" + "\t\t 4)Update user information by id.\r\n"
					+ "\t\t 5)delete user information by id.\r\n" + "\t\t 6)delete all user information.");
			System.out.println("====================================================================");
			System.out.println("Enter your choice:");
			int choice = sc.nextInt();

			switch (choice) {

			case 1:
				app.viewUser();
				break;
			case 2:app.insertUser();
				break;
			case 3:app.updateUser();
			break;
			case 4:app.viewUserById();
			break;
			case 5:app.deleteUser();
			break;
			
			case 6:app.deleteAllUser();
			break;
			default:
				System.out.println("Wrong choice!!");
			}
			System.out.println("Do you want to continue? (Y-Yes / N-No)");
			ch = sc.next();
		} while (ch.equals("Y") || ch.equals("y"));
		System.out.println("====================================================================");

		System.out.println("Bye....");

		System.out.println("====================================================================");
		sc.close();
	}
}
