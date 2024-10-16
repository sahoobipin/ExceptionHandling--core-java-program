package com.sankar.Exception;

public class PrintTrackStrace {
	public static void main(String[] args) {
		System.out.println("main() starts");
		try {
			int a=100/0;
		}catch(ArithmeticException e) {
			e.printStackTrace();
			//System.out.println("hadled");
		}
		System.out.println("main() ends");
	}
}
