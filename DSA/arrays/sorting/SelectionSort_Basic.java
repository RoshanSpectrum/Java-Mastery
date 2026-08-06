package dsa.arrays.sorting;

import java.util.Arrays;

public class SelectionSort_Basic {
	
	public static void selectionSort(int[] arr) {
		if(arr == null || arr.length <= 1) {
			return;
		}
		
		for(int i=0; i< arr.length - 1; i++) {
			int minIndex = i;
			
			for(int j=i+1; j< arr.length; j++) {
				if(arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
	}

	public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
		
		selectionSort(arr);
//		for(int i=0; i<ans.length;i++) {
//			System.out.print(ans[i]+ " ");
//		}
		
		System.out.println(Arrays.toString(arr));
	}
}
