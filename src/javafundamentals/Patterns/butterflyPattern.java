package javafundamentals.Patterns;

import java.util.Scanner;

public class butterflyPattern {

	public static void main(String[] args) {
		try ( Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			
			// Upper Half 
			for(int i=1;i<=n;i++) {
				
				// stars - left triangle
				for(int j=1;j<=i;j++) {
					System.out.print("* ");
				}
				for(int j=1; j<=(2*(n-i)); j++) {
					System.out.print("  ");
				}
				
				for(int j=1;j<=i;j++) {
					System.out.print("* ");
				}
			 System.out.println();
			}
			
			// lower half 
			for(int i=n-1;i>=1;i--) { // n-1 to avoid repeating the middle row
				
				// stars - left triangle
				for(int j=1;j<=i;j++) {
					System.out.print("* ");
				}
				for(int j=1; j<=(2*(n-i)); j++) {
					System.out.print("  ");
				}
				
				for(int j=1;j<=i;j++) {
					System.out.print("* ");
				}
			 System.out.println();
			}
		}

	}

}
