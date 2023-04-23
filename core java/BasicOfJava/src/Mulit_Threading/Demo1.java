package Mulit_Threading;
public class Demo1 {
	public static void main(String[] args) {
		MyThread obj=new MyThread();
		Thread t=new Thread(obj);
		//t.start();
		System.out.println(t.currentThread().getName());
		System.out.println(t.currentThread().getId());
		System.out.println(t.currentThread().getPriority());
		System.out.println(t.isAlive());
		System.out.println(obj.getId());
		System.out.println(obj.getPriority());
		
	}
}
