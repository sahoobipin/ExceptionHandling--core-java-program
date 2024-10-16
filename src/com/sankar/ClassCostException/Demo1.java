package com.sankar.ClassCostException;

public class Demo1 {
	public static void main(String[] args) {
		System.out.println("main start");
		try {
			System.out.println(10/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Handled");
		}
		System.out.println("main end");
	}
}
