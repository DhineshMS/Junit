package org.packag;

import org.testng.annotations.Test;

public class C {
	@Test
	private void test1()
	{
		System.err.println("TestC1");
	}
	@Test()
	private void test2()
	{
		System.out.println("TestC2");
	}
}
