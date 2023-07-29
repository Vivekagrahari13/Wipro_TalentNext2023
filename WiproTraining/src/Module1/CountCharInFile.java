package Module1;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class CountCharInFile {
//By Vivek Agrahari
	public static int countCharacterInFile(String fileName, char character) {
		int count = 0;
		try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
			int ch;
			while ((ch = reader.read()) != -1) {
				// Convert character to lowercase for case-insensitivity
				if (Character.toLowerCase((char) ch) == Character.toLowerCase(character)) {
					count++;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String fileName = "abc.txt";
		System.out.println("Enter the character to be counted:");
		char charToCount = scanner.nextLine().charAt(0);

		int count = countCharacterInFile(fileName, charToCount);

		if (count == 0) {
			System.out.println("Character not found in the file.");
		} else {
			System.out.println("File '" + fileName + "' has " + count + " instances of letter '" + charToCount + "'.");
		}
	}
}
