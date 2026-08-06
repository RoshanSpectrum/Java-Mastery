package javafundamentals.Patterns;

import java.util.Scanner;

public class halfPyramid {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			
			//star Pyramid
			/*int n = sc.nextInt();
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=i;j++) {
					System.out.print("*");
					
				}
			   System.out.println();
			} */
			//number pyramid
			int n = sc.nextInt();
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=i;j++) {
					System.out.print(j);
					
				}
			   System.out.println();
			}
		}

	}

}
