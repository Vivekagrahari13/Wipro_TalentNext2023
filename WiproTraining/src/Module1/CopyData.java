package Module1;

import java.io.*;

public class CopyData {
//By Nisha Singh
	public static void main(String[] args) throws IOException {
		FileInputStream fs1 = new FileInputStream("abc.txt");
		FileOutputStream fs2 = new FileOutputStream("output.txt");
		int n;
		while ((n = fs1.read()) != -1)
			fs2.write((char) n);

		fs1.close();
		fs2.close();
		System.out.println("File is Copied");
	}

}
