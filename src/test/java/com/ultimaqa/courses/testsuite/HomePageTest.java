package com.ultimaqa.courses.testsuite;

import com.ultimaqa.courses.customlisteners.CustomListeners;
import com.ultimaqa.courses.pages.HomePage;
import com.ultimaqa.courses.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListeners.class)
public class HomePageTest extends BaseTest {


    HomePage homePage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
    }

    @Test(groups = {"sanity","regression"})
    public void userShouldNavigateToLoginPageSuccessfully() {
        //* click on the ‘Sign In’ link
        homePage.setClickOnSignInLink();
        // * Verify the text ‘Welcome Back!’
        String expectedErrorMessage = "Welcome Back!";
        Assert.assertEquals(homePage.getVerifyTextMessage(), expectedErrorMessage, "Error message not displayed");

    }
















}
