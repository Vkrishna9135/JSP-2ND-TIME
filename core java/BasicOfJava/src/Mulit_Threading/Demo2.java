package Mulit_Threading;
public class Demo2 {
	public static void main(String[] args) {
		Multi_ThreadProg monkey=new Multi_ThreadProg(7,"monkey");
		monkey.start();
		Multi_ThreadProg donkey=new Multi_ThreadProg(20,"donkey");
		donkey.start();
	}
}
