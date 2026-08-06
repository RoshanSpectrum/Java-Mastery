package javafundamentals.Patterns;

import java.util.Scanner;

public class rightAlignedTriangle {

	public static void main(String[] args) {
		try( Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			
			for(int i=1;i<=n;i++) {
            // inner loop -> space 
				for(int j=1;j<=n-i;j++) {
					System.out.print(" ");
				}
				
				//inner loop -> star
				for(int k=1;k<=i;k++) {
					System.out.print("*");
				}
			System.out.println();
			}
		}

	}

}
