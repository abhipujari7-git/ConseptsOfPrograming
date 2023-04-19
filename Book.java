package Classes;

public class Book {

	int id, price;
	String bname, author;

	public Book() {

		this.bname = "Rich";
		this.id = 1001;
		this.author = "XYZ";
		this.price = 5000;
	}

	public Book(String bname, int id, String author, int price) {

		this.bname = bname;
		this.id = id;
		this.author = author;
		this.price = price;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getBname() {
		return bname;
	}

	public int getId() {
		return id;
	}

	public String getAuthor() {
		return author;
	}

	public int getPrice() {
		return price;
	}

	public void display() {
		System.out.println("***Book Information***");
		System.out.println("Book Name: " + bname);
		System.out.println("Book Id: " + id);
		System.out.println("Book Author: " + author);
		System.out.println("Book Price: " + price + " RS");
	}
}
