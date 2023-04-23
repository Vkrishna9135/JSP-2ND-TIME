package ProgrammingClass;
import java.util.*;
public class FactorialOfDigit {
	public static int getFact(int n) {
		int fact=1;
for(int i=1;i<=n;i++) {
	fact=fact*i;
}return fact;
	}
	public static void main(String... args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the user digit");
		int n=sc.nextInt();
		int res=getFact(n);
		System.out.println(res);
		
		

	}}
