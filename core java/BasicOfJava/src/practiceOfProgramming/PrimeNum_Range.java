package practiceOfProgramming;
import java.util.*;
public class PrimeNum_Range {
	public static boolean printPrime(int num) {
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}	
		}return count==2;
		}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value :");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			if(printPrime(i)) {
				System.out.println(i+" ");
				
			}
		}
	}

}
