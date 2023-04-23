package ProgrammingClass;
import java.util.*;
public class PowerOfNumber {
	public static int getPower(int n) {
		int prod=1;
		for(int i=1;i<=3;i++) {
			prod*=n;
		}return prod;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the user input: ");
		int n=sc.nextInt();
		int res=getPower(n);
		System.out.println(res);
		
	}

}
