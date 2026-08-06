package javafundamentals.Patterns;

import java.util.Scanner;

public class zero_one_Trinagle {

	public static void main(String[] args) {
		try (Scanner  sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			
			for(int i=0;i<=n;i++) {
				for(int j=1;j<=i;j++) {
					if((i+j) % 2 == 0) { System.out.print("1 "); }
					else { System.out.print("0 "); }
				}
			System.out.println();
			}
		}
		

	}

}
