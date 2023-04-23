package Mulit_Threading;

public class Fact_Thread  extends Thread{
	int n;
	public Fact_Thread(int n, String name) {
		super(name);
		this.n=n;
	}
	
	public void run() {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
			return;
		}	System.out.println("factorial of number is "+fact);
	}
	

}
