package com.setiterfaces;

import java.util.ArrayList;
import java.util.Vector;

public class RemoveMethodinVectors {

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

		//String s2=v1.remove(1); // returns the removed element. removed based on index.
		//System.out.println(s2);
		//		boolean b1=v1.remove("One"); //remove by value. returns true if removed else false. removes first occurrence of the element.
		//		System.out.println(b1);
		//		System.out.println("================");

		boolean b1=v1.removeAll(a1); //returns boolean. it removes second collection plus common elements from first and second collection.
		System.out.println(b1);

		for (String s1 : v1) {
			System.out.println(s1);
		}
	}

}
