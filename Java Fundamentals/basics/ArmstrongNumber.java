package javafundamentals.basics;

import java.util.*;
import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int start = sc.nextInt(), end = sc.nextInt();
		
		for(int i = start; i<=end; i++) {
			int ori = i;
			int sum = 0;
			
			int digits = String.valueOf(i).length();
			
			while( i > 0) {
				int digit = i%10;
				sum += Math.pow(digit, digits);
				i /=10;
			}
			
			if(sum == ori) {
				System.out.println(ori + ", ");
			}
			
			i = ori;
			
		}

	}

}
