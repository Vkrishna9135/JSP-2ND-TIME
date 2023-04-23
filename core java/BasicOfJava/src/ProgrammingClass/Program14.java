package ProgrammingClass;
import java.util.Scanner;
public class Program14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter the alpabits");
		char ch=sc.next().charAt(0);
		
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			System.out.println("ovels");
		}
		else {
			System.out.println("not a ovels");
		}
		

	}

}
