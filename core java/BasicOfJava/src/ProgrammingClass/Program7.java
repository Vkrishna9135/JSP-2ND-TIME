package ProgrammingClass;
import java.util.*;
public class Program7 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the length of rectangle");
	int x=sc.nextInt();
	System.out.println("Enter the breadth of rectangle");
	int y=sc.nextInt();
	
	int area=x*y;
	int peri=2*(x+y);
	System.out.println("Area of rectangle : "+area);
	System.out.println("perimeter of a rectangle :"+peri);
	
	
}
}
