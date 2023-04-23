package Multi_DimensionalArray;
import java.util.*;
public class GetMaxVal_Row {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows :");
		int row=sc.nextInt();
		System.out.println("Enter the number of columns :");
		int column=sc.nextInt();
		int max=0;
		int arr[][]=new int [row][column];
		System.out.println("Enter the "+(row*column)+" no of data");
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr[0].length;j++) {
				if(max<arr[i][j]) {
				max=arr[i][j];
				}
				
			}
			System.out.println(max);
		}
	}

}
