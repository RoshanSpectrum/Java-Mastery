package javafundamentals.basics;

import java.util.Scanner;

public class largestOfNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		int n = sc.nextInt(); #toggle
		int max = 0;
//		#1 
/*	while(n!=0) {
//			if(n > max) {
//				max = n;
//			n = sc.nextInt();
//			}
		} */
		
//		#2
		while (true) {
		    int n = sc.nextInt(); 
		    if (n == 0) break;

		    max = Math.max(max, n);
		}
	System.out.println("Largest is " + max);
	}
}
