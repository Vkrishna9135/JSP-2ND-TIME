package ProgrammingClass;
import java.util.Scanner;

public class Program4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the user input");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		
		if(x>y&&x>z) {
			System.out.println(x+" is biggest");
		}
		else if (y>z) {
			System.out.println(y+" is biggest");
		}
		else 
		{
			System.out.println(z+" is biggest");
		}
	}
	

}
