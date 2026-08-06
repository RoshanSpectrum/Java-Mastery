package javafundamentals.basics;

import java.util.Scanner;

public class sumOfNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int sum = 0;
		
//		#1 i) - Sum until user enters 0 
		while(n!=0) {
			sum +=n;
			n = sc.nextInt();
		}
		System.out.println("Sum = " + sum);
		
//		#1 ii) - Sum until user enters 0 - infinite loop + break
		
		while(true) {
			sum+=n;
			n = sc.nextInt();
			if(n==0) break;
		}
		
		System.out.println("Sum = " + sum);
	}

}
