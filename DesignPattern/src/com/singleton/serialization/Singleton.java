package com.singleton.serialization;

import java.io.Serializable;

public class Singleton implements Serializable{
	
	public static Singleton instance = new Singleton();
	
    // private constructor
	private Singleton() 
    {
        
    }
	
	protected Object readResolve() {
		return instance;
	}

}
