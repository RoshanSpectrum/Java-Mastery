package javafundamentals.functions;
import java.util.Scanner;

public class primeNumbers {
	
/*	#1 Brute Force Approach O(n^2)
	static void bruteForce(int l, int r) {
		for(int i=l; i<=r; i++) {
		boolean isPrime = (i>1);
		for(int j=2; j<i; j++) {
			if(i%j==0) isPrime = false; break;
		}
		if(isPrime) System.out.print(i+ " ");
	    }
	} */

//   #2 Optimized Approach -> O(√n)
   static void printPrimes(int l, int r) {
		for(int i=l; i<r; i++) {
			if(isPrime(i)) System.out.print(i+" ");
	    }
	}
    
   static boolean isPrime(int n) {
	   if (n < 2) return false;
	   for(int i=2; i*i<=n; i++) {
		   if(n%i == 0) return false;
	   }
	   return true;
   }

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
		int l = sc.nextInt(), r = sc.nextInt();
		printPrimes(l, r);	
		}
	}
}
