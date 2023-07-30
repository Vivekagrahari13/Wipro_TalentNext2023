/*Problem Statement:
	
	B) Given two non-negative int values, print true if they have the same last digit, such as with 27 and 57.
	lastDigit (7, 17) →true
	If Statement
	lastDigit(6, 17) false
	lastDigit(3, 113) true
*/

package com.flowcontrol.assignments;

public class IsSameLastDigit {

	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		if (a % 10 == b % 10)
			System.out.println("true");
		else
			System.out.println("false");
	}

}
