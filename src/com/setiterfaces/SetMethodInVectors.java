package com.setiterfaces;

import java.util.ArrayList;
import java.util.Vector;

public class SetMethodInVectors {

	public static void main(String[] args) {
		Vector<String> v1 = new Vector<>();
		v1.add("First");
		v1.add("First");
		v1.add("Second");
		v1.add(null);
		v1.add(null);

		ArrayList<String> a1 = new ArrayList<>();
		a1.add("First");
		a1.add("One");
		a1.add(null);
		a1.add(null);
		a1.add("One");
		a1.add("Two");

		v1.addAll(a1);

		String s2 = v1.set(3, "Rocky Balboa"); // set returns the older value which was replaced.
		System.out.println(s2);
		System.out.println("============");

		for (String s1 : v1) {
			System.out.println(s1);
		}
	}

}
