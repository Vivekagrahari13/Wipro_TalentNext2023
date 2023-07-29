package com.wipro.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.wipro.task.DailyTasks;
//Vivek Agrahari
public class TestStringConcat {

	@Test
	public void testDoStringConcat() {
		DailyTasks dailyTasks = new DailyTasks();
		String result = dailyTasks.doStringConcat("Hello", "World");
		Assertions.assertEquals("Hello World", result);
	}
}