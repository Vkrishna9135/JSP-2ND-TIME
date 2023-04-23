package ExceptionHandiling;
import java.util.*;
public class CountLengthOfString {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String str= sc.nextLine();
	int count =0;
	for(int i=0;true;i++) {
		try {
			str.charAt(i);
			count++;
		} catch (StringIndexOutOfBoundsException e) {
			break;
		}
	}
	System.out.println(count);

	}

}
