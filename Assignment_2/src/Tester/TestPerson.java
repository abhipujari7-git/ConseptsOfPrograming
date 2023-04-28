package Tester;

import java.util.Scanner;

import Classes.Person;

public class TestPerson {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Person p = new Person();

		p.display();
		System.out.println("Name  Age  City ");
		p.acceptDetails(sc.next(), sc.nextInt(), sc.next());
		p.display();

		System.out.println("Set Name");
		p.setName(sc.next());
		p.getName();
		System.out.println("Set Age");
		p.setAge(sc.nextInt());
		p.getAge();
		System.out.println("Set City");
		p.setCity(sc.next());
		p.getCity();

		p.display();

		sc.close();
	}

}
