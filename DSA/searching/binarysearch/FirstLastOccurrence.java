package dsa.searching.binarysearch;

import java.util.Arrays;
import java.util.Scanner;

public class FirstLastOccurrence {

    static int[] searchRange(int[] nums, int target) {
        int first = search(nums, target, true); //first Occurence
        int last = search(nums, target, false);  //last Occurence

        return new int[]{first, last};
    }

    static int search(int[] nums, int target, boolean findFirst) {
        int s = 0;
        int e = nums.length - 1;
        int ans = -1;

        while(s<=e) {
            int m = s + (e-s) /2;
            if(nums[m] == target) {
                ans = m;
                if(findFirst) {
                    e = m -1;
                }
                else {
                    s = m +1;
                }
            }
            else if(nums[m] < target) {
                s = m + 1;
            }
            else {
                e = m - 1;
            }
        }
    return ans;
    }

    public static void main(String args[]) {
    	try (Scanner sc = new Scanner(System.in)) {
    		
    		int n = sc.nextInt();
    		
    		int[] nums = new int[n];
    		for(int i=0; i<nums.length; i++) {
    			nums[i] = sc.nextInt();
    		}
    		
    		int target = sc.nextInt();
    		
    		int res[] = searchRange(nums, target);
    		System.out.println(Arrays.toString(res));
    	}
    }
}
