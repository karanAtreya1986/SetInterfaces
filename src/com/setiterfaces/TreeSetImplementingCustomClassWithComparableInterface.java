package com.setiterfaces;

import java.util.TreeSet;

public class TreeSetImplementingCustomClassWithComparableInterface {

	public static void main(String[] args) {

		TreeSet<CustomClassWithComparableForTreeSet> h1 = new TreeSet<>();

		CustomClassWithComparableForTreeSet b1 = new CustomClassWithComparableForTreeSet(1, "Karan", "Tiger", "Rocky",
				200);
		CustomClassWithComparableForTreeSet b2 = new CustomClassWithComparableForTreeSet(1, "Karan", "Tiger", "Rocky",
				200);
		CustomClassWithComparableForTreeSet b3 = new CustomClassWithComparableForTreeSet(2, null, "Tiger", "Rocky",
				200);
		CustomClassWithComparableForTreeSet b4 = new CustomClassWithComparableForTreeSet(2, null, "Tiger", "Rocky",
				200);
		CustomClassWithComparableForTreeSet b5 = new CustomClassWithComparableForTreeSet(-98, null, "Tiger", "Rocky",
				-1647);

		h1.add(b1);
		h1.add(b2);
		h1.add(b3);
		h1.add(b4);
		h1.add(b5);

		for (CustomClassWithComparableForTreeSet c1 : h1) {
			System.out.println(c1.author + " " + c1.id + " " + c1.name + " " + c1.publisher + " " + c1.quantity);
		}
	}

}
