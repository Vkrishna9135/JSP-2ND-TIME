package Multi_DimensionalArray;
import java.util.*;
public class SumOfColumn {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter the no of rows");
		int row=sc.nextInt();
		System.out.println(" enter the no of column: ");
		int column=sc.nextInt();
		int arr[][]=new int[row][column];
		System.out.println("enter the "+(row*column)+" no of data");
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		for(int j=0;j<arr[0].length;j++) {
			int sum=0;
			for(int i=0;i<arr.length;i++) {
				sum+=arr[i][j];
			}
			System.out.println(sum);
		}
		
		
		
		
	}

}
