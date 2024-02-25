package com.setiterfaces;

import java.util.ArrayList;
import java.util.Vector;

public class VectorListAddWithArrayList {

	public static void main(String[] args) {
		Vector<String> v1 = new Vector<>();
		v1.add("First");
		v1.add("First");
		v1.add("Second");
		v1.add(null);
		v1.add(null);

		//		ArrayList<String> a1 = new ArrayList<>();
		//		a1.add("First");
		//		a1.add("One");
		//		a1.add(null);
		//		a1.add(null);
		//		a1.add("One");
		//		a1.add("Two");

		ArrayList<Integer> a1 = new ArrayList<>();
		a1.add(1);
		a1.add(1);
		a1.add(0);
		a1.add(0);
		a1.add(2);
		a1.add(3);

		//adding multiple list interfaces.
		//v1.addAll(a1);

		for (String s1 : v1) {
			System.out.println(s1);
		}
	}

}
