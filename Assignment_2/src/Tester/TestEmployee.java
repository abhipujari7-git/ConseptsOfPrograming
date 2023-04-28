package Tester;

import java.util.Scanner;

import Classes.Employee;

public class TestEmployee {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Employee e1 = new Employee();

		e1.display();
		System.out.println("EmpId Name Date(dd-mm-yy): ");
        e1.acceptEmployee(sc.nextInt(), sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());
		e1.display();

		sc.close();
	}

}
