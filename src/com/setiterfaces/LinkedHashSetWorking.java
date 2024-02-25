package com.setiterfaces;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetWorking {

	public static void main(String[] args) {

		LinkedHashSet<String> h1 = new LinkedHashSet<>();
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
