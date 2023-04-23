package ProgrammingClass;
import java.util.Scanner;
public class FactorsOfNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number: ");
		int n=sc.nextInt();
		int i=1,count=0;
		
		
		while(i<=n) {
			if(n%i==0) {
				System.out.println(i+" ");
				count++;
			}
			i++;
		}
		System.out.println(" count of factors : "+count);
	}

}
