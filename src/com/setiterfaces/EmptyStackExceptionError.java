package com.setiterfaces;

import java.util.Stack;

public class EmptyStackExceptionError {

	public static void main(String[] args) {

		Stack<Integer> s1 = new Stack<>();
		showPush(s1, 100);
		showPush(s1, 100);
		showPush(s1, 0);
		showPush(s1, 0);
		showPush(s1, -96);
		showPush(s1, -16784);

		showPop(s1);
		showPop(s1);
		showPop(s1);
		showPop(s1);
		showPop(s1);
		showPop(s1);
		showPop(s1);
		showPop(s1);

	}

	public static void showPush(Stack<Integer> s1, int i1) {
		s1.push(i1);
		System.out.println(i1);
		System.out.println(s1);
	}

	public static void showPop(Stack<Integer> s1) {
		s1.pop();
		System.out.println(s1);
	}

}
