package Module1;

import java.util.*;

public class RangeNumToBinary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		while (a <= b) {
			System.out.println("Binary of " + a + " is " + Integer.toBinaryString(a));
			a++;
		}
	}

}
