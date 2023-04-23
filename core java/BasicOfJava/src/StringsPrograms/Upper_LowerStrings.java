package StringsPrograms;
import java.util.*;
public class Upper_LowerStrings {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		String temp="";
		for(int i=0;i<=name.length()-1;i++) {
			char ch=name.charAt(i);
			if(ch>='A'&&ch<='Z')
				temp=temp+((char)(ch+32));
			else {
				temp=temp+((char)(ch-32));
			}
			
		}
		System.out.println(temp);
	}
}
