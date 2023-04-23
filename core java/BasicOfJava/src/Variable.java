
public class Variable {
	static	int value =1000;
	
	void sum() {
		int x= 100;
		System.out.println(x);
		System.out.println(value);
	}
	public static void main(String[] args) {
		Variable v=new Variable();
		int num=150;
		v.sum();
		System.out.println(num);
		
		
	}
	

}
