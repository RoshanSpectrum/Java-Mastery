package dsa.searching.linearsearch;

import java.util.Scanner;

public class linearSearchIntro {
	
	static int linearSearch(int[] arr, int key) {
		for(int i=0; i<arr.length;i++) {
			if(arr[i] == key) {
//				System.out.println("The ele " + key + " is located at " + i +" postion");
				return i;
			}
		}
	return -1;
	}
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			int arr[] = new int[5];
			
			for(int i=0;i<arr.length;i++) {
				arr[i] = sc.nextInt();
			}
			
			System.out.println("Enter Key: ");
			int key = sc.nextInt();
			
			System.out.println(linearSearch(arr, key));	
		}
		
	}

}
