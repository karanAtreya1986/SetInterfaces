package com.setiterfaces;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetWorking {

	public static void main(String[] args) {

		HashSet<String> h1 = new HashSet<>();
		//we can use set reference and create object of hashset
		//Set<String> h1 = new HashSet<>();
		h1.add("First");
		h1.add("First");
		h1.add(null);
		h1.add(null);
		h1.add("Second");

		// using iterator.
		Iterator<String> it1 = h1.iterator();
		while (it1.hasNext()) {
			System.out.println(it1.next());
		}

		System.out.println("====================");

		// using for loop
		for (String s1 : h1) {
			System.out.println(s1);
		}

		System.out.println("====================");

		// try to print the set name directly
		System.out.println(h1);
	}

}
