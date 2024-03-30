package Question6;

import java.util.Scanner;

public class RecursiveArraySum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int length;
		System.out.println("Enter the length of the Array: ");
		length = sc.nextInt();
		int[] arr = new int[length];
		System.out.println("Enter Array elements: ");
		for (int i = 0; i < length; i++) {
			arr[i] = sc.nextInt();
		}
		
		//calling recursive function
		sum = arraySum(arr, length - 1);
		System.out.println("Sum of the Array : " + sum);
	}

	public static int arraySum(int array[], int len) {
		if (len < 0) 
			return 0;
		else
			//from last element addition starts
			return array[len] + arraySum(array, len - 1);
	}
}
