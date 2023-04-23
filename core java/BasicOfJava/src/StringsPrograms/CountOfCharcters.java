package StringsPrograms;
import java.util.*;
public class CountOfCharcters {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the input :");
		String str=sc.nextLine();
		int count=0;
		for(int i=0;i<=str.length()-1;i++) {
			char ch=str.charAt(i);
			count++;
		}
		System.out.println(count);
		
	}

}
