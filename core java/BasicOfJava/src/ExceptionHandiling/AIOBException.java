package ExceptionHandiling;

public class AIOBException {
	public static void main(String[] args) {
		try {
			int b[]= {10,20,30,40,50};
			b[2]=50;
			//b[50]=100;
			System.out.println(b);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBound exception");
		}
		
	}
}
