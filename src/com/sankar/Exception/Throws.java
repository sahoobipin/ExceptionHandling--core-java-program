package com.sankar.Exception;

class A extends Exception
{
	
}
public class Throws {
	public static void main(String[] args) {
		System.out.println("main starts");
		try {
			m1();
		}catch(A e) {
			System.out.println("catch");
		}
	}
	static void m1() throws A
	{
		System.out.println("m1 starts");
		throw new A();
	}
}
