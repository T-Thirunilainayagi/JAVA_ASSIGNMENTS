package Question4;

import java.util.Arrays;
import java.util.Random;

public class RandomArraySortingEG {
	public static void main(String[] args) {
		Random random = new Random();

		int[] Array = new int[10];
		System.out.println("Random Values in array before sorting");
		
		//assigning random values to array 
		for (int i = 0; i < 10; i++) {
			Array[i] = random.nextInt(100);
			System.out.print(Array[i] + " ");
		}
		System.out.println();
		System.out.println("Random Values in array after sorting");
		
		//using sort inbuilt method to sort arrays
		Arrays.sort(Array);
		for (int i : Array) {
			System.out.print(i + " ");
		}
	}
}
