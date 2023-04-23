



import java.util.Scanner;

public class PROG001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int lastDigit = num % 10;
        int firstDigit = 0;
        while (num > 0) {
            firstDigit = num % 10;
            num /= 10;
            
        }
    
        int sum = firstDigit + lastDigit;
        System.out.println( sum);
    }
}