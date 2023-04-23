package ProgrammingRangeOfNumber;
import java.util.*;
public class PalindromeNum_Range {
	static boolean isPalindrome(int num) {
		int rev=0;
		int org=num;
		while(num!=0) {
			int digit=num%10;
			rev=(rev*10)+digit;
			num=num/10;
		}return org==rev;
	
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range; ");
		int start=sc.nextInt();
		int end=sc.nextInt();
		for(int i=start;i<=end;i++) {
			if(isPalindrome(i)) {
				System.out.println(i+" ");	
	}
		}}}
