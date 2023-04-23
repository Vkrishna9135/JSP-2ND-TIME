package StringsPrograms;
import java.util.*;
public class Lower_UpperCaseAlpha {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		
		for(int i=0;i<=str.length()-1;i++) {
			char ch=str.charAt(i);
			
			if(ch<='A' && ch>='Z') {
				char up=ch.toLowerCase();
				
			}

		}
	}

}
