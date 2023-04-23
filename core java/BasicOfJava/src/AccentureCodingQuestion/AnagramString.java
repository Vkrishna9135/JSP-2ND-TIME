package AccentureCodingQuestion;
import java.util.*;
public class AnagramString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(" First string");
		String str1=sc.nextLine();
		System.out.println(" Second string");
		String str2=sc.nextLine();
		int count=0;
		
		for(int i=0;i<str1.length();i++) {
			char ch1=str1.charAt(i);
			for(int j=0;j<str2.length();j++) {
				char ch2=str2.charAt(j);
				if(ch1==ch2) {
					count++;
				}
				
			}
		}
		if(str1.length()==count) {
			System.out.println("yes it is a anagram");
		}
		else {
			System.out.println("no it is not anagram");
		}
		
		
	}

}
