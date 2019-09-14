package ru.cfif11.spsuace.helloworld;

import orj.junit.Assert;
import org.junit.Test;


public class MainTest {
	@Test
	public void testHello() {
		Assert.assertEquals("Hello world!", Main.hello());
	}
}
