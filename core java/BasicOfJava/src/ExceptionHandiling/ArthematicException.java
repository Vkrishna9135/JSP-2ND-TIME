package ExceptionHandiling;
import java.util.*; 
public class ArthematicException {
	public static void main(String[] args) {
		//exception = an event occures at the time of normal flow of execution 
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter the user input ;");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=x/y;
		System.out.println("Result ="+z);
		}catch(ArithmeticException e) {
			System.out.println("we can not be divide");
		}
		catch(InputMismatchException e) {
			System.out.println(" given input mismatch exception");
		}
		catch(Exception e) {
			System.out.println("somthing went wrong ");
		}	
		finally {
			System.out.println("Alway this print");
			sc.close();
		}
	}
}
