package methods;

public class Bike {
	String brand="pulser";
	int prize=70000;
	void details() {
		System.out.println(brand);
		System.out.println(prize);
	}
	void start() {
		System.out.println(this);
	}
	void stop() {
		System.out.println(this);
		
	}
	public static void main(String[] args) {
		Bike b1=new Bike();
		System.out.println(b1);
		b1.details();
		b1.start();
		b1.stop();
		Bike b2=new Bike();
		b2= b1;
		System.out.println(b2);
	}

}
