package com.actitime.qa.util;

import com.actitime.qa.testbase.TestBase;

public class TestUtil extends TestBase {

	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 10;
	
	public void validateTitleofPage() {
		driver.getTitle();
	}
	
}
