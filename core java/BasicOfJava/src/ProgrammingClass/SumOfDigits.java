package ProgrammingClass;
import java.util.*;
public class SumOfDigits {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter tha value ");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++) {
			int r=n%10;
			sum=sum+i;
			n=n/10;
		}
		System.out.println(sum);
	}

}
