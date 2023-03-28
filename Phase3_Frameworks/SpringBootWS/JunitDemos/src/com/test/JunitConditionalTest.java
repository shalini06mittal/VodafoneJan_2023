package com.test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

public class JunitConditionalTest {

	@Test
	@EnabledOnOs(OS.MAC)
	void testForMacOS()
	{
		assertEquals("on mac","on mac");
	}
	@Test
	@EnabledOnOs(OS.WINDOWS)
	void testForWindowsOS()
	{
		assertEquals("on windows","on windows");
	}
	@Test
	@EnabledOnJre(JRE.JAVA_8)
	void testForJRE8()
	{
		assertEquals("on 8","on 8");
	}
	@Test
	@EnabledOnJre(JRE.JAVA_11)
	void testForJRE11()
	{
		assertEquals("on 11","on 11");
	}
}
