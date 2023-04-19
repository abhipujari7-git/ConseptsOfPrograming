package Classes;

public class Date {

	int day, month, year;

	public Date() {
		day = 01;
		month = 01;
		year = 2000;
	}

	public Date(int day, int month, int year) {

		this.day = day;
		this.month = month;
		this.year = year;
	}

	public void acceptDate(int day, int month, int year) {

		this.day = day;
		this.month = month;
		this.year = year;
	}

	public void displayDate() {
		System.out.println("Date:" + day + "/" + month + "/" + year);
	}

	public void setDay(int day) {
		this.day = day;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}

}
