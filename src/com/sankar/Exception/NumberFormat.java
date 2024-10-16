package com.sankar.Exception;

import java.util.Scanner;

public class NumberFormat {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a number: ");
		int n=0;
		while(true) {
			try {
			String s=scn.next();
			n=Integer.parseInt(s);
			break;
			}
			catch(NumberFormatException e) {
				System.out.println("wrong input, please enter number");
			}
		}
		System.out.println("n="+n);
		
	}
}