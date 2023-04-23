package StringsPrograms;
import java.util.*;
public class CountOf_letters {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		String str=sc.nextLine();
		int count=0;
		System.out.println("Enter the letter: ");
		char lt=sc.next().charAt(0);
		for(int i=0;i<=str.length();i++) {
			char ch=str.charAt(i);
			if(lt==ch)
					count++;
			}
			System.out.println(lt+" is a "+count);
		}
		
	}
}
