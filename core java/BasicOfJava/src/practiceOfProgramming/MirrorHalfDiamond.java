package practiceOfProgramming;
import java.util.*;
public class MirrorHalfDiamond {
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int n=sc.nextInt();
	int star=1;
	for(int i=1;i<=n;i++) {
		for(int k=1;k<=star;k++) {
			System.out.print("*");
		}
		if(i<(n/2)+1) {
			star++;
		}else {
			star--;
			}
		System.out.println();
		}
	}
}
