package ProgrammingClass;
import java.util.*;
public class GCD_Prog {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int gcd=0;
		for(int i=1;i<=x&&i<=y;i++) {
			
			if(x%i==0&&y%i==0) {
				gcd=i;
			}}
		System.out.println(gcd);
	}
}
