package Basics;

import java.lang.reflect.Array;

public class Lab1 {

	public static void main(String[] args) {
		System.out.println(sum(5));
		System.out.println(fact(5));
		
		int[] numbers = {5, -2, 0, 234, -438, 63};
		System.out.println("Min: " + findMin(numbers));
		System.out.println("Max: " + findMax(numbers));
		System.out.println("Avg: " + findAverage(numbers));
	}
	
	public static int sum(int n) {
		int sum = 0;
		for(int i=1; i<=n; i++) {
			sum = sum + i;
		}
		return sum;
	}
	
	public static int fact(int n) {
		if(n==0) {
			return 1;
		} 
		return fact(n-1) * n;
	}
	
	public static int findMin(int[] arr) {
		int min = arr[0];
		for (int i=0; i<arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}
	
	public static int findMax(int[] arr) {
		int max = arr[0];
		for (int i =0; i<arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		} return max;
	}
	
	public static double findAverage(int[] arr) {
		double sum=0;
		for(int i=0; i<arr.length; i++) {
			sum = sum + arr[i];
		} return (sum/arr.length);
	}
	
	

}
