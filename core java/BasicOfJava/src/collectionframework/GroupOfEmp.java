package collectionframework;
import java.io.*;
import java.io.BufferedReader;

public class GroupOfEmp {
	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new  InputStreamReader(System.in));
		Employe[] arr=new Employe[5];
		
		for(int i=0;i<=10;i++) {
			System.out.println("enter id");
			int id=Integer.parseInt(br.readLine());
			System.out.println("enter name");
			String name=br.readLine();
			arr[i]=new Employe(id, name);
			
		}
		System.out.println("the employee data is: ");
		for(int i=0;i<arr.length;i++) {
			arr[i].displayData();
		}
	}
}
