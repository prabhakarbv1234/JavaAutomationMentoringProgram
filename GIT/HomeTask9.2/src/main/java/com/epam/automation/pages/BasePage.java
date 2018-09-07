package com.epam.automation.pages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasePage {

	private WebDriver driver;
	private static final String GIT_HUB_BASEURL = "http://www.github.com";
	private static final String USER_NAME = "GITAUTO";
	private static final String PASS_WORD = "GITHUB@123";

	public BasePage(WebDriver driver) {
		this.driver = driver;
	}

	public String getUsername() {
		return USER_NAME;
	}

	public String getPassword() {
		return PASS_WORD;
	}

	public BasePage launchBrowser() {
		this.driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return new BasePage(driver);
	}

	public StartPage openApplication() {
		driver.get(GIT_HUB_BASEURL);
		return new StartPage(driver);
	}

	public void teardown() {
		driver.quit();
	}

}
