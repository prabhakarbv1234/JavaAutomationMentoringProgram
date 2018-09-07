
package com.epam.automation.tests;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.epam.automation.pages.BasePage;
import com.epam.automation.pages.HomePage;
import com.epam.automation.pages.SignInPage;
import com.epam.automation.pages.StartPage;


public class Test1 {

    private WebDriver driver;
    
    @Test
    public void testOneCanLoginGithub(){	
    	BasePage basePage = new BasePage(driver);
    	StartPage startPage= basePage.launchBrowser().openApplication();
        SignInPage signInPage = startPage.invokeSignIn();
        HomePage homePage = signInPage.signIn(basePage.getUsername(), basePage.getPassword());
        String loggedInUserName = homePage.getLoggedInUserName();
        Assert.assertEquals(basePage.getUsername(), loggedInUserName);   
        basePage.teardown();
    }
}
