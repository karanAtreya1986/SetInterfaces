package com.setiterfaces;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkHashMapWorking {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> h1 = new LinkedHashMap<>();
		h1.put(1, "Tiger");
		h1.put(1, "Tiger");
		h1.put(2, null);
		h1.put(2, null);
		h1.put(0, "James Bond");

		// iterate over map.
		for (Map.Entry<Integer, String> e1 : h1.entrySet()) {
			System.out.println(e1.getKey() + " " + e1.getValue());

		}

	}

}
