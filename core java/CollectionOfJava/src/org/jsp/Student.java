package org.jsp;

public class Student {
	private int id;
	private String name;
	private int age;
	private double perc;
	
	//setter & getter methods to acces the data........
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getPerc() {
		return perc;
	}
	public void setPerc(double perc) {
		this.perc = perc;
	}
	public void study()// business behavior
	{
	}
	public void doHomeWork()
	{
		
	}

}
