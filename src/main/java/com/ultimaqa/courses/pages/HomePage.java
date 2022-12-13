package com.ultimaqa.courses.pages;

import com.aventstack.extentreports.Status;
import com.ultimaqa.courses.customlisteners.CustomListeners;
import com.ultimaqa.courses.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePage extends Utility {
    @CacheLookup
    @FindBy

    (xpath = "//a[contains(text(),'Sign In')]")
   WebElement clickOnSignInLink;

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Welcome Back!')]")

    WebElement verifyTextMessage;

    @CacheLookup
    @FindBy
            (id = "user[email]")
    WebElement clickOnEmailField;

    @CacheLookup
    @FindBy
            (id = "user[password]")
    WebElement clickOnPasswordField;


    public void setClickOnSignInLink() {
        Reporter.log("Click On SignInLink:"+clickOnSignInLink.toString());
        clickOnElement(clickOnSignInLink);
        CustomListeners.test.log(Status.PASS, "Click on signInLink");
    }

    public String getVerifyTextMessage() {
        Reporter.log("Verify Text Message: "+verifyTextMessage.toString());
        return getTextFromElement(verifyTextMessage);

    }

    public void emailField(String email) {
        Reporter.log("Click on Email field:"+email.toString());
        sendTextToElement(clickOnEmailField, email);
        CustomListeners.test.log(Status.PASS,"Enter Username " + email);
    }

    public void passwordField(String password) {
        Reporter.log("Click on Email field:"+password.toString());
        sendTextToElement(clickOnPasswordField, password);
        CustomListeners.test.log(Status.PASS,"Enter password " + password);
    }

}







