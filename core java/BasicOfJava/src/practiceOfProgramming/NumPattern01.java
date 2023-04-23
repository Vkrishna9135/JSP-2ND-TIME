package practiceOfProgramming;
import java.util.*;
public class NumPattern01 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j==1||i==n||j==i||j==1||j==n||i==1||j+i==n+1) {
					System.out.print(j);
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	}
}
