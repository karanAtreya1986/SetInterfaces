package com.setiterfaces;

import java.util.Iterator;
import java.util.Vector;

public class CapacityWhenWeSpecifyIt {

	public static void main(String[] args) {
		Vector<String> v1 = new Vector<>(3, 6);
		v1.addElement("First");
		v1.addElement("First");
		v1.addElement("Second");
		v1.addElement(null);
		v1.addElement(null);

		//capacity when we specify it.
		int c1 = v1.capacity();
		System.out.println(c1);
		System.out.println("=================");

		// using iterator, we are iterating.
		Iterator<String> it1 = v1.iterator();
		while (it1.hasNext()) {
			System.out.println(it1.next());
		}

		System.out.println("=================");

		// using for loop we are iterating.
		for (String s1 : v1) {
			System.out.println(s1);
		}
	}

}
