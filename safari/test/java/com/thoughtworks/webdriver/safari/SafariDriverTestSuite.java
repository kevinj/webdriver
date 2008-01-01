package com.thoughtworks.webdriver.safari;

import junit.framework.Test;

import com.thoughtworks.webdriver.TestSuiteBuilder;

public class SafariDriverTestSuite {
	public static Test suite() {
		return new TestSuiteBuilder()
					.addSourceDir("common")
					.addSourceDir("safari")
					.usingDriver(SafariDriver.class)
					.exclude("safari")
					.keepDriverInstance()
					.includeJavascriptTests()
					.create();
	}
}
