package Tester;
import Classes.ComplexNumber;
import java.util.Scanner;
public class TestComplex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Real Imaginary");
		ComplexNumber c = new ComplexNumber(sc.nextInt(),sc.nextInt());
		
		c.display();
		sc.close();
	}

}
