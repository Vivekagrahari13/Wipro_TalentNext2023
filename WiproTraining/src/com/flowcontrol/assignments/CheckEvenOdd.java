/*Problem Statement
Write a program to check if a given integer number is odd or even.*/
package com.flowcontrol.assignments;

public class CheckEvenOdd {

	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		if (num % 2 == 0)
			System.out.println(num + " is an Even");
		else
			System.out.println(num + " is an Odd");
	}

}
