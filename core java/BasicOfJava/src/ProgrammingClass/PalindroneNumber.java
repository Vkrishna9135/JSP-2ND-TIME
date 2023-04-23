package ProgrammingClass;
import java.util.*;
public class PalindroneNumber {
	static int palindromeNumber(int num) {
		int rev=0;
		while(num!=0) {
			int digit=num%10;
			rev=rev*10+digit;
			num=num/10;
		} return rev;
	}
public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the user input :");
		int num =sc.nextInt();
		int result=palindromeNumber(num);
		
		if(result==num) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
	}

}
