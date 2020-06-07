package com.elwii.learning.p3.array;

public class ArrayHasElement {

	public static void main(String[] args) {

		int[] numbers = { 3, 6, 8, 12, 18, 22, 28, 30 };
		ArrayHasElement array = new ArrayHasElement();
		System.out.println("has 12 : " + array.hasElement(numbers, 12));
		System.out.println("has 15 : " + array.hasElement(numbers, 15));
	}

	public boolean hasElement(int[] numbers, int element) {
		for (int number : numbers) {
			if (number == element) {
				return true;
			}
		}
		return false;
	}
}
