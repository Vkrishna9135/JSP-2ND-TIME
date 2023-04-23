package ProgrammingClass;
import java.util.*;
public class StrongNumber {
	static int getFactorial(int num) {
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}return fact;	
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value :");
		int n=sc.nextInt();
		int sum=0;
		int temp=n;
		while(n!=0) {
			int digit=n%10;
			sum=sum+getFactorial(digit);
			n=n/10;
		}
		if(sum==temp) {
			System.out.println("Strong number");
		}
		else {
			System.out.println("not a strong number ");
		}
		
		
		
	}

}
