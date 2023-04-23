package ProgrammingClass;
import java.util.*;
public class ProgLoop05 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),i=1;
		while(i<=20) {
			int tab=n*i;
			System.out.println(i+" *"+n+"= "+tab);
			i++;
		}
	}
}
