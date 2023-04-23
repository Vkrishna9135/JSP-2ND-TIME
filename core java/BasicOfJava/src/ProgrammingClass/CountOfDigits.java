package ProgrammingClass;
import java.util.*;
public class CountOfDigits {
	static int countOfDigits(int n) {
		int temp=n;
		int count=0;
		int sum=0;
		while(n!=0) {
			if(n%2!=0) 
			count++;
			n/=10;
		
		}return count;
		
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int res=countOfDigits(n);
	System.out.println(res);
	
}
}
