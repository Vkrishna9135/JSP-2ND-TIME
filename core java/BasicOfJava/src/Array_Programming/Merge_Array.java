package Array_Programming;
public class Merge_Array {
	public static void main(String[] args) {
		int arr1[]= {66,48,95,41,73};
		int arr2[]= {78,47,84,74,55};
		int merge[]= new int[arr1.length+arr2.length];
		int index=0;
		for(int i=0;i<=merge.length-1;i++) {
			if(i<=arr1.length-1) {
				merge[i]=arr1[i];
			}
			else {
				merge[i]=arr2[index];
				index++;
			}}
		for(int i=0;i<=merge.length-1;i++) {
			System.out.print(merge[i]+" ");
		}}}
