package practiceOfProgramming;
import java.util.*;
public class PrimeProg {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the user number");
		int n=sc.nextInt();
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("prime number");
		}
		else {
			System.out.println("not Prime number");
		}
		
		
	}

}
