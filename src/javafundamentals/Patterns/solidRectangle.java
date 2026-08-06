package javafundamentals.Patterns;

import java.util.Scanner;

public class solidRectangle {

	public static void main(String[] args) {
		try ( Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
		for(int i=0;i<n;i++) { //rows
			for(int j=0;j<n;j++) {
		         System.out.print("*"); //columns
		    }
			System.out.println();
		}
	}

  }

}
