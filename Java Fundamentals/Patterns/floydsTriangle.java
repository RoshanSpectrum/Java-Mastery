package javafundamentals.Patterns;

import java.util.Scanner;

public class floydsTriangle {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			
			//number pyramid
			int n = sc.nextInt();
			int num = 1;
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=i;j++) {
					System.out.print(num++ +" ");
					
				}
			   System.out.println();
			}
		}

	}

}
