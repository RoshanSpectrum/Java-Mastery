package javafundamentals.Patterns;

import java.util.Scanner;

public class invertedHalfPyramid {

	public static void main(String[] args) {
		try ( Scanner sc = new Scanner(System.in)) {
			
			//inverted star pyramid
		/*	int n = sc.nextInt();
			
			for(int i=n;i>=1;i--) {
				for(int j=1; j<=i; j++) {
					System.out.print("X ");
				}
			System.out.println();
			} */
            
			//inverted pyramid - numbers
			int n = sc.nextInt();
			
			for(int i=n;i>=1;i--) {
				for(int j=1; j<=i; j++) {
					System.out.print(j + " ");
				}
			System.out.println();
			}
			
			// Another approach - n-i+1 pattern
			
			/*for(int i=1;i<=n;i++) {
				for(int j=1; j<=n-i+1; j++) {
					System.out.print(j + " ");
				}
			System.out.println();
			} */
		}

	}

}
