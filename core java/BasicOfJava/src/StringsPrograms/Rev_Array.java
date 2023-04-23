package StringsPrograms;
public class Rev_Array {
	public static void main(String[] args) {
		int arr1[]= {78,34,73,42,30};
		int arr2[]= {98,02,80,24,98,4};
		int[] merge=new int[arr1.length+arr2.length];
		
		int index=0;
		for(int i=0;i<=merge.length-1;i++) {
			int n=merge[i];
			if(n<=arr1.length) {
				
			merge[n]=arr1[i];
			}
			else {
			merge[i]=arr2[index];
			index++;
			}
		}
		System.out.println(merge.length);
		}
}

