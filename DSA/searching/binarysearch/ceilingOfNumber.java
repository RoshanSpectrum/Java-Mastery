package dsa.searching.binarysearch;

import java.util.Scanner;

public class ceilingOfNumber {
	
	static int Ceiling_binarySearch(int[] arr, int t) {
		int s = 0;
		int e = arr.length-1;
		
		if(t > arr[arr.length-1]) {
			return -1;
		}
		while( s<=e) {
			int m = s + (e-s) / 2;
			
			if(t==arr[m]) {
				return m;
			}
			else if(t > arr[m] ) {
				s = m + 1;
			}
			else {
				e = m - 1;
			}
		}
	 return s;
	}

	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for(int i=0;i<arr.length;i++) {
				arr[i] = sc.nextInt();
			}
			int t = sc.nextInt();
			
			int ans = Ceiling_binarySearch(arr, t);
			
			if(ans == -1) System.out.println(-1);
			else
			System.out.println("Celing Value " + arr[ans] + " At " + ans);
		}

	}

}
