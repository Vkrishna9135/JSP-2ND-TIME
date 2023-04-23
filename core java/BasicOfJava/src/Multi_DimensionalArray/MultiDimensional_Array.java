package Multi_DimensionalArray;
import java.util.Scanner;
public class MultiDimensional_Array {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
		System.out.println("Enter the number of rows: ");
		int row=sc.nextInt();
		System.out.println("Enter the number of columns: ");
		int column=sc.nextInt();
		int arr[][]=new int[row][column];
		System.out.println(" Enter the "+(row*column)+" number of datas");
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<arr.length;i++) {
			int sum=0;
			for(int j=0;j<arr[i].length;j++) {
				sum+=arr[i][j];
				
			}
			System.out.println(sum);
		}
		
		
	}
	


}
