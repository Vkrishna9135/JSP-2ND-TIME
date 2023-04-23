package Mulit_Threading;

public class Multi_ThreadProg extends Thread{
	int n;
	public Multi_ThreadProg(int n,String name) {
		super(name);
		this.n=n;
	}
	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(n+" * "+i+" = "+(n*i)+" "+getName());
		}
		
	}
	
}
