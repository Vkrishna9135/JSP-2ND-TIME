package Array_Programming;
import java.util.*;
public class InsertNum_Array {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr1[]= {12,15,20,25,30,35,40};//7
		int arr2[]= new int[arr1.length+1];//8
		int ind=0;
		int index=sc.nextInt();//3
		System.out.println("Enter the value to insert in Array: ");
		int val=sc.nextInt();//56
		for(int i=0;i<=arr2.length-1;i++) {
			if(i!=index) {
			arr2[i]=arr1[ind];
			ind++;
			}else {
				arr2[index]=val;
			}}
		for(int i=0;i<=arr2.length-1;i++) {
			System.out.print(arr2[i]+" ");
		}}}
