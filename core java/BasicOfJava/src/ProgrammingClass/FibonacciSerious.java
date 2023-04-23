package ProgrammingClass;
import java.util.*;
public class FibonacciSerious {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the vales of terms");
	int n=sc.nextInt();
	int first=0,second=1,next;
	System.out.print("Fibonacci serious: "+first+" "+second);
	// logic for Fibonacci serious........... 
	for(int i=2;i<=n;i++) {
		next=first+second;
		System.out.print(" "+next);
		first=second;
		second=next;
	}
	
	
	
}
}
