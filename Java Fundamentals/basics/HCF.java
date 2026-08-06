package javafundamentals.basics;

import java.util.Scanner;

public class HCF {
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		int hcf = 1;
		
//		largest number that divides both numbers exactly
//      #1 Brute Force Method
				
/*		for(int i=1;i<=Math.min(n1,  n2); i++) { 
			if(n1%i==0 && n2%i==0){
				hcf = i;
			}
		}
				System.out.println("HCF = " +hcf); */
		
//		#2 Using Euclidean Algo
//		Instead of checking all factors, Repeat until reminder becomes 0
//		hcf(a, b) = hcf(b, a%b)
		
		while(n2 !=0) {
			int temp = n2;
			n2 = n1 % n2;
			n1 = temp;
			
		}
		
		System.out.println("HCF = " + n1);
		
	}

}
