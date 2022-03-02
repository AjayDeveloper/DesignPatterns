package com.creational.singleton;

public class SingletonClass {

	private static SingletonClass obj = new SingletonClass();;

	// private constructor to force use of
   // getInstance() to create Singleton object
	private SingletonClass() {

	}

	public static  SingletonClass getInstance() {
		
		
			if (obj == null)
				obj = new SingletonClass();
			return obj;
	
		
		
	}
}
