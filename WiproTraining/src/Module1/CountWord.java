package Module1;

import java.io.*;
import java.util.*;

public class CountWord {
	// By Nisha Singh
	public static void main(String[] args) {
		String inputFileName = "inputFile.txt";
		String outputFileName = "outputFile.txt";

		Map<String, Integer> wordCountMap = new TreeMap<>();

		try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName))) {
			String line;
			while ((line = reader.readLine()) != null) {
				String[] words = line.split("\\s+");
				for (String word : words) {
					wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName))) {
			for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
				writer.write(entry.getKey() + " : " + entry.getValue());
				writer.newLine();
			}
			System.out.println("Word count written to " + outputFileName + " successfully.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
