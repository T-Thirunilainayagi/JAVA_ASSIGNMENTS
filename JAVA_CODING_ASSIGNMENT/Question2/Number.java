package javacodingassignment;

import java.util.Scanner;

public class Number {
	public static void main(String[] args) {

		int input;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check whether it is a prime number, amstrong number and palindrome ");
		input = sc.nextInt();

		// function call to checkPrime Function
		int primeResult = checkPrime(input);
		if (primeResult == 0) {
			System.out.println(input + " is not a prime number");
		} else {
			System.out.println(input + " is a prime number");
		}

		// function call to checkAmstrong Function
		boolean amResult = checkAmstrong(input);
		if (amResult) {
			System.out.println(input + " is an amstrong number");
		} else {
			System.out.println(input + " is not an amstrong number");
		}

		// function call to checkPalindrome Function
		boolean palResult = checkPalindrome(input);
		if (palResult) {
			System.out.println(input + " is a palindrome");
		} else {
			System.out.println(input + " is not a palindrome");
		}
	}

	// checkPrime method
	public static int checkPrime(int x) {
		int i = 2, half = x / 2;
		boolean isPrime = true;
		while (i <= half) {
			if (x % i == 0) {
				isPrime = false;
				break;
			}
			++i;
		}
		if (isPrime)
			return 1;
		else
			return 0;
	}

	// checkAmstrong method
	public static boolean checkAmstrong(int x) {
		// int number = 371; // Change this to any positive integer
		int realdata, remainder, result = 0;
		realdata = x;

		while (realdata != 0) {
			remainder = realdata % 10;
			result += Math.pow(remainder, 3);
			realdata /= 10;
		}
		if (result == x)
			return true;
		else
			return false;
	}

	// checkPalindrome method
	public static boolean checkPalindrome(int x) {
		int r, sum = 0, temp;
		temp = x;
		while (x > 0) {
			r = x % 10;
			sum = (sum * 10) + r;
			x = x / 10;
		}
		if (temp == sum)
			return true;
		else
			return false;
	}

}
