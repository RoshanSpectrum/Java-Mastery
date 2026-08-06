package dsa.arrays.sorting;

import java.util.Arrays;

public class BubbleSortAlgo {
	public static int[] sortArray(int[] nums) {
        
        //BUBBLE SORT IN JAVA

        int n = nums.length;
        
        for(int i=0; i< n - 1; i++){
            boolean swapped = false;

            for(int j = 0; j < n - i - 1; j++) { // or j=1 and j < n-i
                if(nums[j] > nums[j+1]) { // or arr[j] < arr[j -1]
                   int temp = nums[j];
                   nums[j] = nums[j+1];
                   nums[j+1] = temp;

                   swapped = true;
                }
            }
        if(!swapped)
           break;
        }
    return nums;
    }

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		
		int ans[] = sortArray(arr);
//		for(int i=0; i<ans.length;i++) {
//			System.out.print(ans[i]+ " ");
//		}
		
		System.out.println(Arrays.toString(ans));
		}

}
