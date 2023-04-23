package Array_Programming;
import java.util.*;
public class PrintEvenNumArray {
	public static void main(String[] args) {
		int arr[]= {12,33,48,56,72,65,79,80};
		for(int i=0;i<=arr.length-1;i++) {
			int n=arr[i];
			if(n%2==0) {
				System.out.print(n+" ");
			}
		}
	}

}
