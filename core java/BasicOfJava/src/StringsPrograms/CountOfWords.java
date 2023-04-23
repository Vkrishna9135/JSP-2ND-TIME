package StringsPrograms;
import java.util.Scanner;
public class CountOfWords {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the a sentence:  ");
		String str=sc.nextLine();
		int count=0;
		
		for(int i=0;i<=str.length()-1;i++) {
			char ch=str.charAt(i);
			if(ch==' ')
				count++	;
		}
		System.out.println(str+" has a "+(count+1)+" words");
		
	}

}
