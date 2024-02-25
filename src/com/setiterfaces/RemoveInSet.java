package com.setiterfaces;

import java.util.HashSet;

public class RemoveInSet {

	public static void main(String[] args) {

		HashSet<String> h1=new HashSet<>();
		h1.add("First");
		h1.add("First");
		h1.add(null);
		h1.add(null);
		h1.add("Second");

		boolean b1=h1.remove("Second"); //specify element to be removed because set is not ordered.
		System.out.println(b1); //returns true or false if removed or not.
		System.out.println("==============");

		//using for loop
		for(String s1:h1) {
			System.out.println(s1);
		}


	}

}

