package Array_Programming;
import java.util.*;
public class Dynamic_Array {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int arr1[]= {10,20,30,40};
		int arr2[]=new int[arr1.length+1];
		int value=sc.nextInt();
		int index=0;
		for(int i=0;i<=arr2.length-1;i++) {
			int n =arr1[i];
			System.out.println(n);
			if(n==arr2.length) {
				arr2[i]=value;
				}
			else {
				arr2[i]=arr2[index];
			index++;
			}
			
		}
		arr1=arr2;
		for(int i=0;i<=arr1.length-1;i++) {
			System.out.println(arr1[i]);
		}
		System.out.println();
		
	}

}
