package ProgrammingArrays;

public class ProgArrayFreq {
	public static void main(String[] args) {
 // Define the input array
		int arr[]= {1,2,2,4,5,6,4,2,2,7,8,9,7};
 // Create an array to store the frequency of each element
		int freq[]=new int[arr.length];
 // Initialize all elements of the frequency array to 0
		for(int i=0;i<freq.length;i++) {
			freq[i]=0;
		}
 // Iterate over the input array and update the frequency array
		for(int i=0;i<arr.length;i++) {
			int count=1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
 // Set the frequency of the repeated element to -1
					freq[j]=-1;
				}
			}
			if(freq[i]!=-1) {
				freq[i]=count;
			}
		}
		 // Print the frequency of each element
		for(int i=0;i<freq.length;i++) {
			if(freq[i]!=-1) {
				System.out.println(arr[i]+" appers "+freq[i]+" times");
			}
		}
	}

}
