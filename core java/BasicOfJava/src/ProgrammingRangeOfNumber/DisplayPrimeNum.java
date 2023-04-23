package ProgrammingRangeOfNumber;
import java.util.Scanner;
public class DisplayPrimeNum {
	static boolean isPrime(int num) {
		int count=0;
			for(int i=1;i<=num;i++) {
				if(num%i==0) {
					count++;
				}
				}return count==2;
			}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range of a number: ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			if(isPrime(i)) {
				System.out.println(i+" ");
			}
		}
		
		}
				
			
		}
	


