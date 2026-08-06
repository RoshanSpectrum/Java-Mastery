package dsa.arrays;

import java.util.ArrayList;

public class arrayListIntro {
	
	    public static void main(String[] args) {
	    	
	    	ArrayList<Integer> list = new ArrayList<>();

	        ArrayList<String> names = new ArrayList<>();

	        names.add("Ram");
	        names.add("Sam");

	        System.out.println(names);
            //update the list 
	        names.set(1, "John");

	        System.out.println(names);
            
	        // remove the element 
	        //names.remove(0); //or list.remove(Integer.valueOf() for primitives not for 
            names.remove("John");
	        System.out.println(names);
	    }

}
