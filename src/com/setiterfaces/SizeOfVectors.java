package com.setiterfaces;

import java.util.ArrayList;
import java.util.Vector;

public class SizeOfVectors {

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

		//size of the collection.
		int i1=v1.size();
		System.out.println(i1);
		System.out.println("============");

		for (String s1 : v1) {
			System.out.println(s1);
		}
	}

}
