package Array_Programming;
import java.util.*;
public class FindMaxNum_Array {
	public static void main(String[] args) {
		int arr[]= {78,48,198,93,49,105,120,23,159};
		int max=0;
		for(int i=0;i<=arr.length-1;i++) {
			int n=arr[i];
			if(n>max)
				max=n;
		}
		System.out.println(max);
		}

}
