package AccentureCodingQuestion;
import java.util.*;
public class OVELS_Consonents {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the given String : ");
		String str=sc.nextLine();
		int Vcount=0;
		int Ccount=0;
		
		str=str.toLowerCase();
		
		
		for(int i=0;i<str.length();i++) {
		
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
				Vcount++;
			}
			else if(str.charAt(i)>='a'&&str.charAt(i)<='z'){
				Ccount++;
			}
		}
		System.out.println(Vcount+" ovels are present in sentence");
		System.out.println(Ccount+" consonents are present in sentence");
		
	}

}
