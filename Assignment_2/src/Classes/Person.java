package Classes;

public class Person {

	String name, city;
	int age;

	public Person() {
		this.name = "AAA";
		this.age = 50;
		this.city = "Pune";
	}

	public Person(String name, int age, String city) {
		this.name = name;
		this.age = age;
		this.city = city;
	}

	public void acceptDetails(String name, int age, String city) {
		this.name = name;
		this.age = age;
		this.city = city;

	}

	public void display() {
		System.out.println("Person Information");
		System.out.println("Name =" + name);
		System.out.println("Age =" + age);
		System.out.println("City =" + city);
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getCity() {
		return city;
	}

}
