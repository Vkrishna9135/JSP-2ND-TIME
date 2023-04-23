package StringsPrograms;
import java.util.Scanner;
public class StringPalindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		String str=sc.nextLine();
		String rev="";
	
		for(int i=str.length()-1;i>=0;i--) {
			char ch=str.charAt(i);
			rev=rev+ch;
		}
		System.out.println(rev);
		if(rev.equalsIgnoreCase(str)) {
			System.out.println(" palindrome");
		}
		else
				System.out.println("not palindrme");
				
		
	}

}


