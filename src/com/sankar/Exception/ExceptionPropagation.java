package com.sankar.Exception;

public class ExceptionPropagation {
	public static void main(String[] args) {
		System.out.println("main starts");
		m1();
		System.out.println("main ends");
	}
	public static void m1() {
		System.out.println("m1() starts");
		try {
		m2();
		}catch(ArithmeticException e) {
			System.out.println("Exception handled");
		}
		System.out.println("m1() ends");
	}
	public static void m2() {
		System.out.println("m2() starts");
		int a=10/0;
		System.out.println("m2() ends");
	}
}