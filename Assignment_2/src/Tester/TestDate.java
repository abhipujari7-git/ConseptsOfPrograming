package Tester;

import java.util.Scanner;

import Classes.Date;

public class TestDate {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter date d1");
		Date d1 = new Date(sc.nextInt(), sc.nextInt(), sc.nextInt());
		d1.displayDate();
		System.out.println("Enter date d2");
		Date d2 = new Date(sc.nextInt(), sc.nextInt(), sc.nextInt());
		d2.displayDate();
		System.out.println("Set day d1");
		d1.setDay(sc.nextInt());
		d1.displayDate();
		System.out.println("Set day d2");
		d2.setDay(sc.nextInt());
		d2.displayDate();
		sc.close();
	}

}
