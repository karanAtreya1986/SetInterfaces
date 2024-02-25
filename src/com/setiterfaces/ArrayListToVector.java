package com.setiterfaces;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

public class ArrayListToVector {

	public static void main(String[] args) {

		ArrayList<String> a1 = new ArrayList<>();
		a1.add("First");
		a1.add("One");
		a1.add("Second");
		a1.add(null);
		a1.add(null);
		a1.add("First");

		Vector<String> v1 = new Vector<>(a1);// add array list to vector.
		v1.addElement("First");
		v1.addElement("First");
		v1.addElement("Second");
		v1.addElement(null);
		v1.addElement(null);

		// using enumeration
		Enumeration<String> e1 = v1.elements();
		while (e1.hasMoreElements()) {
			System.out.println(e1.nextElement());
		}
	}

}
