package StringsPrograms;
import java.util.Scanner;
public class Searching_Num {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		int arr[]= {47,87,34,89,82,02,39,84,74};
		int k=sc.nextInt();
		int count=0;
		for(int i=0;i<=arr.length-1;i++) {
			int n=arr[i];
			if(k==n) {
				count++;
				break;}
		}
	
	if(count>0) {
		System.out.println("found");
	}
	else
		System.out.println(" not found");
	
	
}}
