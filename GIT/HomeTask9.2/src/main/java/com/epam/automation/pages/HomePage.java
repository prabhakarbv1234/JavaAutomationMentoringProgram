package com.epam.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    @FindBy(xpath = "//summary[@aria-label='Switch account context']//span")
    private WebElement linkLoggedInUser;    
    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public String getLoggedInUserName() {
        return linkLoggedInUser.getText();
    }

    public boolean hasUserLoggedIn(){
		return linkLoggedInUser.getText() != "" ? true:false;       
}
}