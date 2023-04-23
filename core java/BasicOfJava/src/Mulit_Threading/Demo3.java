package Mulit_Threading;

public class Demo3 {
	public static void main(String[] args) {
		Fact_Thread f1=new Fact_Thread(12,"Fire");
		f1.start();
		Fact_Thread f2=new Fact_Thread(42,"Water");
		f2.start();
		Prime_Thread p1=new Prime_Thread(56," Earth");
		p1.start();
		Prime_Thread p2 =new Prime_Thread(12,"Sky");
		p2.start();
		
		
	}

}
