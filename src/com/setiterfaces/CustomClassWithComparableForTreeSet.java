package com.setiterfaces;

public class CustomClassWithComparableForTreeSet implements Comparable<CustomClassWithComparableForTreeSet> {

	public int id;
	String name, author, publisher;
	int quantity;

	public CustomClassWithComparableForTreeSet(int id, String name, String author, String publisher, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}

	@Override
	public int compareTo(CustomClassWithComparableForTreeSet c1) {
		if (id > c1.id) {
			return 1;
		} else if (id < c1.id) {
			return -1;
		} else {
			return 0;
		}

	}

}
