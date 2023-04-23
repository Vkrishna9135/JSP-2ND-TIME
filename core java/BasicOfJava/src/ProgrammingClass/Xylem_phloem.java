package ProgrammingClass;
import java.util.*;
public class Xylem_phloem {	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();	int fl=n%10;
		int temp=n;
		int m=0;
		 n=n/10;
		while(n!=0) {
			int l=n/10;
			if(l==n)
				fl=fl+l;
			else
				m=m+l;
			}
		
			if(fl==m) {
				System.out.println("xylem");
			}
			else {
				System.out.println("phloem");
			}
		
		
		
		
	}
}

