package Multi_DimensionalArray;
import java.util.*;
public class SumOfDiagonal {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int row=sc.nextInt();
		System.out.println("Enter the number of column: ");
		int column=sc.nextInt();
		int arr[][]=new int [row][column];
		System.out.println("enter the "+(row*column)+" no of data");
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<arr.length;i++) {
			int sum=0;
			for(int j=0;j<arr[0].length;j++) {
				if(i==j) {
					sum+=arr[i][j];
				}
				System.out.println(sum);
			}
		}
		
		
		
		
	}

}
