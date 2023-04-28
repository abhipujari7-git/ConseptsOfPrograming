package Tester;

import Classes.Point;
import java.util.Scanner;

public class TestPoint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Set X and Y");
		Point p = new Point(sc.nextInt(), sc.nextInt());

		p.display();
		System.out.println("Set Y");
		p.setY(sc.nextInt());
		System.out.println("Set X");
		p.setX(sc.nextInt());
		p.display();
		sc.close();
	}

}
