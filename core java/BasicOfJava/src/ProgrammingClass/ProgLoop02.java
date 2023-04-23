package ProgrammingClass;
import java.util.*;
// print even numbers ..........
public class ProgLoop02 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),i=0;
		while (i<=n) {
			if(i%2==0) {
				System.out.println(i);
			}
			i++;
		}
	}

}
