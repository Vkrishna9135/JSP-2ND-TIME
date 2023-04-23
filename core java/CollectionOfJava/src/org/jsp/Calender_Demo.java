package org.jsp;
import java.util.*;
public class Calender_Demo {
	private static final int DATE = 0;
	private static final int YEAR = 0;
	private static final int Hour = 0;
	private static final int MINUTE = 0;
	private static final int SECOND = 0;
	private static int MONTH;

	public static void main(String[] args) {
		Calendar c1=Calendar.getInstance();
		System.out.println("current date");
		int dd=c1.get(Calender_Demo.DATE);
		int mm=c1.get(Calender_Demo.MONTH);
		
		
		++mm;
		int yy=c1.get(Calender_Demo.YEAR);
		System.out.println(dd+"/"+mm+"-"+yy);
		System.out.println("current time");
		
		int h=c1.get(Calender_Demo.Hour);
		int m=c1.get(Calender_Demo.MINUTE);
		int s=c1.get(Calender_Demo.SECOND);
		System.out.println(h+"-"+m+"-"+":"+s);
		int x=c1.get(Calendar.AM_PM);
		if(x==0) {
			System.out.println("Good morning");
			
		}
		else {
			System.out.println("Good evening");
		}
		
	}
}
