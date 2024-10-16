package com.sankar.Exception;

public class nullPointerException {
	public static void main(String[] args) {
		String s=null;
		int n=0;
		try {
			n=s.length();
		}catch(NullPointerException e) {
			System.out.println("handled");
		}
		System.out.println(n);
	}
}
