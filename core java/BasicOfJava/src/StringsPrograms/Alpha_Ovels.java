package StringsPrograms;
import java.util.*;
public class Alpha_Ovels {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int uc=0,lc=0,spc=0,nc=0;
	
		for(int i=0;i<=str.length()-1;i++) {
			char ch=str.charAt(i);
			if(ch<='A' && ch>='Z') {
				uc++;
				System.out.println("uppercase letter "+uc);
			}
			
			else if(ch<='a'&&ch>='z') {
				lc++;
				System.out.println("lowercase letter "+lc);
			}
			else if(ch<='0'&&ch>='9') {
				nc++;
				System.out.println("numaric letter ; "+nc);
			}
			else {
				spc++;
				System.out.println("special char :"+spc);
			}
				
		}
		}
	}


