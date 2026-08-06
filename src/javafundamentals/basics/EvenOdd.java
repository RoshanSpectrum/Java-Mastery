package javafundamentals.basics;
import java.util.*;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
	
		
		if(n%2 == 0) {
			System.out.println("It is Even");
		}
		else {
			System.out.println("It is Odd");
		}
		
	}

}
