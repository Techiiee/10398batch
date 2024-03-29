package onlineBookStore;

import java.util.ArrayList;
import java.util.Scanner;

public class BookList {

	int count = 0;
	double amount = 0.0;
	double sum = 0.0;
    Scanner sc = new Scanner(System.in);

	ArrayList<Book> books = new ArrayList<Book>();


	public void purchase() {
		System.out.println("Enter Book Id: ");
		int bookId = sc.nextInt();
		System.out.println("Enter Book Name: ");
		String bookName = sc.next();
		System.out.println("Enter Book Author: ");
		String author = sc.next();
		System.out.println("Enter Book Price: ");
		double price = sc.nextDouble();
		double total = price;
		books.add(new Book(bookId, bookName, author, price, total));
		count++;
	}

	public void receipt() {
		System.out.println("Bill");
		System.out.println("------------");
		for (Book b : books) {
			System.out.println("Book Id: " + b.getBookId() + "\nBook Name: " + b.getBookName() + "\nAuthor Name: " + b.getAuthor() + "\nBook Price: " + b.getPrice());
			sum += b.getTotal();
			System.out.println("Total amount to pay: " + sum);
		}
	}

	public void payment() {
		System.out.println("price of book is: " + sum);
		System.out.println("money paid by customer: ");
		amount = sc.nextDouble();
		double Balance = amount - sum;
		System.out.println("Remaining amount: " + Balance);
	}
	
	public void displayBooks() {
		if (books.size() == 0) {
			System.out.println("No Books Available");
		}

		for (Book b : books) {
			System.out.println(b);
		}
	}

	public void removeBook() {
		if (books.size() > 0) {
			books.clear();
			System.out.println("All books deleted");
		} else {
			System.out.println("No books found");
		}
	}

}
