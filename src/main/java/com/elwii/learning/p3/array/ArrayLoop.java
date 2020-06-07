package com.elwii.learning.p3.array;

public class ArrayLoop {

	int global = 10;

	public static void main(String[] args) {

//		int numbers2[] = new int[10];
//		int[] numbers3 = new int[10];

		int x = 20;
		System.out.println(x);

		int[] arr = { 1, 2, 3, 4, 5 };
		System.out.println(arr[2]);
		arr[2] = 5;
		System.out.println(arr[2]);

		// accessing array
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
		System.out.println("The third element in array at index 3 is : " + numbers[3]);

		ArrayLoop arrayLoop = new ArrayLoop();

		// looping through arrays using for loop
		int[] resultOf10Added = arrayLoop.add10ToNumbers(numbers);
		// looping through arrays using while loop
		int[] resultOf20Added = arrayLoop.add20ToNubmers(resultOf10Added);
		// looping though for each
		arrayLoop.add30ToNumbers(resultOf20Added);
	}

	public int[] add10ToNumbers(int[] numbers) {
		System.out.println("--------------Adding 10---------------");
		int[] resultArray = new int[numbers.length];
		for (int i = 0; i < numbers.length; i++) {
			int add10 = numbers[i] + 10;
			resultArray[i] = add10;
			System.out.println(add10);
		}
		return resultArray;
	}

	public int[] add20ToNubmers(int[] numbers) {
		System.out.println("--------------Adding 20---------------");
		int[] resultArray = new int[numbers.length];
		int i = 0;
		while (i < numbers.length) {
			int add20 = numbers[i] + 20;
			resultArray[i] = add20;
			System.out.println(add20);
			i++;
		}
		return resultArray;
	}

	public void add30ToNumbers(int[] numbers) {
		global = 20;
		System.out.println("--------------Adding 30---------------");
		for (int n : numbers) { // enhanced for loop or for-each loop
			int add30 = n + 30;
			System.out.println(add30);
		}
	}

	public void test() {
	}

}
