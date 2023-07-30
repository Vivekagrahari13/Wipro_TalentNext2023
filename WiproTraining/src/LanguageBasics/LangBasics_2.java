/*Write a Program that accepts a String as command line arguments and print a welcome message as shown below
Sample Input: John
Output: Welcome John

Sample Input: Vivek
Output: Welcome Vivek

[Note: It is mandatory to pass an argument in command line]*/

package LanguageBasics;

public class LangBasics_2 {

	public static void main(String[] args) {
		String s1 = args[0];

		System.out.println("Welcome " + s1);
	}

}
