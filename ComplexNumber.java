package Classes;

public class ComplexNumber {
	 int r, i;

	public ComplexNumber() {
			
			this.r = 0;
			this.i = 0;
		}
	public ComplexNumber(int r, int i) {
	
		this.r = r;
		this.i = i;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}
	public void display() {
		System.out.println("Real = "+r);
		System.out.println("Imaginary = "+i);
	}
	 
}
