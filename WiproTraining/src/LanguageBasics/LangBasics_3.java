/*Write a Program that accept  two integer as command line arguments and print the sum of the two numbers.
Sample: 10 20
Sample Output: The sum of 10 and 20 is 30

Sample: 5 9 
Sample Output: The sum of 5 and 9 is 14

[Note: It is mandatory to pass an argument in command line]*/

package LanguageBasics;

public class LangBasics_3 {

	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		System.out.println("The sum of "+a+" and "+b+" is "+(a+b));
	}

}
