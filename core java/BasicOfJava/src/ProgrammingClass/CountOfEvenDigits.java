package ProgrammingClass;
import java.util.*;
public class CountOfEvenDigits {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();	
		int temp=n,count=0;
		while(n!=0) {
			if(n%2==0)
				count++;
			n/=10;
		}
		
		
}
}