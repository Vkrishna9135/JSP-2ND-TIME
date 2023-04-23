package methods;

public class Cycle {
	String brand ;
	int price ;
	String color;
	void brand1() {
		System.out.println(this);
	}
	void brand2() {
		System.out.println(this);
	}
	void brand3() {
		System.out.println(this);
	}
	
	public static void main(String[] args) {
		Cycle c=new Cycle ();
		c.brand="atlas";
		c.price=7800;
		c.color="red";
		c.brand1();
		System.out.println(c.brand+" "+c.brand+" "+c.color);
		Cycle c2=new Cycle ();
		c2.brand="herclus";
		c2.price=8800;
		c2.color="green";
		c2.brand2();
		System.out.println(c2.brand+" "+c2.brand+" "+c2.color);
		Cycle c3=new Cycle ();
		c3.brand="avion";
		c3.price=5700;
		c3.color="black";
		c3.brand3();
		System.out.println(c3.brand+" "+c3.brand+" "+c3.color);
		
	}

}
