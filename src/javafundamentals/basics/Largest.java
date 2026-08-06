package javafundamentals.basics;
import java.util.Scanner;

public class Largest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt(), n2 = sc.nextInt(), n3 = sc.nextInt();

// #1 Approach 1 - Basic
		
		if(n1 > n2 && n1 > n3) {
			System.out.println("n1 is Largest");
		}
		else if(n2 > n1 && n2 > n3) {
			System.out.println("n2 is Largest");
		}
		else {
			System.out.println("n3 is Largest");
		}

// #2 Approach 2 - simple and smart
		int max = n1;
		
		if(n2 > max) {
			max = n2;
		}
		if(n3>max) {
			max = n3;
		}
		
		System.out.println(max + " is largest");

// #3 preDefined Method in Math class 
		
		int max = Math.max(n3, Math.max(n1, n2));
		
		System.out.println(max + " is largest");
		

	}

}
