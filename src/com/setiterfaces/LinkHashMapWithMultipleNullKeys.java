package com.setiterfaces;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkHashMapWithMultipleNullKeys {

	public static void main(String[] args) {
		LinkedHashMap<String, String> h1 = new LinkedHashMap<>();
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
