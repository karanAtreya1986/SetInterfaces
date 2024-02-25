package com.setiterfaces;

import java.util.HashMap;
import java.util.Map;

public class HashMapWithCustomClass {

	public static void main(String[] args) {

		HashMap<Integer, CustomClassBook> h1 = new HashMap<>();

		CustomClassBook b1 = new CustomClassBook(1, "Karan", "Tiger", "Rocky", 200);
		CustomClassBook b2 = new CustomClassBook(1, "Karan", "Tiger", "Rocky", 200);
		CustomClassBook b3 = new CustomClassBook(2, null, "Tiger", "Rocky", 200);
		CustomClassBook b4 = new CustomClassBook(2, null, "Tiger", "Rocky", 200);
		CustomClassBook b5 = new CustomClassBook(-98, null, "Tiger", "Rocky", -1647);

		h1.put(1, b1);
		h1.put(121, b2);
		h1.put(-5678, b4);
		h1.put(1876, b3);
		h1.put(0, b5);

		for (Map.Entry<Integer, CustomClassBook> m1 : h1.entrySet()) {
			Integer k1 = m1.getKey();
			System.out.println(k1);
			CustomClassBook c1 = m1.getValue();
			System.out.println(m1.getKey() + " " + c1.author + " " + m1.getKey() + " " + c1.id + " " + m1.getKey() + " "
					+ c1.name + " " + m1.getKey() + " " + c1.publisher + " " + m1.getKey() + " " + c1.quantity);
		}
	}

}
