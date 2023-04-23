package StringsPrograms;
import java.util.*;
public class CountOfFunctions {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int count =0;
		for(int i=1;i<=str.length()-1;i++) {
			if(str.charAt(i)=='!'||str.charAt(i)==','||str.charAt(i)=='/'||str.charAt(i)==';'||str.charAt(i)==':'||str.charAt(i)=='.'||str.charAt(i)=='?') {
				count++;
			}
			
		}System.out.println(count);
	}

}
