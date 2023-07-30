/*Write a Program that accepts two Strings as command line arguments and generate the output in the required format.

Status

1

Topics Covered

Example1)

If the two command line arguments are Wipro and Bangalore then the output generated should be Wipro Technologies Bangalore.

M

Example2)

If the command line arguments are ABC and Mumbai then the output generated should be

Command Line Argument

ABC Technologies Mumbai

[Note: It is mandatory to pass two arguments in command line]*/

package LanguageBasics;

public class LangBasics_1 {

	public static void main(String[] args) {
		String s1=args[0];
		String s2=args[1];
		System.out.println("Result: "+(s1+" Technologies "+s2));

	}

}
