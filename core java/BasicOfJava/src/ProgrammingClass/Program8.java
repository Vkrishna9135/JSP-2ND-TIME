package ProgrammingClass;
import java.util.*;
public class Program8 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of a square: ");
		int side=sc.nextInt();
		
		int area =side*side ;
		int peri=4*side;
		System.out.println("Area of a square ;"+area);
		System.out.println("Perimeter of a square: "+peri);
		
		
	}

}
