/*Problem Statement
A) Write a program to check if a given integer number is Positive, Negative, or Zero.*/
package com.flowcontrol.assignments;

public class CheckPosNeg {

	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		if (a > 0)
			System.out.println("Positive");
		else if (a < 0)
			System.out.println("Negative");
		else
			System.out.println("Zero");
	}

}
