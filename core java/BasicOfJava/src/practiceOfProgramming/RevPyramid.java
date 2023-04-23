package practiceOfProgramming;
import java.util.*;
public class RevPyramid {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int space=0;
		int star=(n*2)-1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++) {
				System.out.print("*");
			}
			space++;
			star-=2;
			System.out.println();
		}
		
		
	}

}
