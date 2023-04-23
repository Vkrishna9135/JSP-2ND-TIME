package oopsConcepts;
public class Father {
	String surname="VUTLA ";
	String name="Gangadher";
	int age=48;
	
	void drink() {
		System.out.println("Tea");
	}
	void favFood() {
		System.out.println("fish biryani");
	}
	void work() {
		System.out.println("Auto-driver");
	}
	void details() {
		System.out.println("Name= "+surname+name+" "+"age="+age);
	}
	public static void main(String[] args) {
		Father f1=new Father();
		f1.details();
		f1.drink();
		f1.work();
		f1.favFood();
}
	

}
