package Array_Programming;
import java.util.*;
public class OddNum_Array {
	public static void main(String[] args) {
		int arr[]= {63,73,85,66,83,48,32,92,84};
		for(int i=0;i<=arr.length-1;i++) {
			int n=arr[i];
			if(n%2==1) {
				System.out.print(n+" ");
			}
		}
		
		
		}

}
