package ProgrammingClass;
import java.util.*;
public class ProgLoop03 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range of n");
		int n=sc.nextInt(),i=1;
		while(i<=n) {
			if(i%2!=0) {
				System.out.println(i);
			}
			i++;
		}
	}

}
