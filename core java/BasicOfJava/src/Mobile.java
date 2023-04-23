
public class Mobile {
	String brand;
	int cost;
	String color;
	public Mobile(String b,int c,String r) {
		brand=b;
		cost=c;
		color=r;
		
	}
public static void main(String[] args) {
	Mobile m1=new Mobile("redmi",9000,"blue");
	Mobile m2=new Mobile("oneplus",38000,"silver");
	Mobile m3=new Mobile("iphone 13x",87000,"white & silver");
	
	System.out.println("program starts");
	System.out.println("Brand;"+" "+m1.brand);
	System.out.println("cost;"+" "+m1.cost);
	System.out.println("color;"+" "+m1.color);
	System.out.println( );
	System.out.println("Brand;"+" "+m2.brand);
	System.out.println("cost;"+" "+m2.cost);
	System.out.println("color;"+" "+m2.color);
	System.out.println( );
	System.out.println("Brand;"+" "+m3.brand);
	System.out.println("cost;"+" "+m3.cost);
	System.out.println("color;"+" "+m3.color);
	System.out.println("program ends");
}
}
