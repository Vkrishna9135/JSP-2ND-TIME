
public class Bank {
	String name;
	String location;
	String transactions;
	
	public Bank(String n,String l, String t){
		name=n;
		location=l;
		transactions=t;
		}
	public static void main(String[] args) {
		Bank b1=new Bank("SBI","Tadipatri","10000crores");
		Bank b2=new Bank("karnataka","Bangalor","1200crores");
		Bank b3=new Bank("HDFC","CENNAI","1900CRORES");
		Bank b4=new Bank("ICICI","KADAPA","4000CRORES");
		System.out.println("Starts");
		System.out.println("BANK NAME; "+" "+b1.name);
		System.out.println("Location ;"+" "+b1.location);
		System.out.println("Transaction ;"+" "+b1.transactions);
		System.out.println();
		System.out.println("BANK NAME; "+" "+b2.name);
		System.out.println("Location ;"+" "+b2.location);
		System.out.println("Transaction ;"+" "+b2.transactions);
		System.out.println();
		System.out.println("BANK NAME; "+" "+b3.name);
		System.out.println("Location ;"+" "+b3.location);
		System.out.println("Transaction ;"+" "+b3.transactions);
		System.out.println("ends");
	}
	
	

}
