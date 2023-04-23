package ExceptionHandiling;

public class Exception01 {
	public static void main(String[] args) {
		System.out.println("open files");
		try {
			int n=args.length;
			System.out.println("n ="+n);
			int a=45/n;
			System.out.println("a ="+a);
		} catch (Exception e) {
			System.out.println("arhematic exception");
		}
		System.out.println("close file");
	}
}
