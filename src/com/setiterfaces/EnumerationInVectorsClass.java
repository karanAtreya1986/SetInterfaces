package com.setiterfaces;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationInVectorsClass {


	public static void main(String[] args) {
		Vector<String> v1 = new Vector<>(3, 6);
		v1.addElement("First");
		v1.addElement("First");
		v1.addElement("Second");
		v1.addElement(null);
		v1.addElement(null);

		//using enumeration
		Enumeration<String> e1=v1.elements();
		while(e1.hasMoreElements()) {
			System.out.println(e1.nextElement());
		}
	}

}


