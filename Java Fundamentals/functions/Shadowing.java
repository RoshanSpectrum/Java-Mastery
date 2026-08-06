package javafundamentals.functions;

public class Shadowing {
	static int x = 10;
	public static void main(String[] args) {
		System.out.println(x); // prints 10
		
		int x;
		// System.out.println(x); // prints rror -> The local variable x may not have been initialized
		x = 20; //this shadowed the class variable initialized at first 
		System.out.println(x); // 20
		          // please note the scope begins when var is declared i.e int x;
		          // -> means the shadowing begins soon after declaration 
		
		fun();
	}
	
	static void fun() {
		System.out.println(x);
	}
	

}
