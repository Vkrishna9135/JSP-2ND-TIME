package StringsPrograms;
import java.util.*;
public class Rev_String {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		
		for(int i=name.length()-1;i>=0;i--) {
			System.out.print(name.charAt(i));
			}
	}

}
