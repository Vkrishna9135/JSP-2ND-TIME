package ProgrammingClass;
import java.util.*;
public class ArmstrongNumber {
	 public static boolean isArmstrong(int num) {
	        int sum = 0;
	        int temp = num;
	        int digits = 0;
	        while (temp != 0) {
	            digits++;
	            temp =temp/10;
	        }
	        temp=num;
	        while (temp != 0) {
	            int digit = temp % 10;
	            int power = 1;
	            for (int i = 0; i < digits; i++) {
	                power *= digit;
	            }
	            sum += power;
	            temp= temp/10;
	        }
	        return num==sum;
	    }
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the user input value");
		int num=sc.nextInt();
        if (isArmstrong(num)) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("not an Armstrong number");
        }
    }
	}


