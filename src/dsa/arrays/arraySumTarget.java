package dsa.arrays;

import java.util.Scanner;

public class arraySumTarget {
	
	static void sumTarget(int arr[], int t) {
		for(int i=0;i<arr.length;i++) {
			int sum =0;
			for(int j=i+1;j<arr.length;j++) {
				sum = arr[i] + arr[j];
				if(sum == t && sum % t ==0) {
					System.out.print("("+i+","+j+") ");
				}
			}
		}
	}

	public static void main(String[] args) {
		try ( Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i=0; i<arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			int t = sc.nextInt();
			
			sumTarget(arr, t);
			
		}

	}

}
