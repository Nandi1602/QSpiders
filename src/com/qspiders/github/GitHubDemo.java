package com.qspiders.github;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GitHubDemo {
	
	@Test
	public void testA()
	{
		Reporter.log("running testA method");
		Reporter.log("running testA method2");
	}
	@Test
	public void testB()
	{
		Reporter.log("running testB method");
		Reporter.log("running testB method");
	}
	
}
