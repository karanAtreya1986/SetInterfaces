package com.setiterfaces;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetWorkingInJava {

	public static void main(String[] args) {

		TreeSet<String> h1 = new TreeSet<>();
		h1.add("Second");
		h1.add("Second");
		// h1.add(null);
		// h1.add(null);
		h1.add("First");

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
