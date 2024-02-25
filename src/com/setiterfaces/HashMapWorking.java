package com.setiterfaces;

import java.util.HashMap;
import java.util.Map;

public class HashMapWorking {

	public static void main(String[] args) {
		Map<Integer, String> h1 = new HashMap<>();
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
