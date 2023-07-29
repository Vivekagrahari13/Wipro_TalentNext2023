package com.wipro.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.wipro.task.DailyTasks;

public class TestCheckPresence {
//Vivek Agrahari
	@Test
	public void testCheckPresence_WithPresentString() {
		DailyTasks dailyTasks = new DailyTasks();
		String str = "Hello World";
		String a = "Hello";

		boolean result = dailyTasks.checkPresence(str, a);
		Assertions.assertTrue(result);
	}

	@Test
	public void testCheckPresence_WithAbsentString() {
		DailyTasks dailyTasks = new DailyTasks();
		String str = "Hello World";
		String a = "Java";

		boolean result = dailyTasks.checkPresence(str, a);
		Assertions.assertFalse(result);
	}
}
