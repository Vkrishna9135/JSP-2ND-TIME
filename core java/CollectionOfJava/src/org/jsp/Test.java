package org.jsp;

public class Test {
	public static void main(String[] args) {
		Student s=new Student();
		s.setId(101);
		s.setName("VENKATA KRISHNA");
		s.setAge(24);
		s.setPerc(78.65);
		
		System.out.println(s.getId());
		System.out.println(s.getName());
		System.out.println(s.getAge());
		System.out.println(s.getPerc());
	}
}
