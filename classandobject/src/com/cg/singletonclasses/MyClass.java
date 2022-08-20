package com.cg.singletonclasses;

public class MyClass {

	
	static MyClass obj=new MyClass();
	static int countobj;
	private MyClass()
	{
		 System.out.println("MyClass object created");
		 
	}
	 
	
	public static void count()
	{
		countobj++;
		System.out.println("Total object are :" + countobj);
		
	}
	
	public static MyClass getInstance()
	{
		return obj;
	}

}
