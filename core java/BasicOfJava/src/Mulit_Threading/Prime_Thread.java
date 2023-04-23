package Mulit_Threading;

public class Prime_Thread extends Thread{
	int n;
	public Prime_Thread(int n,String name) {
		super(name);
		this.n=n;
	}
	@Override
	public void run() {
		for(int i=2;i<=n;i++) {
			if(n%i==0) {
				System.out.println("Prime number");
				return;
			}
			else {
				System.out.println("non Prime number");
				return;
			}
		}
	} 
}
