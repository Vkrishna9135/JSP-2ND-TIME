package ProgrammingClass;
import java.util.*;
public class SumOfFirstLast {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values ;");
		int n=sc.nextInt();
		int lastdig=n%10;
		int firstdig=0;
		while(n>0) {
			firstdig=n%10;
			n=n/10;
		}
		int sum=firstdig+lastdig;
		System.out.println(sum);	
		
	}

}
