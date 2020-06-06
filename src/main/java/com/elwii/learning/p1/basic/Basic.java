package com.elwii.learning.p1.basic;

public class Basic {

	public static void main(String[] args) {
		Basic basic = new Basic();
		String name = "Universe";
		basic.sayHello(name);
	}

	public void sayHello(String name) {

		System.out.println("Hello " + name);

		if (1 == 1) {
			int i = 0;
		} else {
			int j = 1;
		}
//		int j = 10;
//		System.out.println(j);
//		int z = 20;
		{
			int z = 10;
			System.out.println(z);
		}
		int z = 10;
//		System.out.println(z);  // not allowed
	}
}


// comment 