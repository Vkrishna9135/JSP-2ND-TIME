package ProgrammingClass;
import java.util.*;
public class PrimeNumber02 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the user input: ");
		int n=sc.nextInt(),count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}	
		}
		if(count==2) {
			System.out.println("prime");
		}
		else {
			System.out.println("non prime");
		}

	}

}
