package javafundamentals.basics;

import java.util.Scanner;

public class factorsofANumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextInt();
		
//#1 - Brute Force (most basic) -> O(n) complexity
//		for(int i =1;i<=n;i++) {
//			if(n%i==0) {
//				System.out.print(i+", ");

//#2 - Optimized (√n method) -> O(√n) 
        for(int i=1; i<=Math.sqrt(n); i++) {
        	    if(n%i==0) {
        	    	   System.out.print(i+", ");
        	    	   if(i != n/i) {
        	    		   System.out.print(n/i + ", ");
        	    	   }
        	    }
	    }
	}
}
 
