package ProgrammingClass;
import java.util.*;
public class ReverseNumber {
	static int ReverseNum(int num) {
		int rev=0;
		while(num!=0) {
			int dig=num%10;
			rev=rev*10+dig;
			 num=num/10;
			 } return rev;
			
		}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the input number");
		int n=sc.nextInt();
		int result=ReverseNum(n);
		
		System.out.println(result);
	}

}
