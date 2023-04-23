package ProgrammingClass;
import java.util.*;
public class PrimeNumber01 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter the number");
		int n=sc.nextInt(),temp=0;
		
		for(int i=2;i<=n-1;i++) {
			if(n%i==0) {
				temp=temp+1;
			}	
		}	
	if(temp==0) {
		System.out.println(n+" is a prime");
	}
	else {
		System.out.println(n+"non prime");
	}
}}


