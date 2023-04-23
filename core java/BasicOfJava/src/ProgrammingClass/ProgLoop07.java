package ProgrammingClass;
import java.util.*;
public class ProgLoop07 {
	public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter the number of terms");
	int n=sc.nextInt();
	int first=0,second=1,next;
	System.out.print(first+" "+second);
	for(int i=2;i<=n;i++) {
		next=first+second;
		System.out.print(" "+next);
		first=second;
		second=next;
		
	}
		
	}
	
}

