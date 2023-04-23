package ProgrammingClass;
import java.util.*;
public class Alpha_A2Z {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		
		for(char i='A';i<=ch;i++) {
			System.out.print(i+" ");
		}
	}
}


