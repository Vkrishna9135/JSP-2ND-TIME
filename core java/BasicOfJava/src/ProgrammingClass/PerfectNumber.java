package ProgrammingClass;
import java.util.*;
public class PerfectNumber {
	static int isPerfect(int n) {
		int sum=0;
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) {
				sum=sum+i;
			}
	}return sum;
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the user input : ");
		int n=sc.nextInt();
		int result=isPerfect(n);
		if(result==n) {
			System.out.println("Perfect number");
		}
		else {
			System.out.println("non-Perfect number");
		}
		
	}
}


