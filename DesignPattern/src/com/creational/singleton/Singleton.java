package com.creational.singleton;

public class Singleton {

	public static void main(String[] args) {

		SingletonClass obj1 = SingletonClass.getInstance();
		SingletonClass obj2 = SingletonClass.getInstance();
		
		System.out.println("hashCode " + obj1.hashCode());
		System.out.println("hashCode " + obj2.hashCode());
	}
}
