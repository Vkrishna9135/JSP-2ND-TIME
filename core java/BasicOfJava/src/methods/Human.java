package methods;

public class Human {
	String name="krishna";
	int age =21;
	void details() {
		String name="vishal";
		int age=28;
		System.out.println(name);
		System.out.println(age);
		System.out.println(this.name);
		System.out.println(this.age);
	}
	public static void main(String[] args) {
		Human h1=new Human();
		h1.details();
	}
}
