package ProgrammingRangeOfNumber;
import java.util.*;
public class ArmstrongNum_Range {
	public static int countOfDigits(int n) {
		int count=0;
		while(n!=0) {
			count++;
			n=n/10;
		}return count;
	}
	public static int powerOfDigits(int m,int n) {
		int power=1;
		for(int i=1;i<=n;i++) {
			power=power*m;
		}return power;	
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the check of Armstrong Number");
	int n=sc.nextInt();
	int temp=n;
	int digit=countOfDigits(n);
	int sum=0;
	while(n!=0) {
		int last=n%10;
		sum=sum+powerOfDigits(last,digit);
		n=n/10;
	}
	if(sum==temp) {
		System.out.println("Armstrong number");
	}
	else {
		System.out.println("not Armstrong number");
	}
		
	}
}

