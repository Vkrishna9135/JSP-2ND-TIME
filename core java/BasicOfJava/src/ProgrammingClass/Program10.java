package ProgrammingClass;

public class Program10 {
	public static void main(String[] args) {
		
		char ch='h';
		if(ch>='A'&&ch<='Z') {
			char x=(char)(ch+32);
			System.out.println(x+" converted into lower case");
		}
		else if(ch>='a'&&ch<='z') {
			char y=(char)(ch-32);
			System.out.println(y+" coverted into upper case");
		}
		else {
			System.out.println("invalid");
		}
		
	}

}
