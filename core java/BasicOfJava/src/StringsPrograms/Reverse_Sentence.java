package StringsPrograms;
import java.util.*;
public class Reverse_Sentence {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String str=sc.nextLine();
		String rev="";
		String temp="";
		for(int i=str.length()-1;i>=0;i--) {
			char ch =str.charAt(i);
			System.out.println(ch);
			if(ch==' '||i==0) {
				if(i==0)
					temp=temp+ch;
				System.out.println(temp);
				for(int j=temp.length()-1;j>=0;j--) {
					rev=rev+temp.charAt(j);
					System.out.println(rev);
					temp=" ";
				}
				
			}
			else
				temp=temp+ch;
				
			
			}
		System.out.println(temp);
		System.out.println(rev);
		
		}
	
	}


