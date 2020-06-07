package com.elwii.learning.p2.typeconversion;

public class TypeConversion {

	public static void main(String[] args) {
		{
			// widening conversion // Autometic conversion.
			int x = 10;
			long y = x;
			System.out.println(y);
		}
		{
			// Narrowing conversion // not autometic.
			long x = 20;
			int y;
			y = (int) x;
			System.out.println(y);
		}

		// Narrowing conversion // not autometic.
		float a = 30.55f;
		int b = (int) a;
		System.out.println(b);

//		String s = "hello";
//		int test = (int) s;
//
//		int testInt = 50;
//		String testString = (String) testInt;

		short sr = 5;
		int srInt = sr;
		short srAgain = (short) srInt;

	}
}
