package Multi_DimensionalArray;
import java.util.*;
public class SumOf_2Arrays {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of ro");
		int arr1[][]= {{27,68,76},{89,66,58},{87,84,55}};
		int arr2[][]= {{36,27,18},{9,45,54},{81,99,72}};
		int finalArr[][]=new int [arr1.length][arr2.length];
		
		if(arr1.length==arr2.length&&arr1[0].length==arr2[0].length) {
			for(int i=0;i<arr1.length;i++) {
				for(int j=0;j<arr2.length;j++) {
					finalArr[i][j]=arr1[i][j]+arr2[i][j];
					System.out.print(finalArr[i][j]+" ");
				}
				
			}
			
			
		}
		else {
			System.out.println("invalid Array");
		}
		
	
}
	
}
