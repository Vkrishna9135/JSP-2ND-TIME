package Mulit_Threading;

public class MyThread  extends Thread{

		public void run() {
			for(int i=1;i<=100000;i++) {
				System.out.println(i);
			}
		}
	}


