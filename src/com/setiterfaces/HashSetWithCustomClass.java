package com.setiterfaces;

import java.util.HashSet;

public class HashSetWithCustomClass {

	public static void main(String[] args) {

		HashSet<CustomClassBook> h1 = new HashSet<>();

		CustomClassBook b1 = new CustomClassBook(1, "Karan", "Tiger", "Rocky", 200);
		CustomClassBook b2 = new CustomClassBook(1, "Karan", "Tiger", "Rocky", 200);
		CustomClassBook b3 = new CustomClassBook(2, null, "Tiger", "Rocky", 200);
		CustomClassBook b4 = new CustomClassBook(2, null, "Tiger", "Rocky", 200);
		CustomClassBook b5 = new CustomClassBook(-98, null, "Tiger", "Rocky", -1647);

		h1.add(b1);
		h1.add(b2);
		h1.add(b3);
		h1.add(b4);
		h1.add(b5);

		for (CustomClassBook c1 : h1) {
			System.out.println(c1.author + " " + c1.id + " " + c1.name + " " + c1.publisher + " " + c1.quantity);
		}
	}

}
