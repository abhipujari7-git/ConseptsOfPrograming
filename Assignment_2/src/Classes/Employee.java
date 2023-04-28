package Classes;

public class Employee {

	int id;
	String name;
	Date dob = new Date();

	public Employee() {
		this.id = 1001;
		this.name = "Abhi";
		this.dob.setDay(01);
		this.dob.setMonth(01);
		this.dob.setYear(2000);
	}

	public void acceptEmployee(int id, String name, int day, int month, int year) {

		this.id = id;
		this.name = name;
		dob.day = day;
		dob.month = month;
		dob.year = year;
	}

	public void display() {
		System.out.println("Empoloyee Information");
		System.out.println("id =" + id);
		System.out.println("name =" + name);
		System.out.println("dob =" + dob.day + "/" + dob.month + "/" + dob.year);
	}
}
