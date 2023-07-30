/*Problem

Write a program to check if the program has received command line arguments or not.

If the program has not received arguments then print "No Values", else print all the values in a single line separated by, (comma)

Examplel) java Example O/P: No values

S

If Statement

3

Example2) java Example Mumbai Bangalore O/P: Mumbai, Bangalore

[Hint: You can use length property of an array to check, its length]*/

package com.flowcontrol.assignments;

public class CheckArguments {

	public static void main(String[] args) {
		if (args.length == 0)
			System.out.println("No values");
		else {
			String a = args[0];
			System.out.println(a);
		}
	}
}
