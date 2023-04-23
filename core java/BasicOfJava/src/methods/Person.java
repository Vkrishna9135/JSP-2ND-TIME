package methods;

public class Person {
	String name="krishna";
	String wokeup="5.30am";
	long phno=9951189194l;
	 
	void details() {
		System.out.println("Good morning");
		this.freshUp();
			this.eat();
		  this.sleep();
		System.out.println("Good night");
		
	}
	void freshUp() {
		System.out.println("woke up;  "+" "+wokeup);
		
	}
	void eat() {
		System.out.println("brakefast");
		System.out.println("lunch");
		System.out.println("Dinner");
	}
	void sleep() {
		System.out.println("sleep; "+"night at 10pm");
		
	}
	public static void main(String[] args) {
		Person p1=new Person();
		System.out.println("Day starts");
		p1.details();
		System.out.println("Day ends");
	}
}
