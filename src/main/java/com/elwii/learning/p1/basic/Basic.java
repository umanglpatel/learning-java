package com.elwii.learning.p1.basic;

public class Basic {

	static String global = "This is global scope variable";

	public static void main(String[] args) {
		Basic basic = new Basic();
		String name = "Universe";
		basic.sayHello(name);
		System.out.println(global);
	}

	// comment added new feature
	public void sayHello(String name) {

		System.out.println("Hello " + name);
		System.out.println(global);

		int x = 10;

		if (1 == 1) {
			int i = 0;
			System.out.println(x);
		} else {
			int j = 1;
		}

		for (int i = 0; i < 10; i++) {
//			i is available here
			String test = "xyz";
			x = 20;
			global = "change value";
		}

//		System.out.println(test);
//		int j = 10;
//		System.out.println(j);
//		int z = 20;
		{
			int z = 10;
			System.out.println(z);
		}
		int z = 20;
	}
}
