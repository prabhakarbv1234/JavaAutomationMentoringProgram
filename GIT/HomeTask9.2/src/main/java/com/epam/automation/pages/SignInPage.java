package com.epam.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.epam.automation.model.User;




public class SignInPage {


    @FindBy(id = "login_field")
    private WebElement usernameField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(xpath = "//input[@value='Sign in']")
    private WebElement buttonSubmit;

    private WebDriver driver;

    public SignInPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public HomePage signIn(String username, String password){
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        buttonSubmit.click();
        return new HomePage(driver);
    }

    public boolean isReadyToSignIn()  {
        if (buttonSubmit.isDisplayed()){
            return true;
        }
        else {
            throw new WebDriverException();
        }
    }

    public HomePage signIn(User user){
        return this.signIn(user.getUsername(),user.getPassword());
    }

}
