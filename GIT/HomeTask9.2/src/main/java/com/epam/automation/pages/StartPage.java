package com.epam.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.epam.automation.pages.BasePage;

public class StartPage extends BasePage{

    @FindBy(xpath = "//a[text()='Sign in']")
    private WebElement signInButton;

    private WebDriver driver;

    public StartPage(WebDriver driver) {
    	super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public SignInPage invokeSignIn() {
        signInButton.click();
        return new SignInPage(driver);
    }
}
