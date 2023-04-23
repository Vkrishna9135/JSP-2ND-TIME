package CodingOfJavaPrograms;
public class Distinct_Elements {
	public static void main(String[] args) {
		int arr[]= {2,3,4,5,6,1,2,3,4};
		
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr.length-1;i++) 
			{
				if(arr[i]==arr[j])//
					return;
				else
				break;
			}
			System.out.println(arr[i]+" ");
		}
}
}
