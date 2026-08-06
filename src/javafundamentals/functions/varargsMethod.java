package javafundamentals.functions;

import java.util.Arrays;
import java.util.Scanner;

public class varargsMethod {
	
	// Single vararg
	
	static void fun(int ... nums) {
		System.out.println(Arrays.toString(nums));
    }
	
	// Multiple type args with varargs
	
	static void multipleTypes(int a, int b, String... names) { // vararg should always be at the end
		
		System.out.println(a + " " + b);
		 
//			System.out.print(Arrays.toString(names)); 
		
// or        
		    for(String name : names)  {
		       System.out.print(name+ " ");
		    }
	}
	
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		fun(3, 4, 6, 9, 13, 18, 24);	  //allows multiple args
		
		//fun(2); // allows one arg
		
		//fun(); // allows even zero arg
		
		multipleTypes(5, 10, "Roshan", "Simran", "Ruksana");

	}

}
