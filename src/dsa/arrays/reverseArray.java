package dsa.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class reverseArray {
	
	static void swap(int[] arr, int ind1, int ind2) {
	int temp = arr[ind1];
	arr[ind1] = arr[ind2];
	arr[ind2] = temp;
	
   }
	static void reverse(int[] arr) {
		int start = 0;
		int end = arr.length-1;
		
		while(start < end) {
			swap(arr, start, end);
			start++;
			end--;
		}
		
	}

	public static void main(String[] args) {
		
		try ( Scanner sc = new Scanner(System.in)) {
			int arr[] = new int[5];
			
			System.out.println("Enter Arrays values: ");
			for(int i=0; i<arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			System.out.print("Original Arrray: ");
			for(int i : arr) {
				System.out.print(i+" ");
			}
			
			reverse(arr);
			System.out.println(Arrays.toString(arr));
			
//			System.out.println();
//			for(int i=arr.length -1; i>=0; i--) {
//				System.out.print(arr[i] + " ");
//			}
			
		}
		

	}

}
