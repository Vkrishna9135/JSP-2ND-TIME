package ProgrammingRangeOfNumber;
import java.util.*;
public class FactorialNum_Range {
	static boolean isFactorial(int num) {
		int fact=1;
		for(int i=1;i<=num;i++) {
			
		//	fact=fact*i;
		}
		System.out.println(fact);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			if(isdFactorial(i)) {
				System.out.println(i+" ");
			}
		}
	}

}
