package Array_Programming;
public class FindMin_Array {
	public static void main(String[] args) {
		int arr[]= {751,862,963,794,595,406};
		int min=0;
		for(int i=0;i<=arr.length-1;i++) {
			int n=arr[i];
			if(n<min) 
				min=n;
		}
	System.out.println(min);
	}

}
