package Question7;

import java.util.Scanner;

public class RecursiveSmallestArrayElement {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int smallest=0;
		int length;
		System.out.println("Enter the length of the Array: ");
		length= sc.nextInt();
		int []arr = new int[length];
		System.out.println("Enter Array elements: ");
		for(int i=0;i<length;i++) {
			arr[i]=sc.nextInt();
		}
		if (arr.length >length) {
			System.out.println("Excess elements.Array is trimmed to length value");
		}
		smallest=smallestElement(arr,length-1);
		System.out.println("Smallest element in the Array is : "+smallest);
	}
	// recursive method to find smallest number
	static int smallestElement(int arr[],int len)
	{
	    if (len==0)
	        return arr[0];
	    else    
	        return Math.min(arr[len],smallestElement(arr,len-1));    
	}
}
