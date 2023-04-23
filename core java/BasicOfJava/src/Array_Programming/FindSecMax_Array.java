package Array_Programming;
import java.util.*;
public class FindSecMax_Array {
	public static void main(String[] args) {
		int arr[]= {7150,889,510,546,901,270,393,502,689};
		int fmax=0;
		int smax=0;
		for(int i=0;i<=arr.length-1;i++) {
			int n=arr[i];
			if(n>fmax) {
				smax=fmax;//0,
				fmax=n;//715
				}
			else if(n>smax) {
				smax=n;
			}		
		}
		System.out.println(fmax);
		System.out.println(smax);
	}
}
