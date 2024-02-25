package com.setiterfaces;

import java.util.HashMap;
import java.util.Map;

public class HashMapWithNullKeysCheck {

	public static void main(String[] args) {
		HashMap<String, String> h1 = new HashMap<>();
		h1.put("Alison", null);
		h1.put("Alison", null);
		h1.put(null, "Tiger");
		h1.put(null, "Tiger");
		h1.put(null, "Lion");
		h1.put("Rocky", "James Bond");

		// iterate over map.
		for (Map.Entry<String, String> e1 : h1.entrySet()) {
			System.out.println(e1.getKey() + " " + e1.getValue());

		}

	}

}
