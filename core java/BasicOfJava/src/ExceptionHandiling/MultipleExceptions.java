package ExceptionHandiling;
import java.lang.*;
public class MultipleExceptions {
	public static void main(String[] args) {
		System.out.println("open files");
		try {
			int n=args.length;
			System.out.println("n= "+n);
			int a=100/n;
			int b[]= {100,200,300,400,500};
			
			b[10]=10000;
			System.out.println(b);
			System.out.println("a= "+a);
		} catch (ArithmeticException |ArrayIndexOutOfBoundsException ae) {
			System.out.println("Arthematic exception & array index out of bound exception occured");
		}
		finally {
			System.out.println("finally-it always get execute");
		}
		}
	}

