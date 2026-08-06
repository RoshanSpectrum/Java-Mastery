package dsa.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class arrayIntro {

	public static void main(String[] args) {
		try ( Scanner sc = new Scanner(System.in)) {
	//array declaration
	// dataType[] varName = new dataType[size];
	        // direct declaration
			int[] nums = {20, 10, 30, 40};; //just getting defined in the stack
			 //object is being created in heap memory
	
			
			//using new keyword
			String[] names = new String[]{"Roshan", "Simran", "Ruksana"};
			
			// Array Traversing 
			   // using for loop
			for(int i=0;i<nums.length; i++) {
				System.out.print(nums[i]);
			}
			System.out.println();
			Arrays.sort(nums);
			// void method it returns nothing -> modifies array directly
			                   // cannot be passed as a argument for print methods
			
			System.out.print(Arrays.toString(nums));
			System.out.println();
			   // using enhanced for loop
			for(int i : nums) {
				System.out.print(i);
			}
			System.out.println();
			for (int i=0; i<names.length;i++) {
				System.out.print(names[i]);
			}
		}
	}

}
