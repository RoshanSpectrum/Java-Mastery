package javafundamentals.basics;
import java.util.*;


public class fibonacciSequence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int n1=0, n2=1;
		
		for(int i=1; i<=n; i++) {
			System.out.print(n1 + ", 10");
			int next = n1+n2;
			n1 =  n2;
			n2 = next;	
		}
		
	}

}
