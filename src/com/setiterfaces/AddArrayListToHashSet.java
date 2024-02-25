package com.setiterfaces;

import java.util.ArrayList;
import java.util.HashSet;

public class AddArrayListToHashSet {



	public static void main(String[] args) {

		HashSet<String> h1=new HashSet<>();
		h1.add("First");
		h1.add("First");
		h1.add(null);
		h1.add(null);
		h1.add("Second");

		ArrayList<String> a1=new ArrayList<>();
		a1.add("One");
		a1.add("One");
		a1.add(null);
		a1.add(null);
		a1.add("Two");

		h1.addAll(a1);

		//try to add array list of different data type.
		//
		//		ArrayList<Integer> a1=new ArrayList<>();
		//		a1.add(1);
		//		a1.add(1);
		//		a1.add(null);
		//		a1.add(null);
		//		a1.add(2);
		//
		//		h1.addAll(a1);


		//using for loop
		for(String s1:h1) {
			System.out.println(s1);
		}


	}

}




