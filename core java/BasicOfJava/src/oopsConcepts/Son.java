package oopsConcepts;
public class Son extends Father {
	String surname="VUTLA ";
	String name="Venkatakrishna";
	int age=24;
	void details(){
		System.out.println("Name="+surname+name+" "+"age ="+age);
	}
	
	
	public static void main(String[] args) {
		Son s1=new Son();
		s1.details();
		s1.drink();
		s1.favFood();
		s1.work();
		
		
	}

}
