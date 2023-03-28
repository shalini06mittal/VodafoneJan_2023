package com.test;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.ValueSource;

import com.java.StringPalindrome;

public class ParameterizedTest {

	
	@org.junit.jupiter.params.ParameterizedTest
	@ValueSource(strings = {"racecar","dad","mom"})
	void testPalindrome(String text)
	{
		boolean actual = StringPalindrome.isPalindrome(text);
		assertTrue(actual);
	}
}
