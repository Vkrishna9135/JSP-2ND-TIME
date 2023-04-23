package ProgrammingClass;
import java.util.Scanner;

public class ProgLoop06 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),i=1;
		long fact=1;
		
		while(i<=n) {
			 fact=fact*i;
			i++;
		}
		System.out.println(fact);
	}

}
