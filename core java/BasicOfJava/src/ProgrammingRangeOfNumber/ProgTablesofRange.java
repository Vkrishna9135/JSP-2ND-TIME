package ProgrammingRangeOfNumber;
import java.util.*;
public class ProgTablesofRange {
	static int printTable(int n) {
		int tab=1;
		for(int j=1;j<=n;j++) {
			int temp=j;
			for(int i=1;i<=10;i++) {
			tab=temp*i;
			System.out.println(temp+" * "+i+" = "+tab);
		}
			System.out.println();
			
			}return tab;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the range ;");
		int n=sc.nextInt();
		int result=printTable(n);
		//System.out.println(result);
		}
		}


