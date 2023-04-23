package ProgrammingClass;
import java.util.*;
public class SumOfEven {
	static void printEven(int n) {
		int sum=0;
		z
		while(n!=0) {
			int digit=n%10;
			if(n%2==0)
				sum=sum+digit;
		}
		n=n/10;
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n =sc.nextInt();
		int res=printEven(n);
		System.out.println(res);
		
	}
}
