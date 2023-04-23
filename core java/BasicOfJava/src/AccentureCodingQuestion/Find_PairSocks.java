package AccentureCodingQuestion;
import java.util.*;
public class Find_PairSocks {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int count=0;
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		//data inserted in array....
		for(int j=0;j<arr.length;j++) {
			for(int k=0;k<arr.length;k++) {
				if(arr[j]==arr[k]) {
					count++;
					System.out.print(arr[k]+" ");
				}
			}
		}
		System.out.println(count);
	
		

		
	}
}
