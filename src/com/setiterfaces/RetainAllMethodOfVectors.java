package com.setiterfaces;

import java.util.ArrayList;
import java.util.Vector;

public class RetainAllMethodOfVectors {

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

		//		boolean b1 = v1.retainAll(a1); //returns boolean. retains second collection and removes first collection. common elements from both collection are not removed.
		//		System.out.println(b1);
		//		System.out.println("===============");

		v1.retainAll(a1);

		for (String s1 : v1) {
			System.out.println(s1);
		}
	}

}
