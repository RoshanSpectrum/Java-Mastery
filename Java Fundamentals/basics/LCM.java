package javafundamentals.basics;

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		Smallest number divisible by both numbers
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
//		#1 brute force method
		int max = Math.max(n1,  n2);
		
		while(true) {
			if(max % n1 == 0 && max % n2 == 0) {
				System.out.println("LCM= " + max);
				break;
			}
			max++;
		}
//		#2 using hcf hcf*lcm = a*b
		
		int orin1 = n1;
		int orin2 = n2;
		
		while(n2 !=0) {
			int temp = n2;
			n2 = n1%n2;
			n1 = temp;
		}
		int hcf =  n1;
		
		int lcm = (orin1 * orin2) / hcf;
		
		System.out.println("HCF =" +hcf);
		System.out.println("LCM = "+lcm);

	}

}
