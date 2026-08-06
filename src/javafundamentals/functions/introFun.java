package javafundamentals.functions;

import java.util.Scanner;

public class introFun {
	
	static int add(int n1, int n2) {
		return n1+n2;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int sum = add(a, b);	
		System.out.print("The sum is " + sum);
	} 

}
