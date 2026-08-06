package javafundamentals.basics;
import java.util.*;

public class simpleInterest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

//		int p = sc.nextInt(), t= sc.nextInt(), r = sc.nextInt();
//		
//		int si = (p*t*r)/100;
//		
//		System.out.println(si);
		
		float p = sc.nextFloat() , t= sc.nextFloat(), r = sc.nextFloat();
		
		float si = (p*t*r)/100;
		
		System.out.println(si);
	}

}
