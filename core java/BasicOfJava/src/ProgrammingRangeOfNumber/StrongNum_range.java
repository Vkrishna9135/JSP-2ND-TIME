package ProgrammingRangeOfNumber;
import java.util.*;
public class StrongNum_range {
	static boolean isStrong(int num) {
		int sum=0;
		int temp=num;
		while(num!=0) {
			int digit=num%10;
			sum=sum+getFact(digit);
			num=num/10;
		}
		return true;
	}
	static int getFact(int num) {
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}return fact;
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the range");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			
			}
		}
}

