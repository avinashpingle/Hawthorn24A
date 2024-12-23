package com.testingshastra.stepdefinitions;

import org.apache.log4j.Logger;
import com.testingshastra.base.Keyword;
import com.testingshastra.utils.App;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	private static final Logger LOG = Logger.getLogger(Hooks.class);
	
	@Before(order = 0)
	public void setUp() throws Exception {
		Keyword.openBrowser(App.getBrowserName());
		Keyword.launchUrl(App.getAppUrl("qa"));
		LOG.info("Browser and Url is launched");
	}
	
	@After
	public void tearDown() throws Exception {
		Keyword.driver.quit();
		LOG.info("Browser is closed successfully..!");
	}
}
