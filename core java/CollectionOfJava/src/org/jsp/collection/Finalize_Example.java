package org.jsp.collection;

public class Finalize_Example {
	public static void main(String[] args) {
		Finalize_Example f1=new Finalize_Example();
		Finalize_Example f2=new Finalize_Example();
		f1=null;
		f2=null;
		System.gc();
	}

}
