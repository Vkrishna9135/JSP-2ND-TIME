package ProgrammingClass;
import java.util.Scanner;
public class Program5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the user input");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		
		if(x<y&&x<z) {
			System.out.println(x+" is smallest");
		}
		else if (y<z) {
			System.out.println(y+" is smallest");
		}
		else {
			System.out.println(z+" is smallest");
		}
	}

}
