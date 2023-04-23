package ProgrammingClass;
import java.util.*;
// right to vote +18 male/female
public class Program11 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the user input");
		String name=sc.nextLine();
		int age=sc.nextInt();
		System.out.println("Name ;"+name);
		System.out.println("age ;"+age);
		
		if (age>=18) {
			System.out.println("eligable to vote");
		}
		else {
			System.out.println("not eligable to vote");
		}
		
	}

}
