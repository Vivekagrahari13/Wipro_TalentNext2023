package com.wipro.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.wipro.task.DailyTasks;

public class TestSort {
//Vivek Agrahari
	@Test
	public void testSortValues() {
		DailyTasks dailyTasks = new DailyTasks();
		int[] inputArray = { 5, 2, 8, 1, 9 };
		int[] expectedSortedArray = { 1, 2, 5, 8, 9 };

		int[] result = dailyTasks.sortValues(inputArray);
		Assertions.assertArrayEquals(expectedSortedArray, result);
		for (Integer a : result) {
			System.out.println(a + " ");
		}

	}
}
