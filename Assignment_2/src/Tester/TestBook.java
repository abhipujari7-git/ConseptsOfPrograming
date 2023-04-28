package Tester;

import java.util.Scanner;

import Classes.Book;

public class TestBook {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("BName ID Author Price");
		Book b = new Book(sc.next(), sc.nextInt(), sc.next(), sc.nextInt());

		b.display();

		System.out.println("Change Price");
		b.setPrice(sc.nextInt());
		System.out.println("Change id");
		b.setId(sc.nextInt());
		System.out.println("Change Author");
		b.setAuthor(sc.next());
		System.out.println("Change Book Name");
		b.setBname(sc.next());
		b.getBname();
		b.getId();
		b.getAuthor();
		b.getPrice();

		b.display();

		sc.close();
	}

}
