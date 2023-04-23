package ProgrammingRangeOfNumber;
import java.util.*;
public class ProgPerfectNumRange {
	public static boolean isPerfectNum(int num) {
		int org=num;
		int sum=0;
		for(int i=1;i<=num/2;i++) {
			if(num%i==0) {
				sum=sum+i;
			}
	}return org==sum;
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range : ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			if(isPerfectNum(i))
				System.out.println(i+" ");
		}
	}
}
