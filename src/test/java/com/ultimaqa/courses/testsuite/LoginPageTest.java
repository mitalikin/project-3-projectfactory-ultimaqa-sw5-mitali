package com.ultimaqa.courses.testsuite;

import com.ultimaqa.courses.customlisteners.CustomListeners;
import com.ultimaqa.courses.pages.HomePage;
import com.ultimaqa.courses.pages.LoginPage;
import com.ultimaqa.courses.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListeners.class)

public class LoginPageTest extends BaseTest {

    LoginPage loginPage;
    HomePage homePage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        loginPage = new LoginPage();
        homePage = new HomePage();
    }

    @Test(groups = {"smoke","regression"})
    public void verifyTheErrorMessage() {
        //* click on the ‘Sign In’ link
        homePage.setClickOnSignInLink();
        //Enter invalid username
        loginPage.enterEmail("123abc@gmail.com");
        // Enter invalid password
        loginPage.enterPassword("abc123");
        //Click on Login button
        loginPage.clickOnSignIn();
        // * Verify the error message ‘Invalid email or password.
        String expectedMessage = "Invalid email or password.";
        Assert.assertEquals(loginPage.getVerifyTextMessage1(), expectedMessage, "Message is not displayed");


    }
}