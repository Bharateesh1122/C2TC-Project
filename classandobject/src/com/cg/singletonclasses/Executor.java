package com.cg.singletonclasses;

public class Executor {

	public static void main(String[] args) {
		
		
		MyClass obj=MyClass.getInstance();
		MyClass.count();
		
		
		System.out.println("Creating one more reference .....");
		MyClass obj1=MyClass.getInstance();
		MyClass.count();

		
	}

}
