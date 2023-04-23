package ProgrammingClass;
import java.util.*;
// print Alphabits "A to Z"........... 
public class ProgLoop04 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0), i='A';
		while(i<=ch) {
			System.out.print(i+" ");
			++i;
		}
	
	}
}
